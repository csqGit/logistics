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
<title>空闲教室查询</title>
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<link rel="stylesheet" href="<%=path%>/css/page/classs.css"
	type="text/css">

<style type="text/css">
#box {
	position: relative;
	top: 90px;
	margin: 10px auto;
	width: 1400px;
	height: auto;
}

#box-left {
	width: 15%;
	border: 1px solid rgb(234, 234, 234);
	border-bottom: none;
	float: left;
}

#box-left ul li {
	height: 50px;
	line-height: 50px;
	text-align: center;
	border-bottom: 1px solid rgb(234, 234, 234);
}

#box-left ul li:hover {
	background: rgb(234, 234, 234);
	color: gray;
	cursor: pointer;
}

#box-right {
	width: 80%;
	height: auto;
	margin-left: 20%;
	
	font-size: 15px;
}

#table {
	width: 100%;
	
}
table tr th{background: rgb(234,234,234);}
table tr {
	border: 1px solid rgb(234, 234, 234);
	text-align: center;
	height: 50px;
}

table tr td {
	border: 1px solid rgb(234, 234, 234);
	
}

#bottom {
	margin: 0 auto;
	width: 660px;
	height: 50px;
	border: 1px solid rgb(234, 234, 234);
	clear: both;
}

#bottom li {
	float: left;
	width: 132px;
	height: 50px;
	line-height: 50px;
	text-align: center;
}

#bottom li:hover {
	background: rgb(234, 234, 234);
	color: gray;
	cursor: pointer;
}

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
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->

	<div id="box">
	<div style="border: 1px solid rgb(234, 234, 234); padding: 10px;">
		<div id="box-left">
			<ul>
				<li class="info" value="1">逸夫楼</li>
				<li class="info" value="2">电信楼</li>
				<li class="info" value="3">能源楼</li>
				<li class="info" value="4">外语楼</li>
				<li class="info" value="5">化工楼</li>
				<li class="info" value="6">生物楼</li>
			</ul>
		</div>
		<div id="box-right">
			<table id="table">
				<tr>
					<th>编号/时间</th>
					<th>7:00-7:40</th>
					<th>8:00-8:45</th>
					<th>9:00-9:45</th>
					<th>10:00-10:45</th>
					<th>11:00-11:45</th>
					<th>14:30-15:15</th>
					<th>15:30-16:10</th>
					<th>16:40-17:20</th>
					<th>17:30-18:10</th>
					<th>19:30-20:30</th>
					<th>20:40-21:30</th>
					<th>备注</th>
				</tr>
				
				<tr>
					<td>逸夫楼101</td>
					<td>语文</td>
					<td>数学</td>
					<td>英语</td>
					<td>物理</td>
					<td>化学</td>
					<td>生物</td>
					<td>历史</td>
					<td>地理</td>
					<td>政治</td>
					<td>美术</td>
					<td>体育</td>
					<td></td>
				</tr>
				<tr>
					<td>逸夫楼102</td>
					<td>语文</td>
					<td>数学</td>
					<td>英语</td>
					<td>物理</td>
					<td>化学</td>
					<td>生物</td>
					<td>历史</td>
					<td>地理</td>
					<td>政治</td>
					<td>美术</td>
					<td>体育</td>
					<td></td>
				</tr>
				<%-- <c:forEach items="${freeClass }" var="free">
					<tr>
						<td>${free.id }</td>
						<td>${free.className }</td>
						<td>${free.classAddress }</td>
						<c:if test="${free.classState==0 }">
							<td>占用</td>
						</c:if>
						<c:if test="${free.classState==1 }">
							<td>空闲</td>
						</c:if>
					</tr>
				</c:forEach> --%>

			</table>
			
			<ul id="bottom">
			<li id="first">首页</li>
			<li id="prePage">上一页</li>
			<li><span id="current">1</span>/<span id="page">2</span></li>
			<li id="next">下一页</li>
			<li id="last">尾页</li>
		</ul>
		</div>
</div>

		<div id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	</div>
	<!-- 版权 -->
<jsp:include page="../foot.jsp"></jsp:include>
</body>
<script type="text/javascript">
	$(function() {
		var num = 1;
		$(".info").click(function() {
			var valStr = $(this).val();
			var val = parseInt(valStr);
			location.href = "getFreeClass?page=1&classid=" + valStr;
		});

		var currentStr = $("#current").text();
		var pages = $("#page").text();
		var current = parseInt(currentStr);
		var page = parseInt(pages);
		$("#first").click(function() {
			location.href = "getFreeClass?page=1&classid=" + num;
		});
		$("#current").click(function() {
			if (current == 1) {
				return false;
			}
			current--;
			location.href = "getFreeClass?page=" + current + "&classid=" + num;
		});
		$("#next").click(function() {
			alert(num);
			if (current == page)
				return false;
			current++;
			location.href = "getFreeClass?page=" + current + "&classid=" + num;
		});
		$("#last").click(function() {
			alert(num);
			if (current == page) {
				return false;
			}
			current++;
			location.href = "getFreeClass?page=" + current + "&classid=" + num;
		});
	})
</script>
</html>