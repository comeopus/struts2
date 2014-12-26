package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-15
 * Time: 上午10:54
 * To change this template use File | Settings | File Templates.
 */
public class UploadAction2 extends ActionSupport {

    private String username;
    private List<File> file;
    private List<String> fileFileName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }

    public List<String> getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(List<String> fileFileName) {
        this.fileFileName = fileFileName;
    }

    @Override
    public String execute() throws Exception {
        for(int i=0;i<file.size();i++){
            InputStream is = new FileInputStream(file.get(i));

            String root = ServletActionContext.getRequest().getRealPath("/upload");
            OutputStream os = new FileOutputStream(new File(root,fileFileName.get(i)));

            byte[] buffer = new byte[400];
            int length=0;
            while((length=is.read(buffer))!=-1){
                os.write(buffer,0,length);
            }

            is.close();
            os.close();
        }
        return SUCCESS;

    }
}
