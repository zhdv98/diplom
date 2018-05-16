<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 5/15/2018
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Расписание пар</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>



<p style="color: red;">${errorString}</p>

<table class="table table-hover">
    <tr>

        <th>День тижня</th>
        <th>Пара</th>
        <th>Група</th>
        <th>Викладач</th>
        <th>Предмет</th>
        <th>Аудиторія</th>
        <th>Тиждень</th>

    </tr>
    <c:forEach items="${rozkladList}" var="rozklad" >
        <tr>

            <td>${rozklad.dayOfWeek}</td>
            <td>${rozklad.para}</td>
            <td>${rozklad.grupa}</td>
            <td>${rozklad.vikladach}</td>
            <td>${rozklad.predmet}</td>
            <td>${rozklad.auditoria}</td>
            <td>${rozklad.week}</td>

        </tr>
    </c:forEach>
</table>



<jsp:include page="_footer.jsp"></jsp:include>

<!-- jQuery первый, затем Tether, затем Bootstrap JS. -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js" integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU" crossorigin="anonymous"></script>
</body>
</html>
