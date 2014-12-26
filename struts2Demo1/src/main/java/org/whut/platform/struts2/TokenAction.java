package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-13
 * Time: 上午10:28
 * To change this template use File | Settings | File Templates.
 */
public class TokenAction extends ActionSupport {

    private String username;
    private String password;

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

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
