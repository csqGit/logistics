<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String path = request.getContextPath();
    %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>网络调查</title>
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<style type="text/css">
	*{margin: 0; padding: 0;}
	#box{position: relative; top: 90px; width: 1200px; height: auto;
	margin: 10px auto; }
	#canteenForm{width: 50%; height: auto; margin: 0 auto;}
	
	.input-items{width: 100%; height: 50px; line-height: 50px; font-size: 15px; margin-top: 10px;}
	.input-items span{display: block; width: 30%; height: 100%;  text-align: center; float: left;}
	.input-items input{width: 60%;height: 40px; margin-left: 6%; padding-left: 10px;}
	
	#but{width: 100%; height: 35px; margin-top: 15px;}
	#but input{display: block; width: 75px; height: 35px; float: left; margin-left: 20px;}
	#but input[type="submit"]{margin-left: 215px; /* border: 1px solid red; background: none; */}
	#msg{width: 100%; height: 30px; line-height: 30px;text-align: center; margin-top: 5px;}
	#return{width:100%;
	line-height:40px;
	font-size: 15px;
	text-align: right;}
</style>
</head>
<body>
<jsp:include page="../top.jsp"></jsp:include>
<div id="box">
	<div style="border: 1px solid rgb(234,234,234); padding: 10px;">
	<form id="canteenForm" action="<%=path%>/insertIdea" method="post">
	<input type="hidden" name="token" value="${token }">
	<div class="input-items">
		<span>填表时间：</span><input type="text" name="time" value="">
	</div>
	<div class="input-items">
		<span>填表人：</span><input type="text" name="person" value="">
	</div>
	<div class="input-items">
		<span>学院：</span><input type="text" name="collage" value="">
	</div>
	<div class="input-items">
		<span>班级：</span><input type="text" name="classes" value="">
	</div>
	<div class="input-items">
		<span>标题：</span><input type="text" name="title" value="">
	</div>
	<div class="input-items">
		<span>内容：</span><input type="text" name="content" value="">
	</div>
	<div class="input-items">
		<span>备注：</span><input type="text" name="remark" value="">
	</div>
	
	<div id="but">
		<input type="submit" value="提交">
		<input type="reset" value="重置">
	</div>
	<div id="msg">
		<c:if test="${msg=='100' }">
			<span style="color: green;">提交成功，感谢你的参与！</span>
		</c:if>
		<c:if test="${msg=='200' }">
			<span style="color: red">提交信息失败！</span>
		</c:if>
		<c:if test="${msg=='300' }">
			<span style="color: red;">请不要重复提交！</span>
		</c:if>
	</div>
	</form>
	</div>
<div id="return"><a href="<%=path%>/index.jsp">返回首页</a></div>
</div>

<jsp:include page="../foot.jsp"></jsp:include>
<script type="text/javascript">
<%-- var url = "<%=path%>/tsCanteen";
	
	function formSubmit(){
			//form.action = "/tsCanteen";
			document.getElementById("canteenForm").action = url;
			document.getElementById("canteenForm").submit();
		} --%>
</script>
</body>
</html>