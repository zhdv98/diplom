<%@ page language="java" contentType="text/html; charset=UTF8"
         pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF8">
    <title>по номеру Аудиторії </title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>

<form method="POST" action="${pageContext.request.contextPath}/searchRozkladAuditoria">
    <h5 align="center" >Введіть номер аудиторії</h5>
    <h5 align="center"><input type="text" name="auditoria"  value="${rozklad.auditoria}" placeholder="32" ></h5>
    <h5 align="center"><input type="submit" value="Знайти" ></h5>
    <br><br>
</form>

<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>