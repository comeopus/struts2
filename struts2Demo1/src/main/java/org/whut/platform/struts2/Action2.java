package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-12
 * Time: 下午9:17
 * To change this template use File | Settings | File Templates.
 */
public class Action2 extends ActionSupport{

    private String username;
    private String password;
    private String nameAndPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameAndPassword() {
        return nameAndPassword;
    }

    public void setNameAndPassword(String nameAndPassword) {
        this.nameAndPassword = nameAndPassword;
    }

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }
}
