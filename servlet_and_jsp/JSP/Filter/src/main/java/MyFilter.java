import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Before Servlet");
        //....
        //....
        chain.doFilter(request,response);  //request go to servlet
        //....
        //....
        System.out.println("After Servlet");
    }

    @Override
    public void destroy() {

    }
}
