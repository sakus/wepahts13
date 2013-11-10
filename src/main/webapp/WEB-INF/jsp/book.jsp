<%-- 
    Document   : book
    Created on : Oct 28, 2013, 3:51:01 PM
    Author     : sakus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WepaHT s13 Saku S&auml;is&auml;</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/app/books/">back to book listing</a>
        <br />
        
        <sec:authorize access="hasRole('registeredUser')">

            <p>
                <form action="${pageContext.request.contextPath}/app/rembook/${book.bookId}" method="POST">
                    <input type="submit" value="delete book">
                </form>
            </p>

            <h1>${book.bookTitle}</h1>

            <c:if test="${msg != ''}">
                <p>            
                    <pre style="color:white;background-color:#333">${msg}</pre>
                </p>

            <p>
                <strong>* = required</strong>
            </p>

            </c:if>        

            <div style="float:left">
                <img src="${book.bookCoverFullURL}" alt="${book.bookTitle}" />
            </div>

            <div>
                <table>

                    <form:form commandName="book" action="${pageContext.request.contextPath}/app/savebook/${book.bookId}" method="POST">
                        <th><h3>book info</h3></th>
                        <tr>
                            <td>book title:</td><td><form:input path="bookTitle" value = "${book.bookTitle}" /><form:errors path="bookTitle" /> <strong>*</strong></td>
                        </tr>
                        <tr>
                            <td>isbn:</td><td><form:input path="bookISBN" value = "${book.bookISBN}" /><form:errors path="bookISBN" /> <strong>*</strong></td>
                        </tr>
                        <tr>
                            <td>published:</td><td><form:input path="bookPublishingYear" value = "${book.bookPublishingYear}" /><form:errors path="bookPublishingYear" /> <strong>*</strong></td>
                        </tr>
                        <tr>
                            <td>publisher 1:</td><td><form:input path="bookPublisher1" value = "${book.bookPublisher1}" /><form:errors path="bookPublisher1" /> <strong>*</strong></td>
                        </tr>
                        <tr>
                            <td>publisher 2:</td><td><form:input path="bookPublisher2" value = "${book.bookPublisher2}" /><form:errors path="bookPublisher2" /> </td>
                        </tr>

                        <th><br /><h3>authors</h3></th>
                        <tr>
                            <td>name:</td><td><form:input path="bookAuthor1" value = "${book.bookAuthor1}" /><form:errors path="bookAuthor1" /> <strong>*</strong></td>
                        </tr>
                        <tr>
                            <td>name:</td><td><form:input path="bookAuthor2" value = "${book.bookAuthor2}" /><form:errors path="bookAuthor2" /></td>
                        </tr>
                        <tr>
                            <td>name:</td><td><form:input path="bookAuthor3" value = "${book.bookAuthor3}" /><form:errors path="bookAuthor3" /></td>
                        </tr>
                        <tr>
                            <td>name:</td><td><form:input path="bookAuthor4" value = "${book.bookAuthor4}" /><form:errors path="bookAuthor4" /></td>
                        </tr>
                        <tr>
                            <td>name:</td><td><form:input path="bookAuthor5" value = "${book.bookAuthor5}" /><form:errors path="bookAuthor5" /></td>
                        </tr>
                        <th cellspanning="2"><br />cover (URL)</th>
                        <tr>
                            <td>thumbnail:</td><td><form:input path="bookCoverThumbnailURL" value = "${book.bookCoverThumbnailURL}" /><form:errors path="bookCoverThumbnailURL" /></td>
                        </tr>
                        <tr>
                            <td>large cover:</td><td><form:input path="bookCoverFullURL" value = "${book.bookCoverFullURL}" /><form:errors path="bookCoverFullURL" /></td>
                        </tr>

                        <tr>
                            <td><br /><input type="submit" value="save changes"></td>
                        </tr>
                    </form:form>
                </table>

            </div>

            <div style="clear:both"></div>
            
        </sec:authorize>
        
        <sec:authorize access="isAnonymous()">

            <br />
            <div style="float:left">
                <img src="${book.bookCoverFullURL}" alt="${book.bookTitle}" />
            </div>
            
            <div>
                <table>
                    <th><h3>book info</h3></th>
                    <tr>
                        <td><strong>book title:</strong></td><td>${book.bookTitle}</td>
                    </tr>
                    <tr>
                        <td><strong>isbn:</strong></td><td>${book.bookISBN}</td>
                    </tr>
                    <tr>
                        <td><strong>published:</strong></td><td>${book.bookPublishingYear}</td>
                    </tr>
                    <tr>
                        <td><strong>publisher 1:</strong></td><td>${book.bookPublisher1}</td>
                    </tr>
                    <tr>
                        <td><strong>publisher 2:</strong></td><td>${book.bookPublisher2}</td>
                    </tr>

                    <th><br /><h3>authors</h3></th>
                    <tr>
                        <td><strong>name:</strong></td><td>${book.bookAuthor1}</td>
                    </tr>
                    <tr>
                        <td><strong>name:</strong></td><td>${book.bookAuthor2}</td>
                    </tr>
                    <tr>
                        <td><strong>name:</strong></td><td>${book.bookAuthor3}</td>
                    </tr>
                    <tr>
                        <td><strong>name:</strong></td><td>${book.bookAuthor4}</td>
                    </tr>
                    <tr>
                        <td><strong>name:</strong></td><td>${book.bookAuthor5}</td>
                    </tr>
                </table>
            </div>
                
            <div style="clear:both"></div>
            
        </sec:authorize>
    
    </body>
</html>
