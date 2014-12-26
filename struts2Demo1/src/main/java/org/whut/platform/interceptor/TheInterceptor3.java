package org.whut.platform.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.whut.platform.listener.TheListener;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-13
 * Time: 下午3:54
 * To change this template use File | Settings | File Templates.
 */
public class TheInterceptor3 extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        invocation.addPreResultListener(new TheListener());
        System.out.println("before interceptor3");
        String result = invocation.invoke();
        System.out.println("after interceptor3");
        return result;
    }
}
