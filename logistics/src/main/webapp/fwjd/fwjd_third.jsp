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
.right_nav{width: 100%; height: 50px; line-height: 50px; background: #aaddee; }
.right_nav span{display: block; padding-left: 20px; float: left;}
.right_content{width: 100%; height: auto; border: 1px solid rgb(234,234,234);}
.right_content p{padding-left: 10px; line-height: 40px; margin-top: 5px; height: auto; 
font-size: 15px; text-indent: 2em; /* text-shadow: 0 2px 2px gray; */ }
.right_title{width: 100%; height: 50px; line-height: 50px; text-align: center; 
background: #aaaacc; font-size: 18px; color: white;}
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
			<div class="right_nav"><span>网站导航&gt;&gt;</span>
			<span><a href="<%=path %>/index.jsp">首页</a>&gt;&gt;</span>
			<span><a href="<%=path%>/fwjd/fwjd.jsp">服务监督&gt;&gt;</a></span><span>正文</span>
			</div>
			<div class="right_content">
				<div class="right_title">标题1</div>
				<p>说明所选课题目的背景、国内外研究现状和发展趋势：
随着时代的发展，网络已经伴随我们周围， 物联网已经进入我们的生活，结合实际的考察，发现国家电网对这种物联网的需求更大，国家电网一年因为工作人员的疏忽，对作业工具使用的不了解，对公共设备的不爱护，对安全意识的不重视，造成了作业工具损坏、丢失，严重的人员死亡的事故不在少数。在此情况下，设计一款智能锁系统，可以有效的限制任意人员使用昂贵工具，工作人员对作业工具的不负责任，有助于解决国家电网的一项困难。
</p>
				<p>说明所选课题目的背景、国内外研究现状和发展趋势：
随着时代的发展，网络已经伴随我们周围， 物联网已经进入我们的生活，结合实际的考察，发现国家电网对这种物联网的需求更大，国家电网一年因为工作人员的疏忽，对作业工具使用的不了解，对公共设备的不爱护，对安全意识的不重视，造成了作业工具损坏、丢失，严重的人员死亡的事故不在少数。在此情况下，设计一款智能锁系统，可以有效的限制任意人员使用昂贵工具，工作人员对作业工具的不负责任，有助于解决国家电网的一项困难。
</p>
				<p>这里显示服务监督的正文3</p>
				
			</div>
		</div>
	
	<div  id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	</div>

	<!-- 版权 -->
	<jsp:include page="/foot.jsp"></jsp:include>
	

</body>
</html>