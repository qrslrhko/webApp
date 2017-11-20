<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="mainfruit.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>apple</title>

<script> 
$(document).ready(function(){
    $("#menu").click(function(){
        $(".transparency").toggle(10); 
        $(".transparencyAccount").toggle(20);
        $(".transparencyWelcome").toggle(30);
    });

});
</script>

</head>
	<body>
			<%@ page language="java" %>
			<%@ page import="java.util.*" %>
					

			<jsp:useBean id = "obj_checkout" class = "classes.fruitlist" scope="request"  >
			<jsp:setProperty name="obj_checkout" property="*"/>
			</jsp:useBean>			
			
			<div class= "fruitlist">
			
					<div class = "logo">
					</div>
					
					<h3 class = "fruitTitle">Fruits</h3>
					
					<!-- *****  slide: fruits page, account page, and welcome page ***** -->
					<button id = "menu"></button>				
		  			
		  			<a href= "http://localhost:8080/mainpage/show_info.jsp">
					<img id = "FButton">									
					<div class = "transparency">
						<div class ="Fword">fruits </div>	
					</div> 
				 	</a>   
				 	
				 	<a href= "http://localhost:8080/mainpage/account_info.jsp">
					<img id = "AButton" > 
					<div class = "transparencyAccount">
						<div class ="Aword">My account </div>	
					</div> 
					</a>
				 	
				 	<a href= "http://localhost:8080/mainpage/a1.jsp">
						<img class = "WButton" > 
						<div class = "transparencyWelcome">
							<div class ="Wword">Welcome Page </div>	
						</div> 
					</a> 
				 	


				<!-- <h2 class = "fruitTitle"> These are our current fruits, click the picture to get information of fruits.</h2> -->
									
					<% String user =(String)session.getAttribute("userId");  %>					
					<%  System.out.println("-----> "+user );  %>
					<%String userN =(String)session.getAttribute("userName");  %>

					
					<!-- ***** display user name ***** -->
					<div class = "welcomeword">
							<p> Hi, <%out.println( userN); %> <br>
							 Welcome black </p> 
					</div>
										
					<!-- ***** fruit elements ***** -->
					<form action = "/mainpage/tomato.jsp" method = "POST" >
						<input class = "tomato" type="submit" name="tomato" value = "Tomato"  >
					</form>
					
					<form action = "/mainpage/raspberry.jsp" method = "POST" >
						<input class = "raspberry" type="submit" name="raspberry" value = "raspberry"  >
					</form>
										
					<form action = "/mainpage/pear.jsp" method = "POST" >
						<input class = "pear" type="submit" name="pear" value = "pear"  >
					</form>
					
					<form action = "/mainpage/apple.jsp" method = "POST" >
						<input class = "apple" type="submit" name="apple" value = "apple"  >
					</form>
		
			</div>
					<!-- ***** Go to check out page  ***** -->
					<% 
 						if(obj_checkout.submitbutton() == true){
 							String aa = obj_checkout.getcheckoutt();
 							System.out.println("-----> go to check out");
 							System.out.println("-----> " +aa); 									
 					%>		
							<jsp:forward page = "checkout.jsp" /> 
					<%  
						} 
					%>
					
					
			<!-- ***** description of fruits *****  -->
			<!-- ***** add to shopping bag button *****	 -->
			<!-- ***** check out button ***** -->	
			<div class = "rightside" >
					
					<h2 class ="shopBagTitle"> Details in Apple: </h2>
					<p class  = "tomatoDetail" > Our apples are from Oregon's northwestern region near Mt.Hood. Because of the temperature
					and locations, the harvest seasons of apples in Oregon are all year. Our apple variety is Honeycrispy.					   
					</p>
					<br>
					
					
				<div class = "checkout">
						<form action = "/mainpage/apple.jsp" method = "POST" >
							
							<div class = "applePrice">							
							Each one $: 1   <br>
							Quality:
							<select name=apple size="1"  value = '<%= obj_checkout.getapple() %>'  >
							<option value="0">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							</select>
						
							<%@ page import= "java.io.BufferedReader" %>
							<%@ page import= "java.io.FileNotFoundException" %>
							<%@ page import= "java.io.FileReader" %>
							<%@ page import= "java.io.IOException" %>
							<%@ page import= "java.io.PrintWriter" %>
							<%@page import = "java.io.File" %>
							<%@page import = "java.io.Writer" %>
							<%@page import = "java.io.BufferedWriter" %>
							<%@page import = "java.io.FileWriter" %>
							
						<% String apple =obj_checkout.getapple();  %>	
						<%
						if(!apple.equals("") && !apple.equals("0") && !apple.equals("apple")){
							System.out.println("**** apple " + apple); 
							
							String strPath;
							
							if(user == null){
								strPath = "/Users/Chiaoysbaby/desktop/pro1/mainpage/user1.txt";			
							}
							else{
								StringBuilder originalLine = new StringBuilder();
								originalLine.append("/Users/Chiaoysbaby/desktop/pro1/mainpage/");
								StringBuilder userName = new StringBuilder();
								userName.append(user);
								userName.append(".txt");
								
								originalLine.append(userName);
								System.out.println("store to this path: "+">" +originalLine +"<"    );
								
								String newStr = originalLine.toString();
								strPath = new String(newStr); 

							}
						 	
	 						 					 	
						 	
	 						File strFile = new File(strPath);
		 					if (!strFile.exists()) {
		 							System.out.println("create new txt file for the user");
		 							strFile.createNewFile();
		 						}
							/*  boolean fileCreated = strFile.createNewFile(); */
							/*  Writer objWriter = new BufferedWriter(new FileWriter(strFile , true));  */
							 BufferedWriter objWriter = new BufferedWriter(new FileWriter(strFile , true)); 
													
							 StringBuilder a = new StringBuilder(); 
							 a.append("apple");
							 a.append(" ");
							 a.append(apple);
							 String str = a.toString();
							 objWriter.write(str); 
							 objWriter.newLine();
		
							 
							 objWriter.flush();
							 objWriter.close();
						 
						}
						
						%>	
							
						</div>
						
						<!-- display how many items  -->
						<!-- retrieve quality of items in shopping cart from makeMatrix page	 -->					
						
						<button id = "cartInFruit"></button>											
						<jsp:include page="makeMatrix.jsp" />  
						<% 	
						int NumItem = 0;
						int row = 0;
						String myMatrix =(String)session.getAttribute("itMatrix");
						System.out.println("Matrix: " +myMatrix );   	
						
						String Strrow =(String)session.getAttribute("row");
						System.out.println("how many different fruits?  " +Strrow );   	
										
						if(!Strrow.equals("0")){					
							 row = Integer.parseInt(Strrow);					
						}
						
						if(Integer.parseInt(Strrow)== 0){
						%>
							<p class= "countItemsInFruit"></p>
						<% 
							NumItem = 0;
						}					
						else{
							NumItem = (Integer)session.getAttribute("NumberOfItem"); 
							%>
							<p class= "countItemsInFruit"><%=NumItem%></p>
						<% 
						}						 			
						%>
						
						
						<input type = "submit" value = "add to shopping cart" name ="shoppingbag" id = "appleAddButton"  /> 
						</form>

					<form action = "/mainpage/checkout.jsp" method = "POST" >
						<input type = "submit" value = "check out" name ="checkout" id = "appleCheckOutButton"   /> 
					</form>
					
					
					
				</div>		
			</div>	
			
			
			
	</body>
</html>