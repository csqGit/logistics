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
<title>失物招领</title>

<style type="text/css">
#box{
	position:	relative;
	top:90px;
	width:1200px;
	height:auto;
	margin:10px auto;
}
#swzl{
	width: 100%; height: auto; text-align: center; line-height: 40px;border:1px solid rgb(234,234,234);
}
#swzl tr th{border-right: 1px solid rgb(234,234,234);border-bottom: 1px solid rgb(234,234,234);}
#swzl tr td{border-right: 1px solid rgb(234,234,234);border-bottom: 1px solid rgb(234,234,234);}


#return{margin-top: 10px; width: 100%; text-align: right; }
</style>

</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<div id="box">
		
		<table id="swzl">
			<thead>
				<tr>
					<th colspan="7" style="font-size: 18px; height: 40px;">失物招领</th>
				</tr>
			</thead>
			<tr>
				<td>编号</td><td>失物名称</td><td>丢失时间</td><td>上交人</td><td>上交人联系电话</td>
				<td>丢失人</td><td>丢失人联系电话</td>
			</tr>
			<!-- 有数据，并且查询成功 -->
			<c:if test="${loseFoundList.code == 100 }">
			<c:forEach items="${loseFoundList.result }" var="lose">
			<tr>
				<td>${lose.id }</td><td>${lose.loseName }</td><td>${lose.loseTime }</td>
				<td>${lose.loseSjMan }</td><td>${lose.loseSjPhone }</td>
				<td>${lose.loseMan }</td><td>${lose.losePhone }</td>
				
			</tr>
			</c:forEach>
			</c:if>
			<c:if test="${loseFoundList.code == 200 }">
				<tr><td colspan="7">${loseFoundList.result }</td></tr>
			</c:if>
			<c:if test="${loseFoundList.code == 300 }"></c:if>
			
			
		</table>
		<div id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	</div>
	<jsp:include page="../foot.jsp"></jsp:include>
</body>
</html>