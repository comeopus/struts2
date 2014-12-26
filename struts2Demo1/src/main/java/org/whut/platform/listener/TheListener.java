package org.whut.platform.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-13
 * Time: 下午4:24
 * To change this template use File | Settings | File Templates.
 */
public class TheListener implements PreResultListener {
    @Override
    public void beforeResult(ActionInvocation invocation, String resultCode) {
        System.out.println("result Code: " + resultCode);
    }
}
