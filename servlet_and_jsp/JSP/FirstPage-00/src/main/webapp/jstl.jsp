<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<html>
    <body>

    <h1> Taglib </h1>
    <hr>
        <c:set var="name" value="Ayush" />
        <c:out value="${name}" />
        <c:out value="${23 + 56}" />
        ${name} ${23 + 56}
    </body>
</html