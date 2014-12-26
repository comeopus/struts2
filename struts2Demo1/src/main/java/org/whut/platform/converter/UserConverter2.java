package org.whut.platform.converter;

import org.apache.struts2.util.StrutsTypeConverter;
import org.whut.platform.bean.User;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-6
 * Time: 上午9:43
 * To change this template use File | Settings | File Templates.
 */
public class UserConverter2 extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        User user = new User();

        String value = strings[0];

        StringTokenizer st = new StringTokenizer(value,";");
        String username = st.nextToken();
        String password = st.nextToken();

        user.setUsername(username);
        user.setPassword(password);
        return user;

    }

    @Override
    public String convertToString(Map map, Object o) {
        User user = (User) o;

        String username = user.getUsername();
        String password = user.getPassword();

        String userInfo = "username: " + username + ", password: " + password;
        return userInfo;
    }
}
