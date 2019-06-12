<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<jsp:include page="/WEB-INF/pages/plugins/basepath.jsp"/>
	<jsp:include page="/WEB-INF/pages/plugins/common.jsp"/>
	<script type="text/javascript" src="mvcjs/admin/goods/goods_delete_do.js"></script>
</head>
<body>
<%!
	public static final String GOODS_LIST_URL = "pages/admin/goods/goods_list.jsp" ;
%>
<%
	String msg = "商品删除成功！" ;
	request.setCharacterEncoding("UTF-8") ;
%>

<div class="row">
	<div class="col-md-12">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<strong><span class="glyphicon glyphicon-bullhorn"></span>&nbsp;删除商品信息</strong>
			</div>
			<div class="panel-body" style="height: 80%;">
				<jsp:include page="/WEB-INF/pages/plugins/forward.jsp">
					<jsp:param name="msg" value="<%=msg%>"/>
					<jsp:param name="path" value="<%=GOODS_LIST_URL%>"/>
				</jsp:include>
			</div>
			<div class="panel-footer">
				<jsp:include page="/WEB-INF/pages/plugins/footer.jsp"/>
			</div>
		</div>
	</div>
</div>
</body>
</html>