import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//first way of creating servlet using implements Servlet

public class MyServlet implements Servlet {
    ServletConfig servletConfig;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig=servletConfig;
        System.out.println("object create...");

    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servicing....");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my output from servlet response:</h1>");
        out.println("<h1>Today's date and time is " + new Date().toString() +"</h1>");
    }

    @Override
    public String getServletInfo() {
        return "this is first servlet";
    }

    @Override
    public void destroy() {
        System.out.println("destroy the servlet object");
    }
}
