package org.whut.platform.action.ognl;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-19
 * Time: 上午10:13
 * To change this template use File | Settings | File Templates.
 */
public class OgnlAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {

    private String username;
    private String password;

    private Map<String,Object> sessionMap;
    private Map<String,Object> requestMap;
    private Map<String,Object> applicationMap;

    private List<Person> list;

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

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

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public Map<String, Object> getRequestMap() {
        return requestMap;
    }

    public void setRequestMap(Map<String, Object> requestMap) {
        this.requestMap = requestMap;
    }

    public Map<String, Object> getApplicationMap() {
        return applicationMap;
    }

    public void setApplicationMap(Map<String, Object> applicationMap) {
        this.applicationMap = applicationMap;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.applicationMap = application;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        //To change body of implemented methods use File | Settings | File Templates.
        this.requestMap = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        //To change body of implemented methods use File | Settings | File Templates.
        this.sessionMap = session;
    }

    @Override
    public String execute() throws Exception {

        requestMap.put("hello","hello");
        sessionMap.put("hello","world");
        applicationMap.put("hello","hello world");

        Cat cat1 = new Cat("cat1",20,"red");
        Cat cat2 = new Cat("cat2",20,"blue");

        String[] friend1 = {"test1","test2","test3"};
        String[] friend2 = {"welcome1","welcome2","welcome3"};

        Map<String,String> map1 = new HashMap<String, String>();
        Map<String,String> map2 = new HashMap<String, String>();

        map1.put("test1","test1");
        map1.put("test2","test2");

        map2.put("hello1","hello1");
        map2.put("hello2","hello2");

        Person person1 = new Person("zhangsan",20,"beijing",friend1,cat1,map1);
        Person person2 = new Person("lisi",30,"shanghai",friend2,cat2,map2);


        list = new ArrayList<Person>();
        list.add(person1);
        list.add(person2);


        return SUCCESS;
    }
}
