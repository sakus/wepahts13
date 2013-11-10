<%-- 
    Document   : books
    Created on : Oct 28, 2013, 12:03:41 PM
    Author     : sakus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WepaHT s13 Saku S&auml;is&auml;</title>
    </head>
    <body>
        
        <p>
            
            <!-- kirjautumaton käyttäjä -->
            <sec:authorize access="isAnonymous()">
                [ <a href="${pageContext.request.contextPath}/app/register/">register</a> ]
                [ <a href="${pageContext.request.contextPath}/app/login/">log in</a> ]
            </sec:authorize>
                
            <!-- kirjautuneen käyttäjän navigointilinkit -->
            <sec:authorize access="hasRole('registeredUser')">
                [ <a href="${pageContext.request.contextPath}/app/addbook/">add book</a> ]
                [ <a href="${pageContext.request.contextPath}/j_spring_security_logout">log out (${loggedin})</a> ]
            </sec:authorize>
            
        </p>
        
        <c:if test="${msg != ''}">
            <p>
                <pre style="color:white;background-color:#333">${msg}</pre>
            </p>
        </c:if>
        
        <h1>books in the db</h1>
        
        <table>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>
                        <img src="${book.bookCoverThumbnailURL}" alt="${book.bookTitle}" />
                    </td>
                    <td>
                        <b><a href="${pageContext.request.contextPath}/app/books/${book.bookId}">${book.bookTitle}</a></b> (<i>ISBN: ${book.bookISBN}</i>)
                    </td>
                </tr>
            </c:forEach>
        </table>
                        
    </body>
</html>
