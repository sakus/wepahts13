<%-- 
    Document   : register
    Created on : Nov 10, 2013, 2:30:14 PM
    Author     : sakus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WepaHT s13 Saku S&auml;is&auml;</title>
    </head>
    
    <body>
    
        <p>
            <a href="${pageContext.request.contextPath}/app/books/">back to book listing</a>
        </p>

        <h1>register a new user account</h1>

        <c:if test="${msg != ''}">
            <p>
                <pre style="color:white;background-color:#333">${msg}</pre>
            </p>
        </c:if>
        
        <form action="${pageContext.request.contextPath}/app/register" method="POST">
            <table>
                <tr>
                    <td>name (min. 4 chars): </td><td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>password: </td><td><input type="password" name="password1" /></td>
                </tr>
                <tr>
                    <td>password verify: </td><td><input type="password" name="password2" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="register" /></td>
                </tr>
            </table>
        </form>
        
    </body>
    
</html>
