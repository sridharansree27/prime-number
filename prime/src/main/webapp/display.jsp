<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <style>
        a {
            text-decoration: none;
        }
  </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%= request.getAttribute("n")+"th prime is "+ request.getAttribute("number") %>
 <h2><a href="prime.jsp" style="color:red">nth prime</a></h2>
</body>
</html>