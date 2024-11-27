<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
    <h1>This is JSTL Function Example</h1>

    <c:set var="name" value="JAVA"></c:set>

    <h1><c:out value="${name}"></c:out></h1>

    <h1>Length of name is <c:out value="${fn:length(name)}"></c:out></h1>
    <c:out value="${fn:toLowerCase(name)}"></c:out>
    <c:out value="${fn:contains(name,'AV')}"></c:out>




</body>
</html>