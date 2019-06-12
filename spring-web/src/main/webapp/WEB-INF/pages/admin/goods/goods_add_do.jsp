<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<jsp:include page="/WEB-INF/pages/plugins/basepath.jsp"/>
	<jsp:include page="/WEB-INF/pages/plugins/common.jsp"/>
	<script type="text/javascript" src="mvcjs/admin/goods/goods_add_do.js"></script>
</head>
<body>
<%!
	public static final String GOODS_ADD_URL = "pages/admin/goods/goods_add.jsp" ;
%>
<%
	String msg = "商品信息添加成功！" ;
	request.setCharacterEncoding("UTF-8") ;
%>

<div class="row">
	<div class="col-md-12">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<strong><span class="glyphicon glyphicon-eye-open"></span>&nbsp;增加商品信息</strong>
			</div>
			<div class="panel-body" style="height: 80%;">
				<jsp:include page="/WEB-INF/pages/plugins/forward.jsp">
					<jsp:param name="msg" value="<%=msg%>"/>
					<jsp:param name="path" value="<%=GOODS_ADD_URL%>"/>
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