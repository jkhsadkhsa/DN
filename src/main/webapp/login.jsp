<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>达内－NetCTOSS</title>
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/styles/global_color.css" />
    </head>
    <body class="index">
    <form action="${pageContext.request.contextPath}/login.do" method="post">
        <div class="login_box">
            <table>
                ${msg}
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="username" type="text" class="width150" /></td>
                    <td class="login_error_info"><span class="required">20长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="password" type="password" class="width150" /></td>
                    <td><span class="required">20长度的字母、数字和下划线</span></td>
                </tr>

                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <button type="submit"><img src="${pageContext.request.contextPath}/images/login_btn.png" /></button>
                    </td>    
                    <td><span class="required"></span></td>                
                </tr>
            </table>
        </div>
    </form>
    </body>
</html>
