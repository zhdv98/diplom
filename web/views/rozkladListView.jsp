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
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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

<div class="col-lg-12">
    <div class="content table-full-width visible-md visible-lg">
        <table class="table table-bordered text-center" align="center">
            <thead>
            <tr>
                <td colspan="7" class="text-center">
                    <h3 align="center"><b>Перший тиждень</b></h3></td>
            </tr>
            <tr>
                <td rowspan="2" class="vertical-middle h4" style="vertical-align: middle"><b>День</b></td>
                <td colspan="6"><b>Пара</b></td>
            </tr>
            <tr>
                <td align="center"><b>1</b></td>
                <td align="center"><b>2</b></td>
                <td align="center"><b>3</b></td>
                <td align="center"><b>4</b></td>
                <td align="center"><b>5</b></td>
                <td align="center"><b>6</b></td>
            </tr>
            </thead>

    <tbody>
        <c:set var="alphabet">Понеділок|Вівторок|Середа|Четвер|П'ятниця</c:set>
        <c:forTokens items="${alphabet}" delims="|" var="dd">
            <tr>
            <td ><b>${dd}</b></td>
            <c:forEach items="${fn:split('1|2|3|4|5|6','|')}" var="pp">
                <td align="center">
                <c:forEach items="${rozkladList}" var="rozklad" >
                    <c:if test="${rozklad.dayOfWeek eq dd}">
                    <c:if test="${rozklad.para eq pp}">
                        <c:if test="${rozklad.week eq '1'}">
                            <b>${rozklad.predmet}</b>
                            <br>${rozklad.vikladach}
                            <br>
                            <small>${rozklad.grupa}
                                <br>(${rozklad.auditoria})
                            </small>
                        </c:if>
                        </c:if>
                    </c:if>
                </c:forEach>
                </td>
            </c:forEach>
            </tr>
        </c:forTokens>

    <tr>

        <tr>
            <td colspan="7">
                <h3 align="center"><b>Другий тиждень</b></h3></td>
        </tr>
        <tr>
            <td rowspan="2" class="vertical-middle h4" style="vertical-align: middle"><b>День</b></td>
            <td colspan="6"><b>Пара</b></td>
        </tr>
        <tr>
            <td align="center"><b>1</b></td>
            <td align="center"><b>2</b></td>
            <td align="center"><b>3</b></td>
            <td align="center"><b>4</b></td>
            <td align="center"><b>5</b></td>
            <td align="center"><b>6</b></td>
        </tr>
    </thead>

    <c:set var="alphabet">Понеділок|Вівторок|Середа|Четвер|П'ятниця</c:set>
    <c:forTokens items="${alphabet}" delims="|" var="dd">
        <tr>
            <td ><b>${dd}</b></td>
            <c:forEach items="${fn:split('1|2|3|4|5|6','|')}" var="pp">
                <td align="center">
                    <c:forEach items="${rozkladList}" var="rozklad" >
                        <c:if test="${rozklad.dayOfWeek eq dd}">
                            <c:if test="${rozklad.para eq pp}">
                                <c:if test="${rozklad.week eq '2'}">
                                    <b>${rozklad.predmet}</b>
                                    <br>${rozklad.vikladach}
                                    <br>
                                    <small>${rozklad.grupa}
                                        <br>(${rozklad.auditoria})
                                    </small>
                                </c:if>
                            </c:if>
                        </c:if>
                    </c:forEach>
                </td>
            </c:forEach>
        </tr>
    </c:forTokens>


    </div>
</div>
<!--
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
    </tbody>
</table>
-->




<!-- jQuery первый, затем Tether, затем Bootstrap JS. -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js" integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU" crossorigin="anonymous"></script>
</body>

</html>
