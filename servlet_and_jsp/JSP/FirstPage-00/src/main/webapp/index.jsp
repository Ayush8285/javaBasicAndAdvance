<html>
    <body>
        <h2>Hello World!</h2>

        <%!
            int a = 19;
            int b =  37;

            public int doSum(){
                return a +b;
            }
        %>

        <%
            out.println("Sum is :" +doSum());
            out.println("<br>");
            out.println(b);

        %>

        <h1>Sum is : <%= doSum() %> </h1>
    </body>
</html>
