<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<html>
<head>
	<jsp:include page="/WEB-INF/pages/plugins/basepath.jsp"/>
	<jsp:include page="/WEB-INF/pages/plugins/common.jsp"/>
	<script type="text/javascript" src="mvcjs/admin/goods/goods_list.js"></script>
</head>
<body>
<%!
	public static String GOODS_ADD_URL = "pages/admin/goods/goods_add.jsp" ;
	public static String GOODS_EDIT_URL = "pages/admin/goods/goods_edit.jsp" ;
%>
<%
	request.setCharacterEncoding("UTF-8") ;
%>
<div class="row">
	<div class="col-md-12">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<strong><span class="glyphicon glyphicon-th-list"></span>&nbsp;商品信息列表</strong>
			</div>
			<div class="panel-body" style="height: 80%;">
				<table class="table table-condensed">
					<thead>
					<tr>
						<td class="text-center" style="width: 5%"><input type="checkbox" id="sabut"/></td>
						<td class="text-center" style="width: 10%"><strong>商品图片</strong></td>
						<td class="text-center" style="width: 10%"><strong>商品名称</strong></td>
						<td class="text-center" style="width: 10%"><strong>商品单价</strong></td>
						<td class="text-center" style="width: 10%"><strong>商品分类</strong></td>
						<td class="text-center" style="width: 45%"><strong>商品描述</strong></td>
						<td class="text-left" style="width: 10%"><strong>操作</strong></td>
					</tr>
					</thead>
					<tbody>
					<tr>
						<td class="text-center"><input type="checkbox" id="gid" value="1"></td>
						<td class="text-center"><img src="upload/goods/nophoto.jpg" style="width: 50px;"></td>
						<td class="text-center">娃娃</td>
						<td class="text-center">109292</td>
						<td class="text-center">玩具</td>
						<td class="text-left">该娃娃的性价比不错，你会觉得有一种飞的感觉的</td>
						<td class="text-left"><a class="btn btn-warning btn-sm" href="<%=GOODS_EDIT_URL%>?gid=1">
							<span class="glyphicon glyphicon-edit"></span>&nbsp;编辑</a></td>
					</tr>
					</tbody>
				</table>
				<div>
					<a href="<%=GOODS_ADD_URL%>" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk"></span>&nbsp;商品发布</a>
					<button type="button" id="deleteBut" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span>&nbsp;删除商品信息</button>
				</div>
				<jsp:include page="/WEB-INF/pages/plugins/alert.jsp"/>
			</div>
			<div class="panel-footer">
				<strong>
					<jsp:include page="/WEB-INF/pages/plugins/footer.jsp"/>
				</strong>
			</div>
		</div>
	</div>
</div>
</body>
</html>