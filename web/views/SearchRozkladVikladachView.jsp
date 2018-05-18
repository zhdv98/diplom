<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>по Викладачу </title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>

<form method="POST" action="${pageContext.request.contextPath}/searchRozkladVikladach">
    <h5 align="center" >Введіть ПІБ Викладача</h5>
    <h5 align="center"><input type="text" name="vikladach"  value="${rozklad.vikladach}" placeholder="Иванов Иван Иванович" ></h5>

    <h5 align="center"><input type="submit" value="Знайти" ></h5>
    <br><br>
</form>

<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>