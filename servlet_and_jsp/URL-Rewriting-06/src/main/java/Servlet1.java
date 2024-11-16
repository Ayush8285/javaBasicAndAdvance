import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("user_name");
        out.println("<h1> Your name is :" + name + "</h1>");

        //for using url rewriting
//        out.println("<a href='servlet2?user="+name+"'> Go to second Servlet</a>");

        //for using hidden form field
        out.println(""
                +"<form action='servlet2' >"
                +"<input type='hidden' name='user' value='"+name+"' /> "
                +"<button > Go to second servlet</button>"


                +"</form>"
        );
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
