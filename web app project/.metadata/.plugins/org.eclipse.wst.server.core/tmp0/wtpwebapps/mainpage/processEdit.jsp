<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="mainfruit.css"> 
<title>Insert title here</title>
	 		 <script type="text/javascript">
 		
			 function createtable(x,row){ 
				 
				var table = document.createElement('table');
				table.className="tableelement";

				var tr = document.createElement('tr');  
				
				var td1 = document.createElement('td');
				var words1 = document.createTextNode("Item");
				td1.setAttribute("colspan", 2);
				td1.style.color = 'rgb(102, 93, 82)';
								
				var td2 = document.createElement('td');
				td2.style.color = 'rgb(102, 93, 82)';
				var words2 = document.createTextNode("Price");
				
				var td3 = document.createElement('td');
				td3.style.color = 'rgb(102, 93, 82)';
				var words3 = document.createTextNode("Quality");
				
				var td4 = document.createElement('td');
				td4.style.color = 'rgb(102, 93, 82)'
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
				<%@page import = "java.util.Arrays" %> 
				<%! 
				%>
				
				<jsp:useBean id = "updateObj" class = "classes.action" scope="request"  >
				<jsp:setProperty name="updateObj" property="*"/>
				</jsp:useBean>
				
				
				
				
				
				
				
				
<!-- 	<form action="processEdit.jsp#thisDiv" method=post>		 -->			 
 				
 				<% if(updateObj.validate() == true){ %>		 			
							<jsp:forward page = "first" /> 					 
				<% } %> 
				
					
<!-- 				<div class = "fruitButtoncheck">
					<a href= "http://localhost:8080/mainpage/show_info.jsp">
					<img class = "fruitButtonGo"  > 
					</a>
					fruits
				</div> 
			
				<div class = "accountButton" >
					<a href= "http://localhost:8080/mainpage/account_info.jsp ">
					<img class = "accountButtonGo"  > 
					</a>
					My account
				</div>  -->
				
				
				
					
				
				<div class= "fruitlistacount">
				<h3 class = "fruitTitle"> My account </h3>
				
 					<button id = "menu"></button>	
 					<div class = "logo"> </div>	
		  			
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
				
<form action="processEdit.jsp#thisDiv" method=post>						
				<p id="demo"></p>	
 				
				<%String userN =(String)session.getAttribute("userName");  %>
				<% String user =(String)session.getAttribute("userId");  %>
				<% String addState =(String)session.getAttribute("AddressState");  %>
					<%-- <div class = "account_info_welcomeword">
							<p> Hi, <b> <%out.println( userN); %></b>, this is your order history. </p>							
					</div>
				 --%>
				
				<% 
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
				  
				%> 
	
				<jsp:include page="makeMatrix.jsp" />  
			
 				<% 
				
					int row = 0;
					String myMatrix =(String)session.getAttribute("itMatrix");
					System.out.println("values in account_info: " +myMatrix );   	
					
					String Strrow =(String)session.getAttribute("row");
					System.out.println("how many different fruits?  " +Strrow );   	
					
					if(!Strrow.equals("0")){
					
						 row = Integer.parseInt(Strrow);					
					}
				%>
			
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
				
					<%
						int maxR = Integer.parseInt(Strrow);
					%>
	   	   			<div class = "account_info_welcomeword">
							<p> Hi, <b> <%out.println( userN); %></b>, this is your order history. </p>		
							<span>
							<%if (maxR ==0){ %>
							<p style = "text-align:center" >  <b > No order history.</b> </p>
							<%} %>		
							</span>					
					</div>
				
				
						<%
					
						System.out.println("how many row? " + Strrow);
						int maxRow = Integer.parseInt(Strrow);
						int beginningLocation = 400;
						int beginningLocationP = 400;
						
						
						if(maxRow == 0){
							beginningLocation = 300;
							beginningLocationP = 250;
						}
						else{
							System.out.println("maxRow: " + maxRow);
							for(int i =0; i <= maxRow; i++ ){
								/* System.out.println("maxRow: " + maxRow); */
				/* 				if(maxRow >=3){
									System.out.println("3333");
									beginningLocation = beginningLocation + 40;
									beginningLocationP = beginningLocationP + 25; 
								}
								else{
									System.out.println("2222");
									beginningLocation = beginningLocation + 30;
									beginningLocationP = beginningLocationP + 5; 
								} */
								if(maxRow == 4){
									System.out.println("maxRow == 4 ");
									/* beginningLocation = beginningLocation + (i* 1); */
									beginningLocationP = (beginningLocation -50);
									i++;
								}
								if(maxRow == 3){
									System.out.println("maxRow == 3 ");
									beginningLocation = beginningLocation + (i* 70);
									beginningLocationP =(beginningLocation -50);
									i++;
								}else{
									System.out.println("else:  " +maxRow );
									beginningLocation = beginningLocation + (i* 55);
									beginningLocationP =(beginningLocation -50);
									i++;									
								}
								

								
							}
						}
						
						StringBuilder divLocation = new StringBuilder();
						String tempStr = Integer.toString(beginningLocation);
						//white box location
						divLocation.append("'");
						divLocation.append(tempStr);
						divLocation.append("px");
						divLocation.append("'");
						
						StringBuilder PLocation = new StringBuilder();
						String PStr = Integer.toString(beginningLocationP);
						// word location
						PLocation.append("'");
						PLocation.append(PStr);
						PLocation.append("px");
						PLocation.append("'");
						
						System.out.println("word location >>> " +PLocation );
						System.out.println("white box location >>> " +divLocation );
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
				<div  id = "thisDiv"  >
					
						<script type="text/javascript">
					    var a = document.getElementById("thisDiv");
						a.style.position='absolute';
						a.style.top = <%= newDivLoc %>;
						a.style.left = '30px'; 
						/* a.style.borderBottom = '2px solid rgb(91, 92, 94)'; */
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
						

		
		
				<% 
				String UserId =(String)session.getAttribute("userId");
					System.out.println("UserId: " + UserId);
				%>
				
				<% String State =(String)session.getAttribute("AddressState");  %>
				<div  style = " text-align: right;">
				<input  class = "AaveButton"  type = "submit" value = "Save" name ="UpdateUserInfo"  /> 
			 	<input type="hidden" value = "<%=UserId %>" name ="userID" >
				</div>		
					 <table >
					  <tr style = " padding:5px;">

						      	<td  style = " padding:5px; width:110px"  ><b> First Name </b></td>
						    	<td  style = " padding:5px; width:100px" > <input type="text" name="fname" value = '<%= updateObj.getfname() %>'  ></td>
 						     	<span >
								<%	String fname_digits =updateObj.getFirstNameError();  %>
								<%	if(!fname_digits.equals("")){  %>
										<td  style = " padding:5px;  color:red; font-size:80%; width:400px" > <%= updateObj.getFirstNameError() %></td>
								<%} %>								
								</span> 
					  </tr style = " padding:5px;">
 	 				   <tr style = " padding:5px;">			
								<td style = " padding:5px; width:110px" ><b> Last Name</b></th>
						    	<td style = " padding:5px; width:100px" >  <input type="text" name="lname" value = '<%= updateObj.getlname() %>' ></td>
								<span >
								<%	String lname_digits =updateObj.getLastNameError();  %>
								<%	if(!lname_digits.equals("")){ %>
										<td  style = " padding:5px;  color:red; font-size:80%; width:400px" > <%= updateObj.getLastNameError() %> </td>
								<%	} %>							
								</span>
					  </tr style = " padding:5px;">
					  
					   <tr style = " padding:5px;">			
								<td style = " padding:5px; width:110px" ><b> Password</b></th>
						    	<td style = " padding:5px; width:100px" >  <input type="password" name="password" value = '<%= updateObj.getpassword() %>' ></td>
								<span >
								<%	String password_digits =updateObj.getPasswordError();   %>
								<%	if(!password_digits.equals("")){ %>
										<td  style = " padding:5px;  color:red; font-size:80%; width:400px" > <%= updateObj.getPasswordError() %> </td>
								<%	} %>							
								</span>
					  </tr style = " padding:5px;">
					  
					  
					  
				   <tr style = " padding:5px;">
					  			<td style =  " padding:5px; width:200px" ><b> Phone Number</b></td>
							    <td style = " padding:5px;width:100px"> <input type="text" name="mobno"value = '<%=updateObj.getmobno() %>' ></td>
					  			<span class = "remainderInEdit">
									<%String Pres =updateObj.getPhoneError();  %>
									<% if(!Pres.equals("")){  %>
										<td  style = " padding:5px; color:red; font-size:80%; width:400px" > <%= updateObj.getPhoneError()%> </td>
									<% } %>
									
								</span>					  
					 </t style = " padding:5px;"r>
				     <tr style = " padding:5px;">
					  			<td style =  "padding:5px; width:110px" ><b> Email</b></td>
							    <td style = "padding:5px; width:150px "> <input type="text" name="email"  value = '<%= updateObj.getemail() %>' ></td>
					  			<span class = "remainderInEdit">
									<% String email_digits = updateObj.getEmailError(); %>
									<% if(!Pres.equals("")){  %>
										<td style = " padding:5px; color:red; font-size:80%; width:400px"> <%= updateObj.getEmailError() %> </td>
									<% } %>									
								</span>					  
					 </tr style = " padding:5px;">
					 
					 <tr style = " padding:5px;">
					 			<td style =  " padding:5px; width:110px"><b> Address</b></td>	
					 			<td style =  " padding:5px; width:110px"> <input type="text" name="address"  value = '<%= updateObj.getaddress() %>'></td>
						    	<td style =  "  padding:5px; width:110px"> <input type="text" name="city" value = '<%= updateObj.getcity() %>'  ></td>
						   		<td style =  "  padding:5px; width:110px"> State: <select id ="state" name="state" size="1">
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
													
											        String[] states = {"California", "Alabama", "Arkansas", "Arizona", "Alaska", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };

											        // State names in alphabetical order

											        Arrays.sort(states);
											        int index = 0; 
													int sizeofState = states.length;
											        for(int i =0; i <sizeofState; i++ ){
											        //	System.out.println("-> "+states[i] );
											        	if(states[i].equals(addState)){
											        		index = i;
											        	}
											        }
											        
											        String idx = Integer.toString(index);
											       // System.out.println("-----> index " + idx);
													%>
													
													
													<% String aa = "5"; %>
													<script type="text/javascript">
													var str = <%=idx%>;
			<%-- 										 var maxRange = document.getElementById("state").options.length;
													var se;
													var str = <%=aa%>;
													for(var i =0; i<maxRange ; i++){
														 var x = document.getElementById("state").options[i].text;
															if(x == str){
																
																se = i;
															}
															
													} 
													 --%>
													  var element = document.getElementById('state');
													 <%--  element.getElementById("state").value = '<%=aa %>'; --%>
													  /*  element.selectedIndex = se;  */
													   element.selectedIndex = str;  
													  /* element.selectedIndex = "2";  */
					   							   	
					   							   	/* 	element.setAttribute("value", "West Virginia"); */
					   								 
					 								</script>
														   		
						   		</td style = " padding:5px;">
						   		 <tr style = " padding:5px;">
						   		<span >
								<%String add =updateObj.getAddressError();  %> 
								<%if(!add.equals("")){  %> 
									<td  colspan="3" style = " padding:5px; color:red; font-size:80%; width:400px"> <%= updateObj.getAddressError() %> </td>
								<%}%> 				
								</span>
								 </tr style = " padding:5px;">
			 					 <tr style = " padding:5px;">
								<span>
								<%String add2 =updateObj.getCityError();  %> 
								<%if(!add2.equals("")){  %> 
									<td  colspan="3" style = " padding:5px; color:red; font-size:80%; width:400px"> <%= updateObj.getCityError() %> </td>
								<%}%> 				
								</span>						   		
						   		 </tr style = " padding:5px;" > 
					  </tr>
					  
					  
					  

			
				</table>
				
					 	<%
					 	System.out.println("------>got state " + addState);
					 	%>
			
			</div>	
			
		<form>
	
	
	</body>
</html>