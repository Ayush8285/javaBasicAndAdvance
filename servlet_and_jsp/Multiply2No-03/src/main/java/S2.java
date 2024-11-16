import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2> welcome to Servlet S2</h2>");

        int nn1=Integer.parseInt(request.getParameter("n1"));
        int nn2=Integer.parseInt(request.getParameter("n2"));


        int p =nn1 * nn2;


        //get attribute from request object....

        int sum = (int)request.getAttribute("sum");

        out.println("<h1>");

        out.println("Sum is :" +sum);
        out.println("Product is :" +p );
        out.println("</h1> ");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }
}
