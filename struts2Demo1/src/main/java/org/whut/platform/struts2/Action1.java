package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-12
 * Time: 下午9:16
 * To change this template use File | Settings | File Templates.
 */
public class Action1 extends ActionSupport {

    private String username;
    private String password;
    private String usernameAndPassword;

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

    public String getUsernameAndPassword() {
        return usernameAndPassword;
    }

    public void setUsernameAndPassword(String usernameAndPassword) {
        this.usernameAndPassword = usernameAndPassword;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("execute invoked!!");
        this.usernameAndPassword = this.username + this.password;
        return SUCCESS;
    }
    public String myExecute(){
        System.out.println("myExecute invoked");
        return SUCCESS;
    }
}
