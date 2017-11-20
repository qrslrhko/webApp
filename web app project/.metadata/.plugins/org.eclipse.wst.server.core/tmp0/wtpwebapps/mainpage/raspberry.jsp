<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="mainfruit.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Raspberry</title>

<script> 
$(document).ready(function(){
    $("#menu").click(function(){
       /*  $("#panel").toggle(10);  */
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
					
			<%! 
			%>
			<jsp:useBean id = "obj_checkout" class = "classes.fruitlist" scope="request"  >
			<jsp:setProperty name="obj_checkout" property="*"/>
			</jsp:useBean>
					
			<div class= "fruitlist">
			
					<div class = "logo">
					</div>					
					<h3 class = "fruitTitle">Fruits</h3>
					
					<button id = "menu"></button>		
					<!-- <div id="panel">Hello world!</div>  -->
		  			
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

					
					<%String userN =(String)session.getAttribute("userName");  %>
					<% String user =(String)session.getAttribute("userId");  %>
					<div class = "welcomeword">
							<p> Hi, <%out.println( userN); %> <br>
							 Welcome black </p> 
					</div>


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
					 
			
			<div class = "rightside" >
			
					<h2 class ="shopBagTitle"> Details in Raspberry: </h2>
					<p class  = "tomatoDetail" > Our raspberries are from Salem, Albany, Beavercreek and Hillsboro.The raspberry 
							reasons in Oregon are from June to September. Because of great water sources and temperatures in Oregon, 
							 we are proud of our fruits. Our raspberry tastes sweet and less sour. We recommend to eat our fresh
							 raspberry directly, or make it as yogurt or pies. 
					</p>
					<br>
					
					
				<div class = "checkout">
						<form action = "/mainpage/raspberry.jsp" method = "POST" >
							<div class = "raspberryPrice">
							
							Each box $: 3 <br>
							Quality:
							<select name=raspberry size="1"  value = '<%= obj_checkout.getraspberry() %>'  >
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
							
						<% String rasp =obj_checkout.getraspberry();  %>	
						<%
						if(!rasp.equals("") && !rasp.equals("0") && !rasp.equals("raspberry")){
							System.out.println("**** raspberry " + rasp); 
							
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
								System.out.println(">" +strPath +"<" );
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
							 a.append("raspberry");
							 a.append(" ");
							 a.append(rasp);
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
						
						
						<input type = "submit" value = "add to shopping cart" name ="shoppingbag" id = "raspberryAddButton"  /> 
						</form>
					
<%-- 					<% 
						String name=(String)session.getAttribute("numredtomato"); 
						out.println("---> red tomato: "+name); 
						String yellowname=(String)session.getAttribute("numyellowtomato"); 
						out.println("--->yellow tomato: "+yellowname); 
					%>  --%>
					
					
					
					<form action = "/mainpage/checkout.jsp" method = "POST" >
						<input type = "submit" value = "check out" name ="checkout" id = "raspberryCheckOutButton"   /> 
					</form>
					
					
					
				</div>		
			</div>
			
				
	</body>
</html>