<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
    <h1>This is JSTL Core Example</h1>

    <!-- 1. out tag :  same as <%  %> expression tag -->
    <!-- 2. set tag -->

    <c:set var="i" value="20" scope="application"></c:set>
    <h1><c:out value="${i}"></c:out></h1>


    <!-- 3. remove tag -->
    <c:remove var="i"></c:remove>
    <h1><c:out value="${i}"></c:out>this is default value</h1>

    <hr>

    <!-- 4. if tag : test condition : true=> print.. -->
    <c:if test="${i > 2}">
    <h1> yes i is 20 condition true</h1>
    </c:if>

    <!-- 5. choose, when, otherwise, java switch -->
    <c:choose>
        <c:when test="${i>0}">
            <h1>this is my case first </h1>
                <h2>Number is positive </h2>
        </c:when>
        <c:when test="${i<0}">
            <h1>this is my case second </h1>
                <h2>Number is negative </h2>
        </c:when>
        <c:otherwise>
            <h1> default case otherwise ... the number is zero</h1>
        </c:otherwise>
    </c:choose>

    <!-- 6. forEach tag: for repeating and traversing -->
    <c:forEach var="j" begin="1" end="10">
            <h1>value of j is <c:out value="${j}"></c:out></h1>
    </c:forEach>

    <!-- 7. re direct -->
    <c:url var="myUrl" value="https://www.google.com">
        <c:param name="q" value="onlyjavatech"></c:param>
    </c:url>

    <c:redirect url="${myUrl}"></c:redirect>
</body>
</html>
