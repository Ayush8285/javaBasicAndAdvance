<%@page import="java.util.Random,java.util.ArrayList,java.io.*"%>

<html>
    <body>

        <%@include file="index.jsp" %>

        <h1>Random number :
        <%
            Random r = new Random();
            int n = r.nextInt(10);
        %>

        <%= n %>
        </h1>

    </body


</html