<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css"> 
<title>Insert title here</title>
</head>
<body>
			<%@ page language="java" %>
			<%@ page import="java.util.*" %>
			<%! 
			%>
			<jsp:useBean id = "obj_phone" class = "classes.action" scope="request"  >
			<jsp:setProperty name="obj_phone" property="*"/>
			</jsp:useBean>
<%-- 			<h2> phone:  <jsp:getProperty name = "obj_phone" property = "mobno"/> 
      		</h2> --%>				
				<br>	
			<% 
					String Pres =obj_phone.getPhoneError(); 
					if(!Pres.equals("")){
						out.println("error: " +obj_phone.getPhoneError());
					}
			%> 
</body>
</html>