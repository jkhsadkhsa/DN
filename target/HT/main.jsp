<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>达内－NetCTOSS</title>
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    </head>
    <body class="index">
        <!--导航区域开始-->
        <div id="header">
             <a href="/upload.jsp">
            <span style="color:#af6606; font-size: 25px">
                    图片上传
            </span>
             </a>
            <span style="color: #af6606; font-size: 25px">

                <security:authentication property="principal.username"/>
            </span>
            <a href="${pageContext.request.contextPath}/loginOut.do">
                [退出]
            </a>
        </div>
        <div id="index_navi">
            <ul id="menu">
                <li><a href="${pageContext.request.contextPath}/../main.jsp" class="index_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../role/role_list.jsp" class="role_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../admin/admin_list.jsp" class="admin_off"></a></li>
                <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_FEEADMIN')">
                <li><a href="${pageContext.request.contextPath}/feeController/findAllFee.do" class="fee_off"></a></li>
                </security:authorize>
                <li><a href="${pageContext.request.contextPath}/../account/account_list.jsp" class="account_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../service/service_list.jsp" class="service_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../bill/bill_list.jsp" class="bill_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../report/report_list.jsp" class="report_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../user/user_info.jsp" class="information_off"></a></li>
                <li><a href="${pageContext.request.contextPath}/../user/user_modi_pwd.jsp" class="password_off"></a></li>


            </ul>
        </div>
    </body>
</html>
