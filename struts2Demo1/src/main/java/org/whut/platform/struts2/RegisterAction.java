package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;


import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-10
 * Time: 下午2:52
 * To change this template use File | Settings | File Templates.
 */
public class RegisterAction extends ActionSupport {

    private String username;
    private String password;
    private String repassword;
    private int age;
    private Date birthday;
    private Date graduation;

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

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getGraduation() {
        return graduation;
    }

    public void setGraduation(Date graduation) {
        this.graduation = graduation;
    }

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }

    /**
     * 执行流程：
     1） 首先进行类型转换
     2） 然后进行输入校验（执行 validate 方法）
     3） 如果在上述过程中出现了任何错误，都不会再去执行 execute
     方法，会转向 struts.xml 中该 action 的名为 input 的 result 所对
     应的页面。
     当发生类型转换错误的时候，会将错误放在fieldError级别的错误中而不是ActionError级别
     */
 /*   @Override
    public void validate() {
        //验证用户名
        if(null == username|| username.length()<4|| username.length()>6){
            this.addActionError("username invalid!");

            //filed级别的错误

            this.addFieldError("username","\u7528\u6237\u540d\u4e0d\u5408\u6cd5\uff01");
        }
        //验证密码
        if(null == password || password.length()<4 || password.length()>6){
            this.addActionError("password invalid");
        }
        else if(null == repassword || repassword.length()<4 || repassword.length()>6){
            this.addActionError("repassword invalid");
        }
        else if(!password.equals(repassword)){
            this.addActionError("password and repassword are not same");
        }

        if(age<10 || age>50){
            this.addActionError("age invalid");
        }

        if(null ==birthday){
            this.addActionError("birthday");
        }
        if(null ==graduation){
            this.addActionError("graduation");
        }
        if(null !=birthday && null !=graduation){
            Calendar c1 = Calendar.getInstance();
            c1.setTime(birthday);

            Calendar c2 = Calendar.getInstance();
            c2.setTime(graduation);

            if(! c1.before(c2)){
                this.addActionError("birthday should be before graduation");
            }
        }
    }  */
}
