package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.whut.platform.bean.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-6
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public class UserAction2 extends ActionSupport {

    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        for(User u:user){
            System.out.println("username: " + u.getUsername() + ", password: " + u.getPassword() );
        }
        return SUCCESS;
    }
}
