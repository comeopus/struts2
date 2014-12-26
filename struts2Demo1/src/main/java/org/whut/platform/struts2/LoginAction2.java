package org.whut.platform.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.whut.platform.bean.Person;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-12
 * Time: 下午3:26
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction2 extends ActionSupport implements ModelDriven<Person>,Preparable{

    private Person person = new Person();
    @Override
    public Person getModel() {
        System.out.println("getModel invoked");
        return person;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("execute invoked");
        System.out.println(person.getUsername());
        return SUCCESS;
    }

    /**
     * Preparable 接口的作用是让Action完成一些初始化工作，这些初始化工作是放在Preparable接口的prepare方法中完成的，该
     * 方法会在execute方法之前得到调用
     */
    @Override
    public void prepare() throws Exception {
        System.out.println("prepare invoked");
    }
}
