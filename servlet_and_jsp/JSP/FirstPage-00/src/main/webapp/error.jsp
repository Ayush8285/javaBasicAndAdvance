<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"   %>

<%@page errorPage="error_page.jsp" %>
<html>
    <body>

    <h1> Taglib </h1>
    <hr>
        <%!
            int n1= 200;
            int n2= 0;
        %>

        <%
            int division=n1/n2;
        %>

        <h1>Division = <%= division %> </h1>

    </body>
</html