package org.whut.platform.action.json;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.json.annotations.JSON;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-15
 * Time: 下午9:17
 * To change this template use File | Settings | File Templates.
 */
public class GetJsonAction2 extends ActionSupport{

    private String name;
    private int age;
    private int id;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JSON(name="myAge")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String execute() throws Exception {
        this.id = 1;
        this.age = 30;
        this.address = "beijing";

        return SUCCESS;
    }
}
