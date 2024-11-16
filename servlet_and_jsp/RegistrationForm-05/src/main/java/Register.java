import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@MultipartConfig
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        //getting all incoming details

        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");

        //part is used to store image type content or say form type data
        Part part = req.getPart("image");

        String fileName = part.getSubmittedFileName();
//        out.println(fileName);
//        out.println(name+"  " +password+ " " + email);


            //connection with DB
        try{
            Thread.sleep(3000);

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/formservlet",
                    System.getenv("MYSQL_USER"),System.getenv("MYSQL_PW"));

            //query
            String query = "insert into user(name,password,email,imageName) values(?,?,?,?);";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4, fileName);

            preparedStatement.executeUpdate();

            //upload file...
            InputStream is = part.getInputStream();
            byte[] data = new byte[is.available()];

            is.read(data);
            String path = req.getRealPath("/") + "img"+ File.separator+fileName;
//            out.println(path);

            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();

            out.println("done");


        }catch (Exception e){
            e.printStackTrace();
            out.println("error");
        }


    }
}
