<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>服务监督</title>
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<style type="text/css">
* {
	margin: 0; padding: 0;
}

.box{width: 1200px;  height: auto;  position: relative; top: 90px; margin: 10px auto;}
.left_top{background: rgb(234,234,234); width: 100%; height: 40px; line-height: 40px; 
text-align: center; color: blue; font-size: 18px;}

.left{width: 18%; height: auto; float: left;}
.left ul li{height: 40px; line-height: 40px; text-align: center;  border: 1px solid rgb(234,234,234); font-size: 15px;}

.right{width: 80%; height: auto; margin-left: 20%; border: 1px solid rgb(234,234,234); 
line-height: 40px; }
.right_top{width: 98%; height: auto; }
.right_top li{height: 100%; line-height: 50px; padding-left: 10px;}
.right_nav{width: 100%; height: 50px; line-height: 50px; background: #aaddee	; }
.right_nav span{display: block; padding-left: 20px; float: left;}

#return{
	width:100%;
	line-height:40px;
	font-size: 15px;
	text-align: right;
}

</style>

</head>
<body>
	<!-- head start -->
	<jsp:include page="/top.jsp"></jsp:include>
	
	<!-- head end -->
	<div class="box">
		<div class="left">
			<div class="left_top">服务监督</div>
			<ul>
				<li><a href="<%=path%>/fwjd/fwjd.jsp">服务监督</a></li>
				<li><a href="#">其它</a></li>
			</ul>
		</div>
		<div class="right">
			<div class="right_nav"><span>网站导航&gt;&gt;</span><span>
			<a href="<%=path %>/index.jsp">首页</a>&gt;&gt;</span>
			<span>服务监督</span></div>
			<ul class="right_top">
				<li><a href="<%=path%>/fwjd/fwjd_third.jsp">服务监督相关文件</a></li>
				<!-- <li><a href="#">列表2</a></li>
				<li><a href="#">列表3</a></li>
				<li><a href="#">列表4</a></li> -->
			</ul>
		</div>
	
	<div  id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	</div>

	<!-- 版权 -->
	<jsp:include page="/foot.jsp"></jsp:include>
	

</body>
</html>