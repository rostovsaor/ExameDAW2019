<%-- 
    Document   : create
    Created on : Dec 28, 2019, 11:41:30 AM
    Author     : Salvador Rombe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create Article!</h1>
        <hr>
        <form action="<c:url value='/article/create'/>" method="post">
            Titulo:
            <input type="text" name="article.name">
            Conteudo:
            <input type="text" name="article.content">
            <input type="submit" value="Criar Artigo">
        </form>
    </body>
</html>
