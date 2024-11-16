import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //getting all the cookies
        Cookie[] cookies = request.getCookies();

        boolean f = false;
        String name = "";

        if(cookies == null){
            out.println("<h1> you are new user go to home page and submit your name</h1>");
            return;

        }else{
            for (Cookie c : cookies) {
                String tName = c.getName();
                if(tName.equals("user_name")){
                    f=true;
                    name = c.getValue();
                }
            }
        }

        if(f) {
            out.println("<h1> the, " + name + "is in servlet 2");
        }else{
            out.println("<h1> not getting what you want, means cookie is not working</h1>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }
}
