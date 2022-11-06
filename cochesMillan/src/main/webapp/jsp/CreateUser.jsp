
<%@page import="com.jacaranda.UserControl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.jacaranda.User"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//cogemos los datos
			String user = request.getParameter("user");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String surname = request.getParameter("surname");
			String gender = request.getParameter("gender");
			String birthday  = request.getParameter("birthday");
			boolean administrador = false;
			boolean genderB = true;
			if(gender.equals("Femenino")){
				genderB = false;
			}
			
			//Insertamos los datos
			User u = new User(user,password,name,surname,genderB,birthday,administrador);
			UserControl.addUser(u);
			
		%>
		<jsp:forward page='../html/Index.html'></jsp:forward>
	</body>
</html>