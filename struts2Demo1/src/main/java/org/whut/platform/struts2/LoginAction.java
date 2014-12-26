package org.whut.platform.struts2;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import org.apache.struts2.convention.annotation.*;
import org.whut.platform.bean.User;
import org.whut.platform.exception.PasswordException;
import org.whut.platform.exception.UsernameException;
import org.whut.platform.service.LoginService;
import org.whut.platform.serviceImpl.LoginServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-11-11
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
/*
基于注解的配置   可以不需要struts.xml
 */
@ParentPackage("struts-default")
@Action(value="login",results = {
        @Result(name="success",location = "/result.jsp"),
        @Result(name="input",location = "/login.jsp")
})
//@InterceptorRef("defaultStack")
//@InterceptorRefs({@InterceptorRef(""),@InterceptorRef("")})
//@ExceptionMappings({@ExceptionMapping(""),@ExceptionMapping("")})
public class LoginAction extends ActionSupport{

    private String username;
    private String password;
    private int age;
    private Date date;
    private LoginService loginService = new LoginServiceImpl();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String execute() throws Exception {

/*        if(!"hello".equals(username)){
            throw new UsernameException("username invalid");
        }

        if(!"world".equals(password)){
            throw new PasswordException("password invalid");
        }
        return SUCCESS;  */
//        HttpServletRequest request =   ServletActionContext.getRequest();
//        HttpSession session =  request.getSession();
//        session.setAttribute("hello","helloworld");
//
//        ActionContext actionContext = ActionContext.getContext();
//        Map<String,Object> map = actionContext.getSession();
//        Object object = map.get("hello");
//        System.out.println(object);
        if(this.loginService.isLogin(username,password)){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            /**
             * 利用拦截器进行验证用户是否登陆
             */
            ActionContext.getContext().getSession().put("userInfo",user);
            return SUCCESS;
        }
        return INPUT;
    }
}
