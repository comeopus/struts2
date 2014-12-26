package org.whut.platform.action.json;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.whut.platform.action.xml.People;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-15
 * Time: 下午9:03
 * To change this template use File | Settings | File Templates.
 */
public class GetJsonAction  extends ActionSupport{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        People people = new People();

        people.setId(1);
        people.setName(name);
        people.setAddress("beijing");
        people.setAge(30);

        Gson gson = new Gson();

        String result = gson.toJson(people);

        HttpServletResponse response = ServletActionContext.getResponse();

        response.setContentType("application/json;charset=utf-8");
        response.setHeader("cache-control","no-cache");

        PrintWriter out = response.getWriter();

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");

        XMLWriter writer = new XMLWriter(out,format);
        writer.write(result);
        out.flush();
        out.close();
        return  null;
    }
}
