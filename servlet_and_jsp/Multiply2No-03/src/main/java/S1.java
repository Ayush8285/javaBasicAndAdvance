import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2> welcome to Servlet S1</h2>");

        //parameter.....
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");

        int nn1 = Integer.parseInt(n1);
        int nn2 = Integer.parseInt(n2);

        //add
        int s = nn1 + nn2 ;

        //attribute...
        request.setAttribute("sum", s);

        //request ... request dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("S2");
        rd.forward(request, response);


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
