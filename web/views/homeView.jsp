<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 5/15/2018
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Пошук</title>
</head>
<body>

<jsp:include page="_header.jsp"></jsp:include>


<h5 align="center" >Введіть групу для пошуку</h5>
<h5 align="center"><input name="search" placeholder="П-652-42"></h5>
<h5 align="center"><input type="submit" value="Знайти" ></h5>
 <br><br>


<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>
