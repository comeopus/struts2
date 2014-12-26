package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.whut.platform.bean.User;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-5
 * Time: 下午5:01
 * To change this template use File | Settings | File Templates.
 */
public class UserAction extends ActionSupport
{
    private User user;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String execute() throws Exception
    {
        System.out.println("==================");
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());


        return SUCCESS;
    }
}
