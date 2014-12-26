package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-15
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */

/**
 * 动态的下载文件
 */
public class DownloadAction2 extends ActionSupport {

    private int number;
    private String filename;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public InputStream getDownloadFile(){
        try{
            if(1==number){
                this.filename="知识点.txt";
                /*解决文件名为中文的情况*/
                this.filename = new String(this.filename.getBytes("gbk"),"8859_1");
                return ServletActionContext.getServletContext().getResourceAsStream("/upload/知识点.txt");
            }
            else {
                this.filename="jquery.PrintArea.js";
                return ServletActionContext.getServletContext().getResourceAsStream("/upload/jquery.PrintArea.js");
            }
        }catch (Exception ex){

        }
        return null;

    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
