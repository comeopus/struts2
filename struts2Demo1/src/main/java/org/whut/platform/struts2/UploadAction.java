package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-15
 * Time: 上午9:51
 * To change this template use File | Settings | File Templates.
 */
public class UploadAction extends ActionSupport {

    private String username;
    private File file;
    private String fileFileName;
    private String fileContentType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    @Override
    public String execute() throws Exception {
        String root = ServletActionContext.getRequest().getRealPath("/upload");
        System.out.println("file: " + file);
        System.out.println("fileFileName: " + fileFileName);
        InputStream is = new FileInputStream(file);

        OutputStream os = new FileOutputStream(new File(root,fileFileName));

        byte[] buffer = new byte[400];
        int length = 0;
        while ((length = is.read(buffer)) != -1){
            os.write(buffer,0,length);
            Thread.sleep(1000);
        }
        is.close();
        os.close();
        return SUCCESS;
    }
}
