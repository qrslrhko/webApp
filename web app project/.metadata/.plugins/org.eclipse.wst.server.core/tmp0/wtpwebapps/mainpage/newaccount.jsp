<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css"> 
<title>customer info</title>
</head>
	<body>
		<form action = "first" method = "POST" >
		<div class= "account">
			<h3> Hi, dear our new customer, please provide your information to us </h3>
			
			 	First name: <input type="text" name="fname"><br>
				Last name: <input type="text" name="lname"><br>
				Password: <input tyle = "password" name= "password"> <br>
				Email: <input type="text" name="email"><br>
				Mobile number: <input type="text" name="mobno"><br>
				
				
				<%@ page language="java" %>
				<%@ page import="java.util.*" %>
				<%! 
				%>
				<jsp:useBean id = "obj_phone" class = "classes.action" scope="request"  >
				<jsp:setProperty name="obj_phone" property="*"/>
				</jsp:useBean>
				<p>Got message....</p>
				
				<p>Student Last Name: 
        		 <jsp:getProperty name = "obj_phone" property = "mobno"/>
      			</p>
				
				<%  
					boolean aa	 = obj_phone.validate();
					out.println("bool  " + aa);
				
				%> 
				
				
				<br>
				<% String data = "myDataAsString";
				   String value=request.getParameter("mobno");
				session.setAttribute("myData", data );%> 
	
				<br>
				<%-- <h2>result: ${obj_phone.result}</h2> --%>

				<!-- Address: <textarea rows="5" cols="5" name="address"></textarea><br> -->
				Address: <input type="text" name="address"> 
				City: <input type="text" name="city">
				<!-- State: <input type="text" name="state"><br> -->
				State: <select name="state" size="1">
				<option selected value="">State...</option>
				<option value="None">None</option>
				<option value="">-- UNITED STATES --</option>
				<option value="Alabama">Alabama</option>
				<option value="Alaska">Alaska</option>
				<option value="Arizona">Arizona</option>
				<option value="Arkansas">Arkansas</option>
				<option value="California">California</option>
				<option value="Colorado">Colorado</option>
				<option value="Connecticut">Connecticut</option>
				<option value="Delaware">Delaware</option>
				<option value="Florida">Florida</option>
				<option value="Georgia">Georgia</option>
				<option value="Hawaii">Hawaii</option>
				<option value="Idaho">Idaho</option>
				<option value="Illinois">Illinois</option>
				<option value="Indiana">Indiana</option>
				<option value="Iowa">Iowa</option>
				<option value="Kansas">Kansas</option>
				<option value="Kentucky">Kentucky</option>
				<option value="Louisiana">Louisiana</option>
				<option value="Maine">Maine</option>
				<option value="Maryland">Maryland</option>
				<option value="Massachusetts">Massachusetts</option>
				<option value="Michigan">Michigan</option>
				<option value="Minnesota">Minnesota</option>
				<option value="Mississippi">Mississippi</option>
				<option value="Missouri">Missouri</option>
				<option value="Montana">Montana</option>
				<option value="Nebraska">Nebraska</option>
				<option value="Nevada">Nevada</option>
				<option value="New Hampshire">New Hampshire</option>
				<option value="New Jersey">New Jersey</option>
				<option value="New Mexico">New Mexico</option>
				<option value="New York">New York</option>
				<option value="North Carolina">North Carolina</option>
				<option value="North Dakota">North Dakota</option>
				<option value="Ohio">Ohio</option>
				<option value="Oklahoma">Oklahoma</option>
				<option value="Oregon">Oregon</option>
				<option value="Pennsylvania">Pennsylvania</option>
				<option value="Rhode Island">Rhode Island</option>
				<option value="South Carolina">South Carolina</option>
				<option value="South Dakota">South Dakota</option>
				<option value="Tennessee">Tennessee</option>
				<option value="Texas">Texas</option>
				<option value="Utah">Utah</option>
				<option value="Vermont">Vermont</option>
				<option value="Virginia">Virginia</option>
				<option value="Washington">Washington</option>
				<option value="West Virginia">West Virginia</option>
				<option value="Wisconsin">Wisconsin</option>
				<option value="Wyoming">Wyoming</option>
				<option value="">-- CANADA --</option>
				<option value="Alberta">Alberta</option>
				<option value="British Columbia">British Columbia</option>
				<option value="Manitoba">Manitoba</option>
				<option value="New Brunswick">New Brunswick</option>
				<option value="Newfoundland and Labrador">Newfoundland and Labrador</option>
				<option value="Northwest Territories">Northwest Territories</option>
				<option value="Nova Scotia">Nova Scotia</option>
				<option value="Nunavut">Nunavut</option>
				<option value="Ontario">Ontario</option>
				<option value="Prince Edward Island">Prince Edward Island</option>
				<option value="Quebec">Quebec</option>
				<option value="Saskatchewan">Saskatchewan</option>
				<option value="Yukon Territory">Yukon Territory</option>
				<option value="">-- AUSTRALIA --</option>
				<option value="Australian Capital Territory">Australian Capital Territory</option>
				<option value="New South Wales">New South Wales</option>
				<option value="Northern Territory">Northern Territory</option>
				<option value="Queensland">Queensland</option>
				<option value="South Australia">South Australia</option>
				<option value="Tasmania">Tasmania</option>
				<option value="Victoria">Victoria</option>
				<option value="Western Australia">Western Australia</option>
				</select>
			
				<input type = "submit" value = "create a new account" name ="submit"  /> 
				<input type = "submit" value = "show databases" name ="show databases"  /> 
			<br>
		</div>
		</form>
	</body>
</html>