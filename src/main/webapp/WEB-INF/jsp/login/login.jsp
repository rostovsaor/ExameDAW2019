<%-- 
    Document   : login
    Created on : Oct 8, 2019, 8:47:31 AM
    Author     : Prof. Jasse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projecto Padrao</title>
    </head>
    <body>
        <h1>Seu formulario Login aqui!</h1>
        <%@ include file="../templates/aa.jsp" %>    
        <%@ include file="../../../resources/templates/newjsp.jsp" %>

        <a href="<c:url value='/article/article'/>">Artigos</a>
        
        <form action="">
            <input type="text" name="user" placeholder="User">
            <input type="password" name="pass" placeholder="Password">
            <input type="submit" value="OK">
        </form>
        
    </body>
</html>
