<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8" />

<title>Insert title here</title>

</head>

<body>

            错误信息：<h4 th:text="${msg!''}"></h4>

       <form action="toLogin.jhtml" method="post">
       
       	   <p>学校：<input type="text" name="schoolName" value="温州第二中学"/></p>

           <p>学号：<input type="text" name="barcode" value="admin"/></p>

           <p>密码：<input type="text" name="password" value="123456"/></p>

		   <P><input type="checkbox" name="rememberMe" />记住我</P>
           <p><input type="submit" value="登录"/></p>

       </form>

</body>
</html>