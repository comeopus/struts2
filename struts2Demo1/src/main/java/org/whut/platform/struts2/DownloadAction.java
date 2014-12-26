package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-15
 * Time: 下午3:22
 * To change this template use File | Settings | File Templates.
 */
public class DownloadAction extends ActionSupport {

    public InputStream getDownloadFile(){
        return ServletActionContext.getServletContext().getResourceAsStream("/upload/readMe.txt");
    }
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
