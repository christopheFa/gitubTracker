<%--
  Created by IntelliJ IDEA.
  User: faivrech
  Date: 10/04/2021
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
    <title>Github Tracker</title>
</head>
<body>
<h1>Githubers with JSTL</h1>
    <table class="table table-bordered">
        <thead class="thead-light">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Login</th>
            <th scope="col">AvatarUrl</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listGithubers}" var="githuber" >
        <tr>
            <td> <c:out value="${githuber.getIdGithuber()}"/> </td>
            <td> <c:out value="${githuber.getName()}"/> </td>
            <td> <c:out value="${githuber.getEmail()}"/> </td>
            <td> <c:out value="${githuber.getLogin()}"/> </td>
            <td> <c:out value="${githuber.getAvatarUrl()}"/> </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
<br>
<h1>Githubers with scriptlet</h1>
    <%
        List<Githuber> listGithubers = (List<Githuber>) request.getAttribute("listGithubers");
    %>
    <table class="table table-bordered">
        <thead class="thead-light">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Login</th>
            <th scope="col">AvatarUrl</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Githuber githubersList : listGithubers) {
                out.println("<tr>");
                out.println("<td>" + githubersList.getIdGithuber() + "</td>");
                out.println("<td>" + githubersList.getName() + "</td>");
                out.println("<td>" + githubersList.getEmail() + "</td>");
                out.println("<td>" + githubersList.getLogin() + "</td>");
                out.println("<td>" + githubersList.getAvatarUrl() + "</td>");
                out.println("</tr>");
            }
        %>
        </tbody>
    </table>
</body>
</html>
