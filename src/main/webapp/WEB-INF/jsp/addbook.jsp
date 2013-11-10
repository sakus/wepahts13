<%-- 
    Document   : addbook
    Created on : Oct 28, 2013, 3:19:58 PM
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

        <a href="${pageContext.request.contextPath}/app/books/">back to book listing</a>
        <br />
        
        <h1>add a book</h1>
        
        <c:if test="${msg != ''}">
            <p>
                <pre style="color:white;background-color:#333">${msg}</pre>
            </p>
        </c:if>
    
        <p>
            You can either fetch a book from open library by the books ISBN or type in all the required information manually.
        </p>
        <br />
        
        <h3>open library</h3>
        <p>
            <form:form commandName="book" action="${pageContext.request.contextPath}/app/populate" method="POST">
                ISBN: <form:input path="bookISBN" /> <input type="submit" value="fetch from open library">
            </form:form>
        </p>
        <br />
        
        <h3>manual feeding</h3>
        <p>
            <strong>* = required</strong>
        </p>
        
        <table>
            <form:form commandName="book" action="${pageContext.request.contextPath}/app/addbook" method="POST">
                <th cellspanning="2">the basics</th>
                <tr>
                    <td>title:</td><td><form:input path="bookTitle" /><form:errors path="bookTitle" /> <strong>*</strong></td>
                </tr>
                <tr>
                    <td>isbn:</td><td><form:input path="bookISBN" /><form:errors path="bookISBN" /> <strong>*</strong></td>
                </tr>
                <tr>
                    <td>published:</td><td><form:input path="bookPublishingYear" /><form:errors path="bookPublishingYear" /> <strong>*</strong></td>
                </tr>
                
                <tr>
                    <td>publisher 1:</td><td><form:input path="bookPublisher1" value = "${book.bookPublisher1}" /><form:errors path="bookPublisher1" /> <strong>*</strong></td>
                </tr>
                <tr>
                    <td>publisher 2:</td><td><form:input path="bookPublisher2" value = "${book.bookPublisher2}" /><form:errors path="bookPublisher2" /> </td>
                </tr>
                
                <th cellspanning="2"><br />authors</th>
                <tr>
                    <td>name:</td><td><form:input path="bookAuthor1" /><form:errors path="bookAuthor1" /> <strong>*</strong></td>
                </tr>
                <tr>
                    <td>name:</td><td><form:input path="bookAuthor2" /><form:errors path="bookAuthor2" /></td>
                </tr>
                <tr>
                    <td>name:</td><td><form:input path="bookAuthor3" /><form:errors path="bookAuthor3" /></td>
                </tr>
                <tr>
                    <td>name:</td><td><form:input path="bookAuthor4" /><form:errors path="bookAuthor4" /></td>
                </tr>
                <tr>
                    <td>name:</td><td><form:input path="bookAuthor5" /><form:errors path="bookAuthor5" /></td>
                </tr>
                <th cellspanning="2"><br />cover images (URL)</th>
                <tr>
                    <td>thumbnail:</td><td><form:input path="bookCoverThumbnailURL" value = "/WepaHT/img/na_thumbnail.png" /><form:errors path="bookCoverThumbnailURL" /></td>
                </tr>
                <tr>
                    <td>large cover:</td><td><form:input path="bookCoverFullURL" value = "/WepaHT/img/na_largecover.png" /><form:errors path="bookCoverFullURL" /></td>
                </tr>

                <tr>
                    <td><br /><input type="submit" value="add book"></td>
                </tr>
            </form:form>
        </table>
                
    </body>
</html>
