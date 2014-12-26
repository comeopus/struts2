package org.whut.platform.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-13
 * Time: 下午3:31
 * To change this template use File | Settings | File Templates.
 */
public class TheInterceptor2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("Interceptor before");
        System.out.println("interceptor2: " + invocation.getAction().getClass());
        String result = invocation.invoke();
        System.out.println("Interceptor after");
        return result;
    }
}
