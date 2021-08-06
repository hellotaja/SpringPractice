<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<String> list = (List<String>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC BOARD</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BORAD LIST</div>
    <div class="panel-body">
    	<table class="table">
    		<tr>
    			<td>번호</td>
    			<td>제목</td>
    			<td>조회수</td>
    			<td>작성자</td>
    			<td>작성일</td>
    		</tr>
    		<% for(String f : list){ %> <!-- 이것은 고전방식! -->
    		<tr>
    			<td>1</td>
    			<td><%=f %></td>
    			<td>0</td>
    			<td>권누리</td>
    			<td>2021-07-28</td>
    		</tr>
    		<% } %>
    	</table>
    </div>
    <div class="panel-footer">빅데이터 -5차(권누리)</div>
  </div>
</div>

</body>
</html>
    