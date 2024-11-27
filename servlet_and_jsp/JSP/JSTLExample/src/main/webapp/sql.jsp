<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page import="java.lang.*" %>

<html>
<head>
    <title>JSTL SQL Example</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <h1>This is a JSTL SQL Example</h1>

    <%
        // Retrieve environment variables for database credentials
        String dbUser = System.getenv("MYSQL_USER");
        String dbPass = System.getenv("MYSQL_PASS");
    %>

    <sql:setDataSource
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/students"
        user="<%= dbUser %>"
        password="<%= dbPass %>"
        var="ds" />

    <sql:query dataSource="${ds}" var="rs">
        SELECT * FROM students.accounts;
    </sql:query>

    <table class="table">
        <tr>
            <th>Account Number</th>
            <th>Balance</th>
        </tr>

        <c:forEach items="${rs.rows}" var="row">
            <tr>
                <td><c:out value="${row.account_number}" /></td>
                <td><c:out value="${row.balance}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
