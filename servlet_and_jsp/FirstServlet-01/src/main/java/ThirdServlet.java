import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//third way of creating servlet using extends HttpServlet
public class ThirdServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("This is get method....");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> this is third servlet using HTTpServlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //code
    }

}
