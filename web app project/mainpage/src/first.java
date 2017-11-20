

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;




/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	
//	void showtables(Statement stmt) throws SQLException{
//		
//
//		ResultSet rs=stmt.executeQuery("show tables"); 
//		System.out.println("show table in database of fruitcompany: ");
//		while(rs.next())  
////		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  " +rs.getString(4));  
//		System.out.println(rs.getString(1) 
//						
//				);
//	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	  
	    PrintWriter out = response.getWriter();
	    String docType =
	 	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	    String action  = request.getParameter("submit");
	    
	    out.println(docType + "<html>" +
				"<head>" +
						"First page"+
    				
    			"</head>" +
    			"<body>");
	    
	    
	    
	    if(action == null){
	    
	    
	    if(request.getParameter("UpdateUserInfo") != null){
	    	
	    	String userId = request.getParameter("userID");
	    	String firstName = request.getParameter("fname");
	    	String lastName = request.getParameter("lname");
	    	String password = request.getParameter("password");
	    	String email = request.getParameter("email");
	    	String phone = request.getParameter("mobno");
	    	String address = request.getParameter("address");
	    	String city = request.getParameter("city");
	    	String state = request.getParameter("state");
	    	
	    	
	    	System.out.println("user id in first file: " + userId);
	    	System.out.println("firstName " + firstName);
	    	System.out.println("lastName " + lastName);
	    	System.out.println("password " + password);
	    	
	    	try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/fruitcompany","root","123");  
				Statement stmt=con.createStatement();  
				sqlservice obj = new sqlservice();
        	
//		        DELETE FROM customer_list WHERE email='efef2';
				
				// find the user by email
		        StringBuilder strNewUser = new StringBuilder();
		        strNewUser.append("DELETE FROM customer_list WHERE user_id='");
		        strNewUser.append(userId);
		        strNewUser.append("';");
		        String Query = strNewUser.toString();
		        System.out.println("Query ---> " +Query );
		        stmt.executeUpdate(Query); 
		        
		        
		    	String sql = "INSERT INTO customer_list " +
		                   "VALUES (NULL, 'Zara', 'Ali', 18)";
		        PreparedStatement pre = (PreparedStatement) con.prepareStatement("insert into customer_list values(?,?,?,?,?,?,?,?,?)");//try2 is the name of the table   
		       
	
		    	
		        int UserIDNoChange = Integer.parseInt(userId);
		        		
		        
		        pre.setInt(1,(Integer) UserIDNoChange);
//		        pre.setNull(1, java.sql.Types.INTEGER);
		        pre.setString(2,firstName);        
		        pre.setString(3,lastName);
		        pre.setString(4, password);
		        pre.setString(5,email);
		        pre.setString(6,phone);
		        pre.setString(7,address);
		        pre.setString(8,city);
		        pre.setString(9,state);
		        pre.executeUpdate();
		        
		        
				
				}catch(Exception e){ System.out.println(e);}  
	    	
	    	
	    	HttpSession session = request.getSession(true);	
	        	   
	    		   session.setAttribute("userId",userId); 
	  			   session.setAttribute("userName",firstName); 
	  			   session.setAttribute("firstName",lastName); 
	  			   session.setAttribute("PhoneNumber",phone); 
	  			   session.setAttribute("Address",address);
	  			   session.setAttribute("AddressStreet",address);  //
	  			   session.setAttribute("AddressCity",city);
	  			   session.setAttribute("AddressState",state);
	  			   session.setAttribute("Email",email);
	  			   session.setAttribute("PASSWORD",password);
	    	
	    	RequestDispatcher rd=request.getRequestDispatcher("/account_info.jsp");  
		    rd.forward(request, response);
	    	
	    	out.println(docType + "<html>" +
					"<head>" +
							"Updated user Info"+
	    				
	    			"</head>" +
	    			"<body>");
	    }
	    
	    
	    
	    if (request.getParameter("show databases") != null) {	

	    	out.println(docType + "<html>" +
	    					"<head>" +
	    						"<style>"+
	    					"body { background-color: powderblue; }"+
	    					" div.account{ position:relative;height:	200px ;width:	650px ;  left: 100px; top: 70px; background-color: rgb(232, 185, 218);padding: 30px;}"+	
	    						"</style>"+
	    			
	    					"</head>" +
	    			"<body>");
	    	out.println("<div class = \" account \">");
	    	try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/fruitcompany","root","123");  
				Statement stmt=con.createStatement();  
				sqlservice obj = new sqlservice();
				obj.showtables(stmt);
			
				ResultSet rs=stmt.executeQuery("show tables"); 
				out.println("<h2>show tables in the database of fruitcompany: </h2>  ");
				while(rs.next()){  
					
					String n = rs.getString(1);
					out.println( "<br>" + n + "</br>"); 
				}
				out.println("</div>");
				out.println("</body></html>");
				con.close();  
				
				
				}catch(Exception e){ System.out.println(e);}  
	    
	    }
	    
	    }
	    
	    if (action!= null &&  action.compareTo("sign in") == 0 ) {
	    	
	    	String EMAIL = request.getParameter("email");
	    	String PASSWORD = request.getParameter("password");
	    	String UserId = "";
	    	String errorStr = "";
	    	String errorStrEMAIL = "";
	    	String emptyEMAIL = "";
	    	String NAME= "";
	    	String FirstNAME = "";
	    	String PHPNENUMBER = "";
	    	String ADDRESS1 = "";
	    	String ADDRESS2 = "";
	    	String ADDRESS3 = "";
	    	String ADDRESS = "";
	    	StringBuilder strAddress = new StringBuilder(); 
	    	String ERROR = "";
	    	String GOTPASSWORD = "";
	    	
	    	
	    	System.out.println("############ ");
	    	System.out.println("email: " +EMAIL );
	    	System.out.println("email: " +PASSWORD );
	    	HttpSession session = request.getSession(true);	
	    	
	    	try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fruitcompany","root","123");  
		    
				Statement stmt=con.createStatement();  
				sqlservice obj = new sqlservice();
				obj.showtables(stmt);
								
				StringBuilder str = new StringBuilder();
			

				str.append("SELECT *FROM customer_list WHERE email = \"");
				str.append(EMAIL);
				str.append("\"");
				String target = str.toString();
				System.out.println("Query  " + ">>>" +str +"<<<");
				ResultSet rs=stmt.executeQuery(target); 
				System.out.println("show table in database: ");
				while(rs.next()) {  
				System.out.println( rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  " +rs.getString(4) 
				+"  " +rs.getString(5) +"  " +rs.getString(6) +"  " +rs.getString(7) +"  " +rs.getString(8)
						+"  " +rs.getString(9) 
						
						);
				
				UserId =rs.getString(1);
				NAME = rs.getString(2);
				ERROR = rs.getString(5);
				GOTPASSWORD = rs.getString(4);
				FirstNAME = rs.getString(3);
				PHPNENUMBER = rs.getString(6);
				ADDRESS1 = rs.getString(7);
				ADDRESS2 = rs.getString(8);
				ADDRESS3 = rs.getString(9);
			
				
				}
			
				if(ERROR.equals("")){
					errorStrEMAIL = "Your email doesn't in our customer list, would like to create a new account? ";
				}

				else if(EMAIL.equals(ERROR)  ){
					
					if(PASSWORD.equals(GOTPASSWORD) ){
						System.out.println("password correct");
					}else{					
						errorStr = "wrong password, please try again";			
					}
					
				}
		        
				con.close();
		    }catch(Exception e){ System.out.println(e);
		    	errorStrEMAIL = "Your email doesn't in our customer list, would you like to create a new account? ";
		    ;}  
	    	// check email whether is empty or not 
	    	if(EMAIL.equals("")  ){
	    		System.out.println("------- 0 : email is empty --------");
	    		emptyEMAIL = "Please enter a valid email address";
	    		System.out.println("email is empty");
	    	}
	    	//check email and user name
	    	if(!errorStrEMAIL.equals("") || NAME.equals("")){
	    		System.out.println("-------1: email is wrong  --------");
		    	session.setAttribute("errorStrEMAIL",errorStrEMAIL); 
		    	session.setAttribute("email",EMAIL);
		    	session.setAttribute("emptyEMAIL",emptyEMAIL);
		    	session.setAttribute("password",PASSWORD); 
				RequestDispatcher rd=request.getRequestDispatcher("/wrongemail.jsp");  
				rd.forward(request, response);
	    	}
	    	// check password
	    	else if(!errorStr.equals("")){
	    		System.out.println("-------2 --------");
	    	   errorStrEMAIL = "";
	    	   session.setAttribute("errorStrEMAIL",errorStrEMAIL); 
	 		   session.setAttribute("errorStr",errorStr); 
	 		   session.setAttribute("emptyEMAIL",emptyEMAIL);
	 		   
	 		   session.setAttribute("email",EMAIL); 
		       session.setAttribute("password",PASSWORD); 
	 		   
			   RequestDispatcher rd=request.getRequestDispatcher("/wrongemail.jsp");  
		       rd.forward(request, response);

		   }else{
			  
		    	strAddress.append(ADDRESS1);
		    	strAddress.append(", ");
		    	strAddress.append(ADDRESS2);
		    	strAddress.append(", ");
		    	strAddress.append(ADDRESS3);
		    	ADDRESS = strAddress.toString(); 
		    	
		    	
		       session.setAttribute("userId",UserId); 
			   session.setAttribute("userName",NAME); 
			   session.setAttribute("firstName",FirstNAME); 
			   session.setAttribute("PhoneNumber",PHPNENUMBER); 
			   session.setAttribute("Address",ADDRESS);
			   session.setAttribute("AddressStreet",ADDRESS1);
			   session.setAttribute("AddressCity",ADDRESS2);
			   session.setAttribute("AddressState",ADDRESS3);
			   session.setAttribute("Email",EMAIL);
			   session.setAttribute("PASSWORD",PASSWORD);
			   
			   
//			   initialize CurrentNumItems in shopping cart. Pass CurrentNumItems to show_info page
			   int CurrentNumItems = 0; 
			   session.setAttribute("CurrentNumItems", CurrentNumItems);
			   RequestDispatcher rd=request.getRequestDispatcher("/show_info.jsp");  
		       rd.forward(request, response);
		    		       
		       
//			    out.println(docType + "<html>" + 
//			    			"<head>" +
//				    			"<style>"+
//			    			
//				    			" div.fruitlist{ position:relative; bottom:150px; height:700px ; width:	1010px ; left: 230px; top: 15px; background-image: url(\"wall.jpg\"); }" +
//				    						    			
//				    			"</style>"+    			
//			    			"</head>"+
//			    				"<body>" +
//			    						"<div class = \"fruitlist\" >  " +
//			    					"<h2> --- Hello"  +" "+ NAME   +"  --- </h2>"+
//			    					"<h2>  -- weclome back --  </h2> " +
//			    					" <jsp:forward page=\"show_info.jsp\" /> "+
//			    					"<a href=\"show_info.jsp\">Check Output Page Here </a>" +
//			    						"</div>" +
//			    				"</body>"+
//			    		"</html>");
			   
			   
	    			
	    	}

		}
	    // create a new account
	    if( action!= null && action.compareTo("create a new account") == 0 ){
	    	
	    	String empty = "NULL";
	    	String firstName = request.getParameter("fname");
	    	String lastName = request.getParameter("lname");
	    	String password = request.getParameter("password");
	    	String email = request.getParameter("email");
	    	String phone = request.getParameter("mobno");
	    	String address = request.getParameter("address");
	    	String city = request.getParameter("city");
	    	String state = request.getParameter("state");
	    	
	    	System.out.println("first name: " +firstName );
	    	System.out.println("last name: " +lastName );
	    	System.out.println("password: " +password );
	    	System.out.println("email: " +email );
	    	System.out.println("phone: " +phone );
	    	System.out.println("address " +address );
	    	System.out.println("city: " +city );
	    	System.out.println("state: " +state );
	    	
 	
	    	int countid = 0;
	    	StringBuilder userIDList = new StringBuilder();
	    	HttpSession session = request.getSession(true);	
	    	
	    	
	    	// retrieve all user_id from database system

	    	try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/fruitcompany","root","123");  
		    
				Statement stmt=con.createStatement();  
				sqlservice obj = new sqlservice();

				
				StringBuilder str = new StringBuilder();
			
				str.append("SELECT user_id from customer_list;");		
				String target = str.toString();
				System.out.println("str  " + ">>>" +str +"<<<");
				ResultSet rs=stmt.executeQuery(target); 
				System.out.println("show all user_id in databases: ");
				
				while(rs.next()) {  
						System.out.println( rs.getInt(1) );
						
						userIDList.append(rs.getString(1));
						countid++;
				
				}

		        
				con.close();
		    }catch(Exception f){ System.out.println(f); }
	    	
	    	System.out.println("all user_id: " +userIDList );
	    	System.out.println("how many menbers ? " + countid);
	    	String IdList = userIDList.toString();
	    	
	    	int userId =  countid + 1;
	    	
	    	try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/fruitcompany","root","123");  
//				Statement stmt=con.createStatement();  
//				sqlservice obj = new sqlservice();
//				obj.showtables(stmt);
			    
				System.out.println("the new user id: " + userId);
				
				String sql = "INSERT INTO customer_list " +
		                   "VALUES (NULL, 'Zara', 'Ali', 18)";
		        PreparedStatement pre = (PreparedStatement) con.prepareStatement("insert into customer_list values(?,?,?,?,?,?,?,?,?)");//try2 is the name of the table   
	
		        pre.setInt(1,(Integer) userId);
//		        pre.setNull(1, java.sql.Types.INTEGER);
		        pre.setString(2,firstName);        
		        pre.setString(3,lastName);
		        pre.setString(4, password);
		        pre.setString(5,email);
		        pre.setString(6,phone);
		        pre.setString(7,address);
		        pre.setString(8,city);
		        pre.setString(9,state);
//		        pre.executeQuery();
		        pre.executeUpdate();

				
				}catch(Exception e){ System.out.println(e);}  
	    	
	    		
	    	   String strUserId = Integer.toString(userId);
     	   
 		   	   session.setAttribute("userId",strUserId); 
			   session.setAttribute("userName",firstName); 
			   session.setAttribute("firstName",lastName); 
			   session.setAttribute("PhoneNumber",phone); 
			   session.setAttribute("Address",address);
			   session.setAttribute("AddressStreet",address);  ///
			   session.setAttribute("AddressCity",city);
			   session.setAttribute("AddressState",state);
			   session.setAttribute("Email",email);
			   session.setAttribute("PASSWORD",password);
 	
			  
			   RequestDispatcher rd=request.getRequestDispatcher("/show_info.jsp");  
			   rd.forward(request, response);
	    	
	    	
	    	out.println(docType + "<html>" + 
	    			"<head>" +
		    			"<style>"+
		    			"div.newA{position:relative; height:	250px ; width:	580px ; left: 100px; top: 70px; background-color: rgb(232, 185, 218); padding: 30px;  }" + 
		    			"body {background-color: rgb(240, 240, 245); }"+
		    			"table {width:40%}" +
		    			"</style>"+    			
	    			"</head>"+
	    				"<body>" +	  
		    				"<div class= \"newA \" >" +
		    					"<h2> ---  Account infomration --- </h2> \n"+
		    					"<table> "+
		    						"<tr>" +
		    							"<td> First name : </td>"+ 
		    							 "<td>" + firstName + "</td>" + 
		    						"</tr>"+
		    						"<tr>" +
		    							"<td> Last name : </td>"+ 
		    							"<td>" + lastName + "</td>" + 
		    						"</tr>"+
		    						"<tr>" +
		    							"<td> Password : </td>"+ 
		    							"<td>" + password + "</td>" + 
		    						"</tr>"+
		    						"<tr>" +
		    							"<td> Email : </td>"+ 
		    							"<td>" + email + "</td>" + 
		    						"</tr>"+
		    						"<tr>" +
		    							"<td> Phone : </td>"+ 
		    							"<td>" + phone + "</td>" + 
	    						    "</tr>"+
	    						    "<tr>" +
		    							"<td> Address : </td>"+ 
		    							"<td>" + address + "</td>" + 
		    						"</tr>"+
		    						 "<tr>" +
		    							"<td> City : </td>"+ 
		    							"<td>" + city + "</td>" + 
		    						"</tr>"+
		    						"<tr>" +
		    							"<td> state : </td>"+ 
		    							"<td>" + state + "</td>" + 
		    						"</tr>"+
		    							 
		    					"</table>"+
		    			"<br>"+	
	  
		    			" <button onclick=\"window.location='http://localhost:8080/mainpage/show_info.jsp';\">  buy fruit  </button>   "+
	    			"<a href= \"http://localhost:8080/mainpage/show_info.jsp \" > Buy </a>   "
	    			);
	   
	    
	    out.println("</div>"+ "</body>"+ "</html>");
	    
	    
	    }
	    
	    
	    if( action!= null &&  action.compareTo("buy fruits") == 0 ){
	    	System.out.println("~~~~~~~~~~");
	    	  RequestDispatcher rd=request.getRequestDispatcher("/show_info.jsp");  
	          rd.forward(request, response);
	    }
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
