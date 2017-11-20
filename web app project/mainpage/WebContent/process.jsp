<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css"> 
<title>process</title>
</head>
	<body>
		<form action="process.jsp" method=post>
		<div class= "account">
		<h3 class = "title_account"> process </h3>
			
			<div class= "accountBox">
			
			<%@ page language="java" %>
			<%@ page import="java.util.*" %>
			<%! 
			%>
			<jsp:useBean id = "obj_phone" class = "classes.action" scope="request"  >
			<jsp:setProperty name="obj_phone" property="*"/>
			</jsp:useBean>
			
					
			
 
			<% 
 				if(obj_phone.validate() == true){
 			%>
					 <%-- <jsp:forward page="show_info.jsp"/>  --%>
					<jsp:forward page = "first" /> 
			<%  
				} 
			 %>
	
				First name: <input type="text" name="fname" value = '<%= obj_phone.getfname() %>'  >
				<span class = "remainder"><br>
				<%	String fname_digits =obj_phone.getFirstNameError(); 
					if(!fname_digits.equals("")){
					out.println("error: " +obj_phone.getFirstNameError());
					}
				%>
				</span>
				<br>
				
				Last name: <input type="text" name="lname" value = '<%= obj_phone.getlname() %>' >
				<span class = "remainder"><br>
				<%	String lname_digits =obj_phone.getLastNameError(); 
					if(!lname_digits.equals("")){
					out.println("error: " +obj_phone.getLastNameError());
					}
				%>
				</span>
				<br>
				
				
				Password: <input type = "password" name= "password" value = '<%= obj_phone.getpassword() %>' > 
				<span class = "remainder"><br>
				<%	String password_digits =obj_phone.getPasswordError(); 
					if(!password_digits.equals("")){
					out.println("error: " +obj_phone.getPasswordError());
					}
				%>
				</span>
				<br>
				
				Email: <input type="text" name="email"  value = '<%= obj_phone.getemail() %>'  >
				<span class = "remainder"><br>
				<%	String email_digits = obj_phone.getEmailError();
					if(!email_digits. equals("")){
					out.println("error: " +obj_phone.getEmailError());
					}
				%>
				</span>
				<br>
				
				Mobile number: <input type="text" name="mobno" value = '<%=obj_phone.getmobno() %>'>				
				<span class = "remainder"><br>
				<%String Pres =obj_phone.getPhoneError(); 
				 if(!Pres.equals("")){ 
					out.println("error: " +obj_phone.getPhoneError());
				 }
				 %>
				</span>
				<br>
	

				Address: <input type="text" name="address"   value = '<%= obj_phone.getaddress() %>'>
				<span class = "remainder"><br>
				<%String add =obj_phone.getAddressError(); 
				 if(!add.equals("")){ 
					out.println("error: " +obj_phone.getAddressError());
				 }
				%> 
				</span>
				<br>
				City: <input type="text" name="city"  value = '<%= obj_phone.getcity() %>' >
				<span class = "remainder"><br>
				<%String cit =obj_phone.getCityError(); 
				 if(!cit.equals("")){ 
					out.println("error: " +obj_phone.getCityError());
				 }
				%> 
				</span>
				State: <select name="state" size="1">
				<!-- <option selected value="">State...</option> -->
				<!-- <option value="None">None</option> -->
<!-- 				<option value="">-- UNITED STATES --</option> -->
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
				<option value="Missouri">Missoquri</option>
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

	
				</select>
			
			<% 
				if(obj_phone.validate() == true){
			%>
					<%-- <jsp:forward page="show_info.jsp"/ --%>>
					<jsp:forward page = "first" />
			<% 
				}
			%>
			
			<input type = "submit" value = "create a new account" name ="submit"  /> 

			</div>

		<!-- 	<br> -->
			
			<form action = "/mainpage/a1.jsp" method = "POST" >					
				<div class = "goMainPage">
						<button class = "AaveButton" > go to welcome page </button>
				</div>
			</form>
			
			
			
			<form action = "/mainpage/show_info.jsp" method = "POST" >
					
				<div class = "goFruitMenu">
						<button class = "AaveButton" > go to fruit menu </button>
				</div>
			</form>
			
			
			
		</div>
		</form>	
	</body>
</html>