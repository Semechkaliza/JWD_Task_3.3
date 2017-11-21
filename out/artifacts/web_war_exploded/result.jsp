<%@ page language ="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title> Insert title here </title>
</head>
<body>
<div>
<table border="1">
    <tr>
        <td>status</td>
        <td>type</td>
        <td>thema</td>
        <td>country</td>
        <td>author</td>
        <td>valuable</td>
        <td>year</td>
    </tr>

    <c:forEach items="${requestScope.result}" var="tags">
    <tr>
        <td>${tags.status}</td>
        <td>${tags.type}</td>
        <td>${tags.thema}</td>
        <td>${tags.country}</td>
        <td>${tags.author}</td>
        <td>${tags.valuable}</td>
        <td>${tags.year}</td>
    </tr>
    </c:forEach>

</table>
</div>
<div>
    <table>
        <tr>
        <c:forEach items="${requestScope.pages}" var="page">
                <td>
                    <form action="page" method="GET">
                        <input type="hidden" name="command" value="getPage">
                        <input type="hidden" name="number" value=${page}>
                        <input type="submit" value=${page}>
                    </form>
                </td>
        </c:forEach>
        </tr>
    </table>
</div>

</body>
</html>
