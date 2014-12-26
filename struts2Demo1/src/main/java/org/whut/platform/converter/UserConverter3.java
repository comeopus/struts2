package org.whut.platform.converter;

import org.apache.struts2.util.StrutsTypeConverter;
import org.whut.platform.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-6
 * Time: 上午9:43
 * To change this template use File | Settings | File Templates.
 */
public class UserConverter3 extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {

        List<User> list = new ArrayList<User>();

        for(String string:strings){
            StringTokenizer st = new StringTokenizer(string,";");

            User user = new User();
            user.setUsername(st.nextToken());
            user.setPassword(st.nextToken());
            list.add(user);
        }
        return list;

    }

    @Override
    public String convertToString(Map map, Object o) {
         List<User> list = (List<User>) o;
        StringBuffer sb = new StringBuffer();

        for(User user:list){
            String username = user.getUsername();
            String password = user.getPassword();
            sb.append("username: ").append(username).append(" ,password: ").append(password)
                    .append(" ");
        }
        return sb.toString();
    }
}
