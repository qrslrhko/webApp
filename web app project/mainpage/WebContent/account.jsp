<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css"> 
<title>new account</title>
</head>
<body>

		


	<!-- <form action = "/mainpage/process.jsp" method = "POST" > -->
		<div class= "account">
			
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

		
		<form action = "/mainpage/process.jsp" method = "POST" >
			<h3 class = "title_account"> Hi, dear our new customer, please provide your information to us </h3> <br>
				<div class = "accountBox">
			 	First name: <input class = "fistAccount" type="text" name="fname"><br>
			 	<br>
				Last name: <input class = "lastAccount"  type="text" name="lname"><br>
				<br>
				Password: <input class = "passwoardAccount"  type = "password" name= "password" placeholder="At least 8 digits"> <span class ="rem_word"  >  </span> <br>
				<br>
				Email: <input class = "emailAccount" type="text" name="email"><br>
				<br>
				Mobile number: <input class = "mobileAccount"  type="text" name="mobno" placeholder="Digits only "> <span class ="rem_word"> </span>  <br>	

				<!-- Address: <textarea rows="5" cols="5" name="address"></textarea><br> -->
				<br>
				Address: <input class = "addressAccount"  type="text" name="address"> 
				City: <input  class = "cityAccount" type="text" name="city"> <br>
				State: <select class = "stateAccount" name="state" size="1">
				<option selected value="">State...</option>
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
				<br>

				<br>
					<input class = "EditButton" type = "submit" value = "create a new account" name ="submit"  /> 
				<!-- <input type = "submit" value = "show databases" name ="show databases"  />  -->
				
				</div>
			<br>
		</div>
	
	</form>
</body>
</html>