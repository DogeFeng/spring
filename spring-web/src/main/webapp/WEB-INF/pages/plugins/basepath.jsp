<%@ page language="java" pageEncoding="UTF-8"%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + request.getContextPath() ;
    application.setAttribute("basePath", basePath) ; // 将BasePath的内容保存在application属性之中
%>
<title>【JSP + 业务设计分析】商品信息管理</title>
<base href="<%=basePath%>/"/>