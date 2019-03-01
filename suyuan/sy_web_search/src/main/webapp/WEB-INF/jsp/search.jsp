<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Cache-Control" content="max-age=300" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${query} - 商品搜索 - 宜立方商城</title>
</head>
<body>
当前第${page}页
一共有${recourdCount}条数据
(这个数据是干啥来着...${totalPages}

    <c:forEach items="${userList}" var="user">
        <br/>
        <a href="https://www.baidu.com/s?ie=UTF-8&wd=${user.id}">详情</a><br/>
        昵称: ${user.nickname}<br/>
        姓名: ${user.name}<br/>
        国家: ${user.country}<br/>
        职务: ${user.duties}<br/>
        公司: ${user.company}<br/>
        公司官网: ${user.officeWebsite}<br/>
    </c:forEach>
</body>
</html>