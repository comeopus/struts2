package org.whut.platform.action.ognl;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-19
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
public class Cat {

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
