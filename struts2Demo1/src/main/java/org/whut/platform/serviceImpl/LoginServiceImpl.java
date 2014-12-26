package org.whut.platform.serviceImpl;

import org.whut.platform.service.LoginService;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-12
 * Time: 下午2:47
 * To change this template use File | Settings | File Templates.
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean isLogin(String username, String password) {
        if("hello".equals(username)&&"world".equals(password)){
            return true;
        }
        return false;
    }
}
