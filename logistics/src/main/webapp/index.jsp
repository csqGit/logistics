<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>陇东学院后勤管理</title>

<!-- layui的css -->
<link rel="stylesheet" href="layui/css/layui.css" media="all">
<link rel="stylesheet" href="css/index.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script src="layui/layui.js" charset="utf-8"></script>
<script src="js/index.js" charset="utf-8"></script>
<style type="text/css">
.layui-table, .layui-table-view {
	margin: 0;
}

.repairTab {border-top: 1px solid gray; border-left: 1px solid gray; }
.repair-title{height: 50px; text-align: center; 
			background: rgb(234,234,234);line-height: 50px; 
			font-size; 18px;}
.repair-title span{display: block; width: 80px; float: right; margin-right: 10px;}
.repairTab tr td{border-right: 1px solid gray; border-bottom: 1px solid gray; font-size: 14px;}
.repairTab tr th{border-bottom: 1px solid gray; border-right: 1px solid gray;}

.new{ width: 1200px; margin: 0 auto;margin-top: 20px; height: auto; }
.newTitle{text-align: center; line-height: 50px; height: 50px; background: rgb(234,234,234)}
.newTitle span{display: block; width: 80px;  float: right; margin-right: 10px; }
.new table{width: 100%; border: 1px solid gray;}
.new table tr th{text-align: center; height: 45px;border-right: 1px solid gray; border-bottom: 1px solid gray; }
.new table tr td{ height: 40px; text-align: center;border-right: 1px solid gray; border-bottom: 1px solid gray; font-size: 14px;}
</style>
</head>
<body>
	<!-- head start -->
	<jsp:include page="/top.jsp"></jsp:include>
	<!-- head end -->

	<div class="layui-carousel" id="test1" lay-filter="test1">

		<div carousel-item="">
			<%-- <c:forEach items="${picUrl }" var="pic">
				<div style="width: 1200px; cursor:pointer;">
					<img alt="" width="1200" height="300"
						src="<%=path %>/${pic.picUrl }">
				</div>
			</c:forEach> --%>
			
			<img alt="" width="1200" height="300"
									src="<%=path %>/images/lbimages/lb1.jpg">
									<img alt="" width="1200" height="300" 
									src="<%=path %>/images/lbimages/lb2.jpg">
									<img alt="" width="1200" height="300"
									src="<%=path %>/images/lbimages/lb3.jpg">
									<img alt="" width="1200" height="300"
									src="<%=path %>/images/lbimages/lb4.jpg"> 
			
		</div>

	</div>

	<!-- 新闻公告 start -->
	<div class="new">
	<div class="newTitle"><b>新闻信息</b><span><a href="#">更多</a></span></div>
	<table>
		<tr>
			<th>编号</th>
			<th>标题</th>
			<th>简要</th>
			<th>发布时间</th>
			<th>作者</th>
		</tr>
		<tr>
			<td>1</td>
			<td>修信息</td>
			<td>修信息</td>
			<td>修信息</td>
			<td>修信息</td>
		</tr>
	</table>
	<script type="text/javascript">
		$(function(){
			$.ajax({
				url : "<%=path%>/selectNewList",
				type : "post",
				dataType : "json",
				data : {'page' : 1},
				success: function(data){
					alert(data)
				}
			});
		})
	</script>
	
		<!-- <div class="new-top">
			<div class="new-top-left">新闻公告</div>
			<div class="new-top-right">
				<a href="">更多</a>
			</div>
		</div> -->
		<%-- <div class="new-left">
			<div class="new-left-one">

				<div class="layui-carousel" id="test3">
					<div carousel-item>
						<c:forEach items="${picUrl }" var="pic">
							<div style="width: 370px; cursor:pointer;">
								<img alt="" width="370" height="300"
									src="<%=path %>/${pic.picUrl }">
							</div>
						</c:forEach>
						<img alt="" width="370" height="300"
									src="<%=path %>/images/lbimages/lb1.jpg">
									<img alt="" width="370" height="300"
									src="<%=path %>/images/lbimages/lb2.jpg">
									<img alt="" width="370" height="300"
									src="<%=path %>/images/lbimages/lb3.jpg">
									<img alt="" width="370" height="300"
									src="<%=path %>/images/lbimages/lb4.jpg">
					</div>
				</div>

 
			</div>
			<div class="new-left-two">
				<span class="new-box"><a href="#">共有<span id="count">${newCount }</span>条新闻
				</a></span> <span class="new-box"><a href="#">新闻${newCount }条，公告${newCount }条</a></span>
			</div>
			<div class="new-left-three">
				<span class="more-new"><a href="#">更多新闻</a></span>
			</div>
		</div> --%>
		<!-- <div class="new-right">
			<table class="layui-hide" id="test"></table>
		</div> -->
	</div>

	<!-- 新闻公告 end -->

	<!-- 后勤保障报修repair start -->
	<div class="repair">
		<div class="repair-left">
			<div class="repair-left-one one">
				<img alt="" src="images/u61.png" class="img"> <a
					href="page/hqgzbx.jsp" class="img-a">后勤故障报修</a>
			</div>
			<div class="repair-left-one two">
				<img alt="" src="images/u63.png" class="img"> <a href=""
					class="img-a">电费充值</a>
			</div>
			<div class="repair-left-one three">
				<img alt="" src="images/u66.png" class="img"><a href="<%=path %>/page/xywbx.jsp"
					class="img-a">校园网故障报修</a>
			</div>
			<div class="repair-left-one four">
				<img alt="" src="images/u66.png" class="img"> <a href="<%=path %>/selectLoseFoundList"
					class="img-a">失物招领</a>
			</div>
			<div class="repair-left-one five">
				<img alt="" src="images/u90.png" class="img"> <a href="<%=path %>/selectNewList"
					class="img-a">新闻公告</a>
			</div>
			<div class="repair-left-one six">
				<img alt="" src="images/u100.png" class="img"> <a href="<%=path %>/fwjd/fwjd.jsp"
					class="img-a">服务监督</a>
			</div>
			<div class="repair-left-one seven">
				<img alt="" src="images/u102.png" class="img"> <a href="<%=path %>/page/freeClass.jsp"
					class="img-a">空闲教师查询</a>
			</div>
			<div class="repair-left-one eight">
				<img alt="" src="images/u104.png" class="img"> <a href="<%=path %>/page/class.jsp"
					class="img-a">申请教室</a>
			</div>
			<div class="repair-left-one ten">
				<img alt="" src="images/u106.png" class="img"> <a href="<%=path %>/selectApplyClass"
					class="img-a">申请教室查询</a>
			</div>
			<div class="repair-left-one nine">
				<img alt="" src="images/u110.png" class="img"> <a href="<%=path %>/page/schoolBus.jsp"
					class="img-a">校车安排信息</a>
			</div>
			
		</div>
		<div class="repair-but">
			<div class="repair-title"><b>后勤故障报修</b><span><a href="#">更多</a></span></div>
			<!-- <div class="repair-but-right" style="border: 1px solid blue;"> -->
				<!-- <table class="layui-hide" id="test2"></table> -->
				<table class="repairTab" style="width: 100%; height: auto; text-align: center; " cellspacing="0" cellpadding="0">
					<thead>
					<tr height="40px">
						<th>编号</th>
						<th>报修类型</th>
						<th>报修时间</th>
						<th>报修内容</th>
						<th>报修人</th>
					</tr>
					</thead>
				</table>
			<!-- </div> -->
		</div>
	</div>
	<script type="text/javascript">
		$(function(){
			var obj = $(".repairTab");
			$.ajax({
				url : "selectRepairList?page=1&repairName=11",
				type : "post",
				dataType : "json",
				success : function(data){
					//alert(data.repairList.size());
					if(data.code == 100){
						for(var x in data.repairList){
							var tr = "<tr id='tbody' height='35px' >"
								+ "<td>" + data.repairList[x].id +"</td>"
								+ "<td>" + data.repairList[x].repairType +"</td>"
								+ "<td>" + data.repairList[x].repairTime +"</td>"
								+ "<td>" + data.repairList[x].repairReason +"</td>"
								+ "<td>" + data.repairList[x].repairName +"</td>"
							+ "</tr>";
							obj.append(tr);
						}
						
					}else if(data.result == 200){
						
					}else {
						
					}
				}
			});
		})
	</script>
	<!-- 后勤保障报修repair end -->

	<!-- 食堂eatery信息 start -->
	<div class="eatery">
		<div class="eatery-info info">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">食堂监督
			</div>
			<div class="info-but">
				<div class="info-but-box">
					<img src="images/u466.png" width="30" height="30" class="title"><span
						class="span"><a href="<%=path%>/doCanteenFormServlet">餐饮卫生投诉</a></span>
				</div>
				<div class="info-but-box box">
					<a href="<%=path%>/doComplainFormServlet"><img src="images/u476.png" width="30" height="30"
						class="title"><span class="span">食堂物价投诉</span></a>
				</div>
			</div>
		</div>
		<div class="eatery-info">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">服务人员监督
			</div>
			<div class="info-but">
				<div class="info-but-box">
					<a href="<%=path%>/doComplainFormServlet"><img src="images/u492.png" width="30" height="30"
						class="title"><span class="span">投诉后勤维修人员</span></a>
				</div>
				<div class="info-but-box box">
					<a href="<%=path%>/doComplainFormServlet"><img src="images/u496.png" width="30" height="30"
						class="title"><span class="span">投诉费用充值人员</span></a>
				</div>
			</div>
		</div>
		<div class="eatery-info idea-box">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">调查公告
			</div>
			<ul class="info-top-li">
			<li><a href="#">公告</a></li>
				<li><a href="<%=path%>/doIdeaFormServlet">网络调查</a></li>
			</ul>
		</div>
		<div class="eatery-info network-box">
			<div class="info-top">
				<img src="images/u590.png" width="30" height="30" class="nav">网络调查信息
			</div>
			<ul class="info-top-li idea"></ul>
		</div>
	</div>
	
	<script type="text/javascript">
	//查询网络调查信息列表
		$(function(){
			
			$.ajax({
				url : "<%=path%>/selectIdeaList",
				type : "post",
				dataType : "json",
				success : function(data){
					if(data.code == 100){
						for(var x in data.result){
							var li = "<li><a href='<%=path%>/'>"
								+ data.result[x].title
								+ "</a></li>";
								$(".idea").append(li);
						}
						
					}
				}
			});
		})
	</script>
	<!-- 食堂信息 end -->

	<!-- 后勤信息 service -->
	<%-- <div class="service">
		<div class="service-left">
			<div class="service-info" style="margin-left: 0;">
				<div class="service-info-top">
					<img src="images/u590.png" width="30" height="30" class="nav">智慧后勤
				</div>
				<ul class="service-info-li li-left">
					<c:forEach items="${system }" var="system">
						<li><a href="${system.url }">${system.system_name }</a>
					</c:forEach>
				</ul>
			</div>
			<div class="service-info">
				<div class="service-info-top">
					<img src="images/u590.png" width="30" height="30" class="nav">连接导航
				</div>
				<ul class="service-info-li li-right">
					<c:forEach items="${system }" var="system">
						<li><a href="${system.url }">${system.system_name }</a>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="service-map">
			
			<iframe src="<%=path %>/page/zddt.html" width="780" height="250"  frameborder="0"></iframe>
		</div>
	</div> --%>

	<!-- 版权 -->
	<jsp:include page="foot.jsp"></jsp:include>
	<!-- <div class="copy">
		<p></p>
		<p>陇东学院所有</p>
		<p></p>
	</div> -->
</body>
</html>