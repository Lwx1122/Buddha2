<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>展示部门</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<jsp:include page="/back.jsp"></jsp:include>

  </head>
  
 
   <body data-type="generalComponents">

     
                <div class="tpl-block">
                    <div class="am-g">
                        <div class="am-u-sm-12 am-u-md-6">
                            <div class="am-btn-toolbar">
                                <div class="am-btn-group am-btn-group-xs">
                                    <button type="button" class="am-btn am-btn-default am-btn-success"><span class="am-icon-plus"></span> 新增</button>
                                    <button type="button" class="am-btn am-btn-default am-btn-secondary"><span class="am-icon-save"></span> 保存</button>
                                    <button type="button" class="am-btn am-btn-default am-btn-warning"><span class="am-icon-archive"></span> 审核</button>
                                    <button type="button" class="am-btn am-btn-default am-btn-danger"><span class="am-icon-trash-o"></span> 删除</button>
                                </div>
                            </div>
                        </div>
                        <div class="am-u-sm-12 am-u-md-3">
                            <div class="am-form-group">
                                <select data-am-selected="{btnSize: 'sm'}">
              <!-- <option value="option1">所有部门</option>
              <option value="option2">人事部</option>
              <option value="option3">财务部</option>
              <option value="option3">放映部</option>
              <option value="option3">销售部</option>
              <option value="option3">后勤部</option> -->
              <c:forEach  items="${deptList}" var="dept">
            	  <option value="${dept.DEPARTNUM}">${dept.DEPTNAME}</option>
            	   
              </c:forEach>
             
            </select>
                            </div>
                        </div>
                        <div class="am-u-sm-12 am-u-md-3">
                            <div class="am-input-group am-input-group-sm">
                                <input type="text" class="am-form-field">
                                <span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-am-btn-success am-icon-search" type="button"></button>
          </span>
                            </div>
                        </div>
                    </div>
                    <div class="am-g">
                        <div class="am-u-sm-12">
                            <form class="am-form">
                           
                                <table class="am-table am-table-striped am-table-hover table-main">
                                    <thead>
                                        <tr>
                                            <th class="table-check"><input type="checkbox" class="tpl-table-fz-check"></th>
                                            <th class="table-id">ID</th>
                                            <th class="table-title">部门编号</th>
                                            <th class="table-type">部门名称</th>
                                            <th class="table-author am-hide-sm-only">成立时间</th>
                                            <th class="table-date am-hide-sm-only">部门状态</th>
                                            <th class="table-set">操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${deptList}" var="dept">
                                        <tr>
                                            <td><input type="checkbox"></td>
                                            <td>${dept.ID }</td>
                                            <!-- {DEPARTNUM=1, DEPTNAME=人事部, STATU=0, ADDTIME=2018-10-17 21:32:21.0, ID=1}, -->
                                            <td><a href="#">${dept.DEPARTNUM }</a></td>
                                            <td>${dept.DEPTNAME }</td>
                                            <td class="am-hide-sm-only">${dept.ADDTIME }</td>
                                            <c:if test="${dept.STATU==0}">
                                            <td class="am-hide-sm-only">使用中</td>
                                            </c:if>
                                            <c:if test="${dept.STATU==1}">
                                            <td class="am-hide-sm-only">暂停使用</td>
                                            </c:if>
                                            
                                            <td>
                                                <div class="am-btn-toolbar">
                                                    <div class="am-btn-group am-btn-group-xs">
                                                        <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</button>
                                                        <button class="am-btn am-btn-default am-btn-xs am-hide-sm-only"><span class="am-icon-copy"></span> 复制</button>
                                                        <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                      </c:forEach>
                </div>
                <div class="tpl-alert"></div>
            </div>










        </div>

    </div>

  </body>
</html>
