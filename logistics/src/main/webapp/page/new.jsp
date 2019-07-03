<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
    <%
    	String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻详情</title>

<style type="text/css">
#box{
	position:	relative;
	top:90px;
	width:1200px;
	height:auto;
	margin:10px auto;
}
#new{
	width: 100%; height: auto; text-align: center; line-height: 40px;border:1px solid rgb(234,234,234);
}

#new tr th{border-right: 1px solid rgb(234,234,234);border-bottom: 1px solid rgb(234,234,234);}
#new tr td{border-right: 1px solid rgb(234,234,234);border-bottom: 1px solid rgb(234,234,234);}

#return{margin-top: 10px; width: 100%; text-align: right;}
</style>

</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<div id="box">
		
		<table id="new">
			<thead>
				<tr>
					<th colspan="7" style="font-size: 18px; height: 40px;">动态新闻</th>
				</tr>
			</thead>
			<tr>
				<td>编号</td><td>新闻标题</td><td>新闻类型</td><td>新闻简介</td><td>新闻作者</td>
			</tr>
			<!-- 有数据，并且查询成功 -->
			<c:if test="${newList.code == 100&&newList.result.size()>0 }">
			<c:forEach items="${newList.result }" var="news">
			<tr>
				<td>${news.id }</td><td>${news.newTitle }</td><td>${news.newType }</td>
				<td>${news.newJj }</td><td>${news.newAuthor }</td>
			</tr>
			</c:forEach>
			</c:if>
			<c:if test="${result.code == 100&&newList.result.size()==0}">
			
			<tr>
				<td colspan="5">暂无数据</td>
			</tr>
			</c:if>
			
		</table>
		<div id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	</div>
	<jsp:include page="../foot.jsp"></jsp:include>
</body>
</html>