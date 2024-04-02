
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios cadastrados</title>
</head>
<body>
	<%@ page import="com.matus.dao.UserDao, com.matus.bean.*, java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ur"%>
	
	<h1>Usuarios:</h1>

	<%
	List<User> list = UserDao.getAllUser();
	request.setAttribute("list", list);
	%>

	<table>
		<tr>
			<th>ID:</th>
			<th>Nome:</th>
			<th>Password:</th>
			<th>Email:</th>
			<th>Sexo:</th>
			<th>Pais:</th>
		</tr>
	</table>

</body>
</html>