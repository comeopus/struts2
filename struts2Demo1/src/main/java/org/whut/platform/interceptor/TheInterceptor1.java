package org.whut.platform.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-13
 * Time: 下午2:49
 * To change this template use File | Settings | File Templates.
 */
public class TheInterceptor1 implements Interceptor {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        System.out.println("setTest invoked");
        this.test = test;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init() {
        System.out.println("init invoked");
        System.out.println("test: " + this.test);
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("before");
        System.out.println("interceptor1: " + invocation.getAction().getClass());
        String result = invocation.invoke();
        System.out.println("after");
        return result;
    }
}
