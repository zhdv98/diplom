<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 5/15/2018
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Rozklad List</title>
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>

<h3>Розклад занять</h3>

<p style="color: red;">${errorString}</p>

<table border="1" cellpadding="5" cellspacing="1" >
  <tr>
        <th>Час</th>

    <tr>
        <td>8:40-10:00</td>

    </tr>
    <tr>
        <td>10:15-11:35</td>

    </tr>
    <tr>
        <td>12:15-13:35</td>

    </tr>
    <tr>
        <td>13:50-15:10</td>
    </tr>
    <tr>
        <td>15:20-16:40</td>
    </tr>
    <c:forEach items="${rozkladList}" var="rozklad" >
       <tr>
            <td>${rozklad.DayOfWeek}</td>


        </tr>
    </c:forEach>
</table>



<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>
