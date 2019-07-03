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

.btn {
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
	border: 1px solid rgb(234,234,234);
	padding: 10px;
}
.layui-form-label{
	text-align:center;
}

.layui-btn {
	background-color: #8babf1;
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



#test1 {
	position: relative;
	top: 0;
	width: 390px;
	height: 50px;
}


#show {
	margin:10px auto;
	width: 500px;
	height: 460px;
	display: none;
	clear: both;
}

#return{
	width:100%;
	line-height:40px;
	font-size: 15px;
	text-align: right;
}

</style>

<script>
		layui.use('laydate', function() {
			var laydate = layui.laydate;

			//常规用法
			laydate.render({
				elem : '#test1'
			});
			laydate.render({
				elem : '#test-n4',
				type : 'time',
				position : 'static'
			});
		});
	</script>

</head>
<body>
	<!-- head start -->
	<jsp:include page="../top.jsp"></jsp:include>
	<!-- head end -->

	
	<!-- 查看教室申请信息 -->
	<div id="box">

		<!-- 提交申请表单 -->
		<form class="layui-form" action="<%=path%>/applyClass"
			method="post">
			<div id="top">
			申请教室
		</div>
			<input type="hidden" name="id" />

			<div class="layui-form-item">
				<label class="layui-form-label">姓名</label>
				<div class="layui-input-block">
					<input type="text" name="applyName" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">学号</label>
				<div class="layui-input-block">
					<input type="text" name="applyNumber" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">学院</label>
				<div class="layui-input-block">
					<input type="text" name="applyCollege" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">班级</label>
				<div class="layui-input-block">
					<input type="text" name="applyClass" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">课程</label>
				<div class="layui-input-block">
					<input type="text" name="applyCourse" autocomplete="off"
						placeholder="课程" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">申请教室</label>
				<div class="layui-input-block">
					<input type="text" name="applyClassroom" autocomplete="off"
						placeholder="必填" class="layui-input">
				</div>
			</div>

			<input type="hidden" value="0" name="applyState">


			<div class="layui-form-item">
				<label class="layui-form-label">时间</label>
				<div class="layui-input-block">
					<input type="text" name="applyTime" class="layui-input" autocomplete="off"
						placeholder="必填">
				</div>
			</div>

			<div id="button">
				<div class="btn" style="margin-left: 180px;">
					<div class="layui-form-item">
						<button class="layui-btn" lay-submit="" lay-filter="demo2">提交</button>
					</div>
				</div>
				<div class="btn">
					<div class="layui-form-item">
						<input type="reset" class="layui-btn" />
					</div>
				</div>
			</div>
			<c:if test="${code==100 }">
			<div style="width: 100%;height: 30px; text-align: center; line-height: 30px;">
				申请成功，<a href="<%=path%>/selectApplyClass?page=1">点击查看</a>
							</div> 
			</c:if>
			<c:if test="${code==200 }">
			<div style="width: 100%;height: 30px; text-align: center; line-height: 30px;">
				申请失败
			</div> 
			</c:if>
		</form>
<div id="return"><a href="<%=path%>/index.jsp">返回首页</a></div>
	</div>
	<jsp:include page="../foot.jsp"></jsp:include>

</body>
</html>