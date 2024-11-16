import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//second way of creating servlet using extends GenericServlet
public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("this is servlet using GenericServlet...");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1> this is second servlet</h1>");
    }
}
