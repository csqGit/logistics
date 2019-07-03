<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>教室申请</title>
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/css/page/classs.css"
	type="text/css">

<style type="text/css">
* {
	margin: 0 ; padding: 0;
}

#top{
	width: 100%;
	height:50px;
	line-height: 50px;
	background: #8babf1;
	margin-bottom: 10px;
	text-align: center;
	font-size: 18px; color: white;
}

#box{
	position:relative;
	top:90px;
	margin:10px auto;
	width:1200px;
	height:auto;
	font-size: 15px;
}


#return{
	width:100%;
	line-height:40px;
	font-size: 15px;
	text-align: right;
}
#box table {margin-top: -10px; font-size: 15px; width: 100%; border: 1px solid rgb(234,234,234)}
#box table tr td{border-bottom: 1px solid rgb(234,234,234); border-right: 1px solid rgb(234,234,234); height: 40px;}
</style>


</head>
<body>
	<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->

	
	<!-- 查看教室申请信息 -->
	<div id="box">
		

		<!-- 展示申请信息 -->
		<div id="top">
			查看申请信息
		</div>
			<table>
				<tr align="center" height="40px">
					<td>编号</td>
					<td>申请人</td>
					<td>所属学院</td>
					<td>所属班级</td>
					
					<td>申请教室</td>
					<td>申请时间</td>
					<td>审核状态</td>
				</tr>
				<c:forEach items="${classList }" var="applyClass">
					<tr align="center">
						<td>${applyClass.id }</td>
						<td>${applyClass.applyName }</td>
						<td>${applyClass.applyCollage }</td>
						<td>${applyClass.applyClass }</td>
						<td>${applyClass.applyClassroom }</td>
						<td>${applyClass.applyTime }</td>
						<c:if test="${applyClass.applyState==0 }">
							<td><span style="color: red">未通过</span></td>
						</c:if>
						<c:if test="${applyClass.applyState==1 }">
							<td><span style="color: green">通过</span></td>
						</c:if> 
					</tr>
				</c:forEach>

			</table>

<div id="return"><a href="<%=path%>/index.jsp">返回首页</a></div>
	</div>
	<jsp:include page="../foot.jsp"></jsp:include>

</body>
</html>