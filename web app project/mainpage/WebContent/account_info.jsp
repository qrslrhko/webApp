<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="mainfruit.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

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


<title>My account</title>

	 		 <script type="text/javascript">
 		
			 function createtable(x,row){ 
				 
				var table = document.createElement('table');
				table.className="tableelement";
				var tr = document.createElement('tr');  
				
				var td1 = document.createElement('td');
				var words1 = document.createTextNode("Item");
				td1.setAttribute("colspan", 2);
				td1.style.color = 'rgb(102, 93, 82)';
				td1.style.fontFamily  = "Lucida Sans Unicode,Lucida Grande,sans-serif";
								
				var td2 = document.createElement('td');
				td2.style.color = 'rgb(102, 93, 82)';
				td2.style.fontFamily  = "Lucida Sans Unicode,Lucida Grande,sans-serif";
				var words2 = document.createTextNode("Price");
				
				
				var td3 = document.createElement('td');
				td3.style.color = 'rgb(102, 93, 82)';
				td3.style.fontFamily  = "Lucida Sans Unicode,Lucida Grande,sans-serif";
				var words3 = document.createTextNode("Quality");
				
				var td4 = document.createElement('td');
				td4.style.color = 'rgb(102, 93, 82)'
				td4.style.fontFamily  = "Lucida Sans Unicode,Lucida Grande,sans-serif";
				var words4 = document.createTextNode("Total price");
								
				
				td1.appendChild(words1);								
				td2.appendChild(words2);							
				td3.appendChild(words3);							
				td4.appendChild(words4);
				
				tr.appendChild(td1);
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				
				
				table.appendChild(tr);
				
				  for (var i = 0; i < row; i++){
					 var j =0;							 
					 var tr = document.createElement('tr');   
					 
					      var td1 = document.createElement('img');
					      td1.src = x[i][j+1];
					      td1.style.width = '80%'; 
					      
					      var td2 = document.createElement('td');
					      td2.style.width = '40%';
					     		      
					      var td3 = document.createElement('td');					    
					      td3.style.width = '15%';
					      					     
					      var td4 = document.createElement('td');
					      td4.style.width = '15%';

					      var td5 = document.createElement('td');
					      td5.style.width = '20%';
	
					      var text2 = document.createTextNode(x[i][j]);
					      var text3 = document.createTextNode(x[i][j+2]);					      					      					      
					      var text4 = document.createTextNode(x[i][j+3]);
					      var text5 = document.createTextNode(x[i][j+4]);

					      td2.appendChild(text2);
					      td3.appendChild(text3);
					      td4.appendChild(text4);
					      td5.appendChild(text5);

				      tr.appendChild(td1);
				      tr.appendChild(td2);
				 	  tr.appendChild(td3); 
		    		  tr.appendChild(td4);
					  tr.appendChild(td5);

				      table.appendChild(tr);
				  }
				  
				  
				  document.body.appendChild(table);
				  

			} 

			</script> 
			
<!-- 			<script type="text/javascript">
						var a = document.getElementById("thisP");
			/* 			a.style.position='absolute';
						a.style.top = '400px';
						a.style.left = '50px'; */
						a.style.color = 'red';
			</script> -->



</head>
	<body>
			<%@ page language="java" %>
			<%@ page import="java.util.*" %>
			<%@ page import= "java.io.BufferedReader" %>
			<%@ page import= "java.io.FileNotFoundException" %>
			<%@ page import= "java.io.FileReader" %>
			<%@ page import= "java.io.IOException" %>
			<%@ page import= "java.io.PrintWriter" %>
			<%@page import = "java.io.File" %>
			<%@page import = "java.io.Writer" %>
			<%@page import = "java.io.BufferedWriter" %>
			<%@page import = "java.io.FileWriter" %>
			<%@page import = "java.util.Iterator" %>
			<%@page import = "java.util.ListIterator" %>
			<%@page import = "java.util.ArrayList" %>
			<%@page import = "java.util.List" %>
			<%-- <%@page import = "  " %> --%>
			<%! 
			%>

			
<div class= "fruitlistacount">

		<div class = "logo"> </div>
		<div class = "orderHistory" >	
				<h3 class = "fruitTitle"> My account </h3>
				
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
				
				
				<p id="demo"></p>	
 				
				<%String userN =(String)session.getAttribute("userName");  %>
				<% String user =(String)session.getAttribute("userId");  %>

	<%-- 	don't delete <% 
				  StringBuilder temp = new StringBuilder();
				  temp.append(user);
				  temp.append(".txt");
				  String userFilePath = temp.toString();
				  
				  List<String> textFiles = new ArrayList<String>();
				  File dir = new File("/Users/Chiaoysbaby/desktop/pro1/mainpage");
				  for (File file : dir.listFiles()) {
				    if (file.getName().endsWith((userFilePath))) {
				      textFiles.add(file.getName());
				    }
				  }
				  ListIterator<String> listIterator = null;
				 
				  listIterator = textFiles.listIterator();
				  StringBuffer yesfile=  new StringBuffer();
				  
				  while(listIterator.hasNext()){
			           /*  System.out.println(listIterator.next()); */
			            yesfile.append(listIterator.next());
			        }
				  String userFile = yesfile.toString();
				  System.out.println("found file ------>" +userFile );
				  
				%>  --%>
				
				<jsp:include page="makeMatrix.jsp" />  
				
				<!-- check how many fruits, and retrieve details from makeMatrix jsp page -->
				<% 					
					int row = 0;
					String myMatrix =(String)session.getAttribute("itMatrix");
					System.out.println("fruit info in account_info: " +myMatrix );   	
					
					String Strrow =(String)session.getAttribute("row");
					System.out.println("how many different fruits?  " +Strrow );   	
					
					if(!Strrow.equals("0")){					
						 row = Integer.parseInt(Strrow);					
					}
				%>
				<!-- dynamically create fruits items in a table by createtable function   -->
				 <script type="text/javascript">			
					var i;
				 	var j;
				 	var array;

				 	var x = new Array(<%=row%>);
				 	var i;
				 	for (i = 0; i < <%=row%>; i++) {
				 	  x[i] = new Array(<%=row%>);
				 	}	
				 	
				 	if( i!= 0){
						x = [<%= myMatrix %>];  					
						createtable(x,<%=row%>);
				 	}
				</script>
				
	   </div>
	   				<!-- user info -->
					<%
						int maxR = Integer.parseInt(Strrow);
					%>
	   	   			<div class = "account_info_welcomeword">
							<p> Hi, <b> <%out.println( userN); %></b>, this is your order history. </p>		
							<span>
							<%if (maxR ==0){ %>
							<div class = "OrderBackground">
								<p style = "text-align:center" >  <b > No order history.</b> </p>
							</div>
							<%} %>		
							</span>					
					</div>
				
	   
	   
		
	   <div class = "accountInfoBox"> 		
				<% String FirstName =(String)session.getAttribute("firstName");
					System.out.println("first name: " + FirstName);
					
					String PassWord =(String)session.getAttribute("PASSWORD");
					System.out.println("password: " + PassWord);
					
					
					String PhoneNumber =(String)session.getAttribute("PhoneNumber");
					System.out.println("PhoneNumber: " + PhoneNumber);
					
					String Address =(String)session.getAttribute("Address");
					System.out.println("Address: " + Address);
										
					String AddressStreet =(String)session.getAttribute("AddressStreet");
					System.out.println("Address street: " + AddressStreet);
					
					String AddressCity =(String)session.getAttribute("AddressCity");
					System.out.println("Address city : " + AddressCity);
					
					String AddressState =(String)session.getAttribute("AddressState");
					System.out.println("Address state: " + AddressState);
											
					String Email =(String)session.getAttribute("Email");
					System.out.println("Email: " + Email);

					
					 
					String UserId =(String)session.getAttribute("userId");
					System.out.println("UserId: " + UserId);
					

				%>
					<%
						StringBuilder aa = new StringBuilder();
						aa.append("position:absolute; top:400px;left:50px;");
						String adjustLocation = aa.toString();
						request.setAttribute("blah", adjustLocation);
					%>
					
	
					<%
					
						System.out.println("how many row? " + Strrow);
						int maxRow = Integer.parseInt(Strrow);
						int beginningLocation = 400;
						int beginningLocationP = 400;
						int i = 1;
						
						if(maxRow == 0){
							beginningLocation = 300;
							beginningLocationP = 250;
						}
						else{
							for(int j =0; j <= maxRow; j++ ){
								beginningLocation = beginningLocation + (i* 15);
								beginningLocationP =(beginningLocation -48);
								i++;
							}
						}
						StringBuilder divLocation = new StringBuilder();
						String tempStr = Integer.toString(beginningLocation);
						divLocation.append("'");
						divLocation.append(tempStr);
						divLocation.append("px");
						divLocation.append("'");
						
						StringBuilder PLocation = new StringBuilder();
						String PStr = Integer.toString(beginningLocationP);
						PLocation.append("'");
						PLocation.append(PStr);
						PLocation.append("px");
						PLocation.append("'");
						
						System.out.println("word location in account >>> " +PLocation );
						System.out.println("white box location in account >>> " +divLocation );
						String newPLoc = PLocation.toString(); 
						String newDivLoc = divLocation.toString(); 
					%>
					
					
					
					<div id = "thisP"> 
					<p > The is your account information. </p>
					</div>	
					
					<script type="text/javascript">
	 					var a = document.getElementById("thisP");
						a.style.position='absolute';
						a.style.top = <%= newPLoc %>;
						a.style.left = '30px'; 
						

					</script>
					
					<!-- account table information  -->
					<div  id = "thisDiv"  >
						
						<script type="text/javascript">
					    var a = document.getElementById("thisDiv");
						a.style.position='absolute';
						a.style.top = <%= newDivLoc %>;
						a.style.left = '30px'; 
						/* a.style.borderBottom = '2px solid rgb(91, 92, 94)';  */
						a.style.textAlign = 'left';
						a.style.fontWeight =  'bold';
						a.style.padding =  '12px';
						/* a.style.border = '1px solid black';   */
						a.style.color = 'black';
						a.style.fontSize = '130%';
						a.style.width = '75%';
						a.style.background  = 'white';
						a.style.opacity = '0.8';
													 
					</script>
						
						
 						<div  style = " text-align: right;">
						 	<form action = "/mainpage/account_info.jsp#thisDiv" method = "Get" > 
							 	<!-- <a href="#editUserInfo"> -->
								<input   class = "EditButton"  type = "submit" value = "Edit" name ="Editinfo"  />  

								<!-- <input   class = "EditButton"  type = "button" value = "Edit" name ="Editinfo"  />  -->
								<!-- </a> -->
							</form> 
							<% 					    
						    	String editIt = (String)request.getParameter("Editinfo"); 
						    	/* System.out.println("-----> " + editIt); */
						    	
						    	String updateIt = (String)request.getParameter("Updateinfo"); 
						    	/* System.out.println("updateIt -----> " + updateIt); */
						    	
						   
						    %>
									
							<%
							StringBuilder  AddressOut = new StringBuilder();
							AddressOut.append(Address);
							AddressOut.append(", ");
							AddressOut.append(AddressCity);
							AddressOut.append(", ");
							AddressOut.append(AddressState);
							String CombinedAdd = AddressOut.toString();
							%>		
									
									
																		
							
							<% if(editIt != null){ %>
								<form action = "/mainpage/processEdit.jsp" method = "POST" >
									
									<input  class = "AaveButton"  type = "submit" value = "Save" name ="UpdateUserInfo"  /> 
			 						<input type="hidden" value = "<%=UserId %>" name ="userID" >
			 						<input type="hidden" value = "<%=PassWord %>" name ="PassWord" >
		 							
		 							<table >
											  <tr>
												     <%if(editIt != null){  %> 
												      	<td class ="tdEdit"><b> First Name </b></td>
												    	<td class ="tdEdit"> <input type="text" name="fname" value = "<%= userN %>"    ></td>
												    <% } %> 
											  </tr>
											  <tr>
											 		<%if(editIt != null){  %> 
														<td class ="tdEdit"><b> Last Name</b></td>
						    							<td class ="tdEdit">  <input type="text" name="lname" value = "<%= FirstName %>" ></td>
						    						<% } %>  
											  </tr>
											   <tr>
											 		<%if(editIt != null){  %> 
														<td class ="tdEdit"><b> Password</b></td>
						    							<td class ="tdEdit">  <input type="password" name="password" value = "<%= PassWord %>" ></td>
						    						<% } %>  
											  </tr>
											  
											  
											  <tr>
											  		<%if(editIt != null){  %> 
											  	 		<td class ="tdEdit" ><b> Phone Number</b></td>
												    	<td class ="tdEdit"> <input type="text" name="mobno" value = "<%= PhoneNumber %>" ></td>
													<% }%> 
											  </tr>
											  <tr>
											  	  	<%if(editIt != null){  %>   	
						  							 	<td class ="tdEdit" ><b> Email</b></td>
						  		 						<td class ="tdEdit"> <input type="text" name="email" value = "<%= Email %>" ></td>
					  		 						<% }%> 											  
											  </tr>
											  <tr>
											  		 <%if(editIt != null){  %>   
													  	<td class ="tdEdit"><b> Address</b></td>	
													    <td class ="tdEdit"> <input type="text" name="address" value = "<%= AddressStreet %>" ></td>
													    <td class ="tdEdit"> <input type="text" name="city" value = "<%= AddressCity %>" ></td>
													    <td class ="tdEdit"> <input type="text" name="state" value = "<%= AddressState %>" ></td>
												  <% }%> 
											  </tr>
											  
											  
		 							</table>			
		 						
		 						
								</form>
							<% }%>
							
						</div> 
						
		
			
			
						<%--  value = "<%= user %>"   --%>
					 <table >
					  <tr>
						   
						    <%if(editIt == null){ %>
							    <td class ="tdEdit"><b> First Name </b></td>
							    <td class ="tdEdit"> <%= userN %> </td>
						    <%} %>

					  </tr>
 					  <tr>					  
						    <%if(editIt == null){ %>
						    	<td class ="tdEdit"><b> Last Name</b></th>
						    	<td class ="tdEdit"><%= FirstName %></td>
						    <%} %>

					  </tr>		  
					  
					  
 					  <tr>					  					  	
					  		<%if(editIt == null){ %>
							  	<td class ="tdEdit" ><b> Phone Number</b></td>
							  	<td class ="tdEdit"><%= PhoneNumber %></td>			
					  		<%} %>	
					  	
					  </tr>					  
					  <tr>					  
					  		<%if(editIt == null){ %>
							  	<td class ="tdEdit" ><b> Email</b></td>
							  	<td class ="tdEdit"><%= Email %></td>		
					  		<%} %>			
					  </tr>
					  
					  <tr>
						  <%if(editIt == null){  %>   
							  	<td class ="tdEdit"><b> Address</b></td>
							  	<td class ="tdEdit"><%= AddressStreet %> <%=", "%> <%= AddressCity %><%=", "%> <%= AddressState %></td>		
						  <% }%> 		  	

					  </tr> 

	
						<%-- <% System.out.println(">>>>>----------------- Final output: "+ CombinedAdd);%> --%>
			
				</table>
				
	    </div>			
			



     </div>	

	</body>
</html>