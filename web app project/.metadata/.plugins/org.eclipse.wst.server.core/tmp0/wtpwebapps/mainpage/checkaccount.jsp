<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

		 <%-- <%String userid = session.getAttribute("ss").toString(); %>
   		  Hello <%=userid%> --%>
		<%-- <%	String value=request.getParameter("hidden"); %>
		<% out.println("-> " +value);  %> --%>
		<%String data = (String) session.getAttribute("myData"); 
		out.println("-> " +data); 
		%>
</body>
</html>