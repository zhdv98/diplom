<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Домащняя страница</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>

<form method="GET" action="${pageContext.request.contextPath}/searchRozklad">
<h5 align="center" >Введіть групу для пошуку</h5>
<h5 align="center"><input name="search" placeholder="П-652-42" value="${rozklad.grupa}"></h5>
<h5 align="center"><input type="submit" value="Знайти" ></h5>
 <br><br>
</form>

<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>