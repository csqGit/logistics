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
<title>校园网故障报修</title>
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=path%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=path%>/css/public.css" type="text/css">
<style type="text/css">
* {
margin: 0;
padding: 0;
}


.btn {
	position:relative;
	left: 150px;
	width: 70px;
	height: 40px;
	margin-left: 20px;
	float: left;
}

#button {
	width: 100%;
	height: 50px;
}

.layui-form {
	width: 500px;
	height: auto;
	margin: 0 auto;
	padding: 10px;
	background:white;
	border: 1px solid rgb(234, 234, 234);
}


.info {
	width: 100%;
	height: 50px;
	line-height: 50px;
	font-size: 20px;
	color: white;
	text-align: center;
	background: #8babf1;
}

.layui-btn {
	background-color: #8babf1;
}



#test1 {
	position: relative;
	top: 0;
	width: 390px;
	height: 50px;
}


#msg{
	
	width:100%;
	height:30px;
	text-align: center;
	margin-top:10px;
}
.box{width: 1200px;  height: auto;  position: relative; top: 90px; margin: 10px auto;}
#return{
	width:1200px;
	height:30px;
	font-size: 15px;
	text-align: right;
	clear:both;
}
</style>

</head>
<body>
	<!-- head start -->
	<jsp:include page="/top.jsp"></jsp:include>
	<%-- <div class="head">
		<img alt="" src="<%=path%>/images/u19.png" class="head-img" /><span
			id="logo">陇东学院后勤保障处</span>
		<ul class="head-li">
			<li><a href="http://www.ldxy.edu">学校首页</a></li>
			<li><a href="">新闻通知</a></li>
			<li><a href="">全部功能</a></li>
			<li><a href="">智慧后勤</a></li>
			<li><a href="">关于我们</a></li>
		</ul>
	</div> --%>
	<!-- head end -->
	<div class="box">
	<form class="layui-form" id="form" action="<%=path %>/insertRepair" method="post">
		<p class="info">校园网故障报修</p>

		<div class="layui-form-item">
			<label class="layui-form-label"></label>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">姓名</label>
			<div class="layui-input-block">
				<input type="text" name="repairName" lay-verify="name"
					autocomplete="off" placeholder="报修人姓名" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">类型</label>
			<div class="layui-input-block">
				<input type="text" name="repairType" lay-verify="gender"
					autocomplete="off" placeholder="报修类型" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">时间</label>
			<div class="layui-input-block">
				<input type="text" name="repairTime" class="layui-input"
					placeholder="yyyy-MM-dd">
			</div>
		</div>
		
		<!-- <div class="layui-form-item">
			<label class="layui-form-label">报修地址</label>
			<div class="layui-input-block">
				<input type="text" name="repairAddress" lay-verify="gender"
					autocomplete="off" placeholder="报修地址" class="layui-input">
			</div>
		</div> -->

		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">内容</label>
			<div class="layui-input-block">
				<textarea name="repairReason" placeholder="请输入报修原因"
					class="layui-textarea"></textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">备注 </label>
			<div class="layui-input-block">
				<input type="text" name="repairRemarks" lay-verify="gender"
					autocomplete="off" placeholder="报修地址" class="layui-input">
			</div>
		</div>
		
		<div id="button">
			<div class="btn">
				<div class="layui-form-item">
					<button class="layui-btn" lay-submit="" lay-filter="demo2" onclick="submit()">提交</button>
				</div>
			</div>
			<div class="btn">
				<div class="layui-form-item">
					<input type="reset" class="layui-btn" />
				</div>
			</div>
		</div>
		<div id="msg"><c:if test="${msg!=null }">${msg }</c:if></div>
	</form>
	<div id="return"><a href="<%=path %>/index.jsp">返回首页</a></div>
	</div>

	<!-- 版权 -->
	<jsp:include page="/foot.jsp"></jsp:include>
	<!-- <div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div>
 -->

	<script>
	layui.use('laydate', function(){
		  var laydate = layui.laydate;
		  
		  //常规用法
		  laydate.render({
		    elem: '#test1'
		  });
		  laydate.render({
		    elem: '#test-n4'
		    ,type: 'time'
		    ,position: 'static'
		  });
		});
	</script>
</body>
</html>