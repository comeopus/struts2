package org.whut.platform.converter;

import ognl.DefaultTypeConverter;
import org.whut.platform.bean.User;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-5
 * Time: 下午5:00
 * To change this template use File | Settings | File Templates.
 */
public class UserConverter extends DefaultTypeConverter {

    @Override
    public Object convertValue(Map context, Object value, Class toType)
    {
        if(User.class == toType)  //从页面向后台对象转换
        {
            String[] str = (String[])value;

            String firstValue = str[0];

            StringTokenizer st = new StringTokenizer(firstValue, ";");

            String username = st.nextToken();
            String password = st.nextToken();

            User user = new User();

            user.setUsername(username);
            user.setPassword(password);

            return user;
        }
        else if(String.class ==toType){
            User user = (User)value;
            String username = user.getUsername();
            String password = user.getPassword();

            String userInfo = "username :" + username + ",password: " + password;
            return  userInfo;
        }
        return null;
    }
}
