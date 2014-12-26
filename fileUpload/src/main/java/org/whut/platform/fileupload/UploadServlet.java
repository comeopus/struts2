package org.whut.platform.fileupload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-14
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 */
public class UploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();

        String path = req.getRealPath("/upload");
        System.out.println(path);

        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024);
        ServletFileUpload upload = new ServletFileUpload(factory);

        try {
            List<FileItem> list = (List<FileItem>)upload.parseRequest(req);

            for(FileItem item:list){
                // 判断某项是否是普通的表单类型
                String name = item.getFieldName();
                if(item.isFormField()){

                    String value = item.getString();
                    System.out.println(name + "=" + value);
                    req.setAttribute(name,value);
                }
                else {
                    String value = item.getName();

                    int start = value.lastIndexOf("\\");
                    String fileName = value.substring(start + 1);
                    req.setAttribute(name,fileName);
                    System.out.println(name + "=" + fileName);
                    item.write(new File(path,fileName));
//                    OutputStream os = new FileOutputStream(new File(path,fileName));
//                    InputStream is = item.getInputStream();
//
//                    byte[] buffer= new byte[400];
//                    int length = 0;
//                    while((length = is.read(buffer)) != -1){
//                         os.write(buffer,0,length);
//                    }
//                    is.close();
//                    os.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        req.getRequestDispatcher("fileUploadResult.jsp").forward(req,resp);
    }
}
