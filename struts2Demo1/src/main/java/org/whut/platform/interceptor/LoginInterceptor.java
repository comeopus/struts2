package org.whut.platform.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.whut.platform.struts2.LoginAction;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-13
 * Time: 下午4:29
 * To change this template use File | Settings | File Templates.
 */
public class LoginInterceptor extends AbstractInterceptor {

    /*
    *@SuppressWarnings。该批注的作用是给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默。
    *SuppressWarnings("unchecked")执行了未检查的转换时的警告，例如当使用集合时没有用泛型 (Generics) 来指定集合保存的类型
    */
    @Override
    @SuppressWarnings("unchecked")
    public String intercept(ActionInvocation invocation) throws Exception {

        /**
         * 登陆的界面不需要拦截   应该将它排除在外
         * 所采用的办法是通过invocation来得到其关联的action   当
         * 该action等于loginAction时就直接往下执行，而不进行判断
         */
        if (LoginAction.class == invocation.getAction().getClass()){
            return invocation.invoke();
        }
        Map map = invocation.getInvocationContext().getSession();

        if(null == map.get("userInfo"))
        {
            return Action.LOGIN;
        }
        return invocation.invoke();
    }
}
