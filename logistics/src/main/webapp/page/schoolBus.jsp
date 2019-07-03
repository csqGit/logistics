<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>陇东学院校车信息</title>

<style type="text/css">
*{
	margin:0;
	padding:0;
}
#box{
	position:relative;
	top:90px;
	width:1200px;
	height:auto;
	margin:10px auto;
	padding:10px;
}

#return{
	width:1200px;
	line-height:40px;
	font-size: 15px;
	text-align: right;
}

table{
	width:1200px;
	border:1px solid rgb(234,234,234);
	padding: 10px;
}
table tr{
	height: 50px;
	line-height:30px;
}
table tr td{
	text-align:center;
	width:140px;
	border:1px solid rgb(234,234,234);
	font-size: 15px;
}
.time{
	width:150px;
	
}
</style>

</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	
	<div id="box">
		
		<table cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th colspan="7">校&nbsp;车&nbsp;时&nbsp;间&nbsp;安&nbsp;排&nbsp;表</th>
			</tr>
		</thead>
			<tr height="60">
				<td>校车车牌号</td>
				<td>校车司机</td>
				<td>校车出发时间段</td>
				<td>出发地点</td>
				<td>到达地点</td>
				<td>途径站</td>
				<td>截至时间</td>
			</tr>
			<tr>
				<td>甘J99999</td>
				<td>张三</td>
				<td>
					7：00-7：10<br />
					11：50-12:00<br />
					14：00-14：10<br />
					18：00-18：10<br />
					21：00-21：10
				</td>
				<td>陇东学院</td>
				<td>西湖公园</td>
				<td>汽车南站<br />
					汽车西站<br />
					黄观寨小学
				</td>
				<td>21:00</td>
			</tr>
		</table>
		
		<div id="return"><a href="<%=path%>/index.jsp">返回首页</a></div>
	</div>
	
	<jsp:include page="../foot.jsp"></jsp:include>
</body>
</html>