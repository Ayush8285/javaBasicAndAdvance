<%@page isErrorPage="true" %>

<html>
<head>
    <style>
        *{
            padding:0px;
            margin:0px;
        }
    </style>
</html>
<body>

<div style="padding:20dp;color:blue;background: #e2e2e2;">
    <h1>Sorry !! Something went wrong...</h1>
    <br>
    <p><%= exception%></p>
</div>


</body>
</html>