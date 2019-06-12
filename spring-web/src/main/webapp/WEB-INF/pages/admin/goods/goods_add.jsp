<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <jsp:include page="/WEB-INF/pages/plugins/basepath.jsp"/>
    <jsp:include page="/WEB-INF/pages/plugins/common.jsp"/>
    <script type="text/javascript" src="mvcjs/admin/goods/goods_add.js"></script>
</head>
<body>
<%!
    public static String GOODS_ADD_DO_URL = "pages/admin/goods/goods_add_do.jsp" ;
    public static String GOODS_LIST_URL = "pages/admin/goods/goods_list.jsp" ;
%>
<%
    request.setCharacterEncoding("UTF-8") ;
%>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <strong><span class="glyphicon glyphicon-eye-open"></span>&nbsp;发布商品信息</strong>
            </div>
            <div class="panel-body" style="height: 80%;">
                <form action="<%=GOODS_ADD_DO_URL%>" method="post" class="form-horizontal" id="goodsForm" enctype="multipart/form-data">
                    <fieldset>
                        <div class="form-group" id="nameDiv">
                            <label class="col-md-2 control-label" for="name">商品名称：</label>
                            <div class="col-md-5">
                                <input type="text" id="name" name="name" class="form-control" placeholder="请填写商品名称">
                            </div>
                            <span class="col-md-5" id="nameSpan">*</span>
                        </div>
                        <div class="form-group" id="priceDiv">
                            <label class="col-md-2 control-label" for="price">商品价格：</label>
                            <div class="col-md-5">
                                <input type="text" id="price" name="price" class="form-control" placeholder="请填写商品单价">
                            </div>
                            <span class="col-md-5" id="priceSpan">*</span>
                        </div>
                        <div class="form-group" id="itemDiv">
                            <label class="col-md-2 control-label" for="item">商品分类：</label>
                            <div class="col-md-5">
                                <select id="item" name="item" class="form-control">
                                    <option value="">========= 请选择商品所属分类 =========</option>
                                    <option value="1">生活用品</option>
                                    <option value="2">数码产品</option>
                                    <option value="3">时尚装扮</option>
                                </select>
                            </div>
                            <span class="col-md-5" id="itemSpan">*</span>
                        </div>
                        <div class="form-group" id="tagDiv">
                            <label class="col-md-2 control-label" for="tag">商品标签：</label>
                            <div class="col-md-5">
                                <div class="col-md-3">
                                    <div class="checkbox">
                                        <label><input type="checkbox" id="tag" name="tag" value="1">性价比高</label>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="checkbox">
                                        <label><input type="checkbox" id="tag" name="tag" value="2">高端</label>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="checkbox">
                                        <label><input type="checkbox" id="tag" name="tag" value="3">大气</label>
                                    </div>
                                </div>
                            </div>
                            <span class="col-md-5" id="tagSpan">*</span>
                        </div>
                        <div class="form-group" id="photoDiv">
                            <label class="col-md-2 control-label" for="photo">商品图片：</label>
                            <div class="col-md-5">
                                <input type="file" id="photo" name="photo" class="form-control" placeholder="请选择商品宣传图">
                            </div>
                            <span class="col-md-5" id="photoSpan">*</span>
                        </div>
                        <div class="form-group" id="noteDiv">
                            <label class="col-md-2 control-label" for="photo">商品描述：</label>
                            <div class="col-md-5">
                                <textarea id="note" name="note" class="form-control" placeholder="请输入关于该商品的信息描述"></textarea>
                            </div>
                            <span class="col-md-5" id="noteSpan">*</span>
                        </div>
                        <div class="form-group">
                            <div class="col-md-3 col-md-offset-3">
                                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span>&nbsp;提交</button>
                                <button type="reset" class="btn btn-warning"><span class="glyphicon glyphicon-refresh"></span>&nbsp;重置</button>
                                <a href="<%=GOODS_LIST_URL%>" class="btn btn-info"><span class="glyphicon glyphicon-th-list"></span>&nbsp;商品列表</a>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
            <div class="panel-footer">
                <jsp:include page="/WEB-INF/pages/plugins/footer.jsp"/>
            </div>
        </div>
    </div>
</div>
</body>
</html>