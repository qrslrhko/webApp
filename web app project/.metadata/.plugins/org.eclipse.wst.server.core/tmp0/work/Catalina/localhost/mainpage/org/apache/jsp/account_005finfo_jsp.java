/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2017-11-20 16:02:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public final class account_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
			
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"mainfruit.css\"> \n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script> \n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#menu\").click(function(){\n");
      out.write("       /*  $(\"#panel\").toggle(10);  */\n");
      out.write("\t\t$(\".transparency\").toggle(10);  \n");
      out.write("        $(\".transparencyAccount\").toggle(20);\n");
      out.write("        $(\".transparencyWelcome\").toggle(30); \n");
      out.write("    });\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>My account</title>\n");
      out.write("\n");
      out.write("\t \t\t <script type=\"text/javascript\">\n");
      out.write(" \t\t\n");
      out.write("\t\t\t function createtable(x,row){ \n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t\tvar table = document.createElement('table');\n");
      out.write("\t\t\t\ttable.className=\"tableelement\";\n");
      out.write("\t\t\t\tvar tr = document.createElement('tr');  \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar td1 = document.createElement('td');\n");
      out.write("\t\t\t\tvar words1 = document.createTextNode(\"Item\");\n");
      out.write("\t\t\t\ttd1.setAttribute(\"colspan\", 2);\n");
      out.write("\t\t\t\ttd1.style.color = 'rgb(102, 93, 82)';\n");
      out.write("\t\t\t\ttd1.style.fontFamily  = \"Lucida Sans Unicode,Lucida Grande,sans-serif\";\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\tvar td2 = document.createElement('td');\n");
      out.write("\t\t\t\ttd2.style.color = 'rgb(102, 93, 82)';\n");
      out.write("\t\t\t\ttd2.style.fontFamily  = \"Lucida Sans Unicode,Lucida Grande,sans-serif\";\n");
      out.write("\t\t\t\tvar words2 = document.createTextNode(\"Price\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar td3 = document.createElement('td');\n");
      out.write("\t\t\t\ttd3.style.color = 'rgb(102, 93, 82)';\n");
      out.write("\t\t\t\ttd3.style.fontFamily  = \"Lucida Sans Unicode,Lucida Grande,sans-serif\";\n");
      out.write("\t\t\t\tvar words3 = document.createTextNode(\"Quality\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar td4 = document.createElement('td');\n");
      out.write("\t\t\t\ttd4.style.color = 'rgb(102, 93, 82)'\n");
      out.write("\t\t\t\ttd4.style.fontFamily  = \"Lucida Sans Unicode,Lucida Grande,sans-serif\";\n");
      out.write("\t\t\t\tvar words4 = document.createTextNode(\"Total price\");\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\ttd1.appendChild(words1);\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\ttd2.appendChild(words2);\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\ttd3.appendChild(words3);\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\ttd4.appendChild(words4);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\ttr.appendChild(td1);\n");
      out.write("\t\t\t\ttr.appendChild(td2);\n");
      out.write("\t\t\t\ttr.appendChild(td3);\n");
      out.write("\t\t\t\ttr.appendChild(td4);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\ttable.appendChild(tr);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  for (var i = 0; i < row; i++){\n");
      out.write("\t\t\t\t\t var j =0;\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t var tr = document.createElement('tr');   \n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t      var td1 = document.createElement('img');\n");
      out.write("\t\t\t\t\t      td1.src = x[i][j+1];\n");
      out.write("\t\t\t\t\t      td1.style.width = '80%'; \n");
      out.write("\t\t\t\t\t      \n");
      out.write("\t\t\t\t\t      var td2 = document.createElement('td');\n");
      out.write("\t\t\t\t\t      td2.style.width = '40%';\n");
      out.write("\t\t\t\t\t     \t\t      \n");
      out.write("\t\t\t\t\t      var td3 = document.createElement('td');\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t      td3.style.width = '15%';\n");
      out.write("\t\t\t\t\t      \t\t\t\t\t     \n");
      out.write("\t\t\t\t\t      var td4 = document.createElement('td');\n");
      out.write("\t\t\t\t\t      td4.style.width = '15%';\n");
      out.write("\n");
      out.write("\t\t\t\t\t      var td5 = document.createElement('td');\n");
      out.write("\t\t\t\t\t      td5.style.width = '20%';\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t      var text2 = document.createTextNode(x[i][j]);\n");
      out.write("\t\t\t\t\t      var text3 = document.createTextNode(x[i][j+2]);\t\t\t\t\t      \t\t\t\t\t      \t\t\t\t\t      \n");
      out.write("\t\t\t\t\t      var text4 = document.createTextNode(x[i][j+3]);\n");
      out.write("\t\t\t\t\t      var text5 = document.createTextNode(x[i][j+4]);\n");
      out.write("\n");
      out.write("\t\t\t\t\t      td2.appendChild(text2);\n");
      out.write("\t\t\t\t\t      td3.appendChild(text3);\n");
      out.write("\t\t\t\t\t      td4.appendChild(text4);\n");
      out.write("\t\t\t\t\t      td5.appendChild(text5);\n");
      out.write("\n");
      out.write("\t\t\t\t      tr.appendChild(td1);\n");
      out.write("\t\t\t\t      tr.appendChild(td2);\n");
      out.write("\t\t\t\t \t  tr.appendChild(td3); \n");
      out.write("\t\t    \t\t  tr.appendChild(td4);\n");
      out.write("\t\t\t\t\t  tr.appendChild(td5);\n");
      out.write("\n");
      out.write("\t\t\t\t      table.appendChild(tr);\n");
      out.write("\t\t\t\t  }\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  document.body.appendChild(table);\n");
      out.write("\t\t\t\t  \n");
      out.write("\n");
      out.write("\t\t\t} \n");
      out.write("\n");
      out.write("\t\t\t</script> \n");
      out.write("\t\t\t\n");
      out.write("<!-- \t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\tvar a = document.getElementById(\"thisP\");\n");
      out.write("\t\t\t/* \t\t\ta.style.position='absolute';\n");
      out.write("\t\t\t\t\t\ta.style.top = '400px';\n");
      out.write("\t\t\t\t\t\ta.style.left = '50px'; */\n");
      out.write("\t\t\t\t\t\ta.style.color = 'red';\n");
      out.write("\t\t\t</script> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("<div class= \"fruitlistacount\">\n");
      out.write("\n");
      out.write("\t\t<div class = \"logo\"> </div>\n");
      out.write("\t\t<div class = \"orderHistory\" >\t\n");
      out.write("\t\t\t\t<h3 class = \"fruitTitle\"> My account </h3>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<button id = \"menu\"></button>\t\t\n");
      out.write("\t\t  \t\t\t\n");
      out.write("\t  \t\t\t\t<a href= \"http://localhost:8080/mainpage/show_info.jsp\">\n");
      out.write("\t\t\t\t\t<img id = \"FButton\">\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class = \"transparency\">\n");
      out.write("\t\t\t\t\t\t<div class =\"Fword\">fruits </div>\t\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t \t</a>   \n");
      out.write("\t\t\t\t \t\n");
      out.write("\t\t \t\t \t<a href= \"http://localhost:8080/mainpage/account_info.jsp\">\n");
      out.write("\t\t\t\t\t<img id = \"AButton\" > \n");
      out.write("\t\t\t\t\t<div class = \"transparencyAccount\">\n");
      out.write("\t\t\t\t\t\t<div class =\"Aword\">My account </div>\t\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t \t\n");
      out.write("\t\t\t\t \t<a href= \"http://localhost:8080/mainpage/a1.jsp\">\n");
      out.write("\t\t\t\t\t\t<img class = \"WButton\" > \n");
      out.write("\t\t\t\t\t\t<div class = \"transparencyWelcome\">\n");
      out.write("\t\t\t\t\t\t\t<div class =\"Wword\">Welcome Page </div>\t\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<p id=\"demo\"></p>\t\n");
      out.write(" \t\t\t\t\n");
      out.write("\t\t\t\t");
String userN =(String)session.getAttribute("userName");  
      out.write("\n");
      out.write("\t\t\t\t");
 String user =(String)session.getAttribute("userId");  
      out.write('\n');
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "makeMatrix.jsp", out, false);
      out.write("  \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- check how many fruits, and retrieve details from makeMatrix jsp page -->\n");
      out.write("\t\t\t\t");
 					
					int row = 0;
					String myMatrix =(String)session.getAttribute("itMatrix");
					System.out.println("fruit info in account_info: " +myMatrix );   	
					
					String Strrow =(String)session.getAttribute("row");
					System.out.println("how many different fruits?  " +Strrow );   	
					
					if(!Strrow.equals("0")){					
						 row = Integer.parseInt(Strrow);					
					}
				
      out.write("\n");
      out.write("\t\t\t\t<!-- dynamically create fruits items in a table by createtable function   -->\n");
      out.write("\t\t\t\t <script type=\"text/javascript\">\t\t\t\n");
      out.write("\t\t\t\t\tvar i;\n");
      out.write("\t\t\t\t \tvar j;\n");
      out.write("\t\t\t\t \tvar array;\n");
      out.write("\n");
      out.write("\t\t\t\t \tvar x = new Array(");
      out.print(row);
      out.write(");\n");
      out.write("\t\t\t\t \tvar i;\n");
      out.write("\t\t\t\t \tfor (i = 0; i < ");
      out.print(row);
      out.write("; i++) {\n");
      out.write("\t\t\t\t \t  x[i] = new Array(");
      out.print(row);
      out.write(");\n");
      out.write("\t\t\t\t \t}\t\n");
      out.write("\t\t\t\t \t\n");
      out.write("\t\t\t\t \tif( i!= 0){\n");
      out.write("\t\t\t\t\t\tx = [");
      out.print( myMatrix );
      out.write("];  \t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tcreatetable(x,");
      out.print(row);
      out.write(");\n");
      out.write("\t\t\t\t \t}\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t\n");
      out.write("\t   </div>\n");
      out.write("\t   \t\t\t\t<!-- user info -->\n");
      out.write("\t\t\t\t\t");

						int maxR = Integer.parseInt(Strrow);
					
      out.write("\n");
      out.write("\t   \t   \t\t\t<div class = \"account_info_welcomeword\">\n");
      out.write("\t\t\t\t\t\t\t<p> Hi, <b> ");
out.println( userN); 
      out.write("</b>, this is your order history. </p>\t\t\n");
      out.write("\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t");
if (maxR ==0){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class = \"OrderBackground\">\n");
      out.write("\t\t\t\t\t\t\t\t<p style = \"text-align:center\" >  <b > No order history.</b> </p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");
} 
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t</span>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t   \n");
      out.write("\t   \n");
      out.write("\t\t\n");
      out.write("\t   <div class = \"accountInfoBox\"> \t\t\n");
      out.write("\t\t\t\t");
 String FirstName =(String)session.getAttribute("firstName");
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
					

				
      out.write("\n");
      out.write("\t\t\t\t\t");

						StringBuilder aa = new StringBuilder();
						aa.append("position:absolute; top:400px;left:50px;");
						String adjustLocation = aa.toString();
						request.setAttribute("blah", adjustLocation);
					
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t");

					
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
					
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div id = \"thisP\"> \n");
      out.write("\t\t\t\t\t<p > The is your account information. </p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t \t\t\t\t\tvar a = document.getElementById(\"thisP\");\n");
      out.write("\t\t\t\t\t\ta.style.position='absolute';\n");
      out.write("\t\t\t\t\t\ta.style.top = ");
      out.print( newPLoc );
      out.write(";\n");
      out.write("\t\t\t\t\t\ta.style.left = '30px'; \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- account table information  -->\n");
      out.write("\t\t\t\t\t<div  id = \"thisDiv\"  >\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t    var a = document.getElementById(\"thisDiv\");\n");
      out.write("\t\t\t\t\t\ta.style.position='absolute';\n");
      out.write("\t\t\t\t\t\ta.style.top = ");
      out.print( newDivLoc );
      out.write(";\n");
      out.write("\t\t\t\t\t\ta.style.left = '30px'; \n");
      out.write("\t\t\t\t\t\t/* a.style.borderBottom = '2px solid rgb(91, 92, 94)';  */\n");
      out.write("\t\t\t\t\t\ta.style.textAlign = 'left';\n");
      out.write("\t\t\t\t\t\ta.style.fontWeight =  'bold';\n");
      out.write("\t\t\t\t\t\ta.style.padding =  '12px';\n");
      out.write("\t\t\t\t\t\t/* a.style.border = '1px solid black';   */\n");
      out.write("\t\t\t\t\t\ta.style.color = 'black';\n");
      out.write("\t\t\t\t\t\ta.style.fontSize = '130%';\n");
      out.write("\t\t\t\t\t\ta.style.width = '75%';\n");
      out.write("\t\t\t\t\t\ta.style.background  = 'white';\n");
      out.write("\t\t\t\t\t\ta.style.opacity = '0.8';\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write(" \t\t\t\t\t\t<div  style = \" text-align: right;\">\n");
      out.write("\t\t\t\t\t\t \t<form action = \"/mainpage/account_info.jsp#thisDiv\" method = \"Get\" > \n");
      out.write("\t\t\t\t\t\t\t \t<!-- <a href=\"#editUserInfo\"> -->\n");
      out.write("\t\t\t\t\t\t\t\t<input   class = \"EditButton\"  type = \"submit\" value = \"Edit\" name =\"Editinfo\"  />  \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <input   class = \"EditButton\"  type = \"button\" value = \"Edit\" name =\"Editinfo\"  />  -->\n");
      out.write("\t\t\t\t\t\t\t\t<!-- </a> -->\n");
      out.write("\t\t\t\t\t\t\t</form> \n");
      out.write("\t\t\t\t\t\t\t");
 					    
						    	String editIt = (String)request.getParameter("Editinfo"); 
						    	/* System.out.println("-----> " + editIt); */
						    	
						    	String updateIt = (String)request.getParameter("Updateinfo"); 
						    	/* System.out.println("updateIt -----> " + updateIt); */
						    	
						   
						    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t");

							StringBuilder  AddressOut = new StringBuilder();
							AddressOut.append(Address);
							AddressOut.append(", ");
							AddressOut.append(AddressCity);
							AddressOut.append(", ");
							AddressOut.append(AddressState);
							String CombinedAdd = AddressOut.toString();
							
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t");
 if(editIt != null){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<form action = \"/mainpage/processEdit.jsp\" method = \"POST\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<input  class = \"AaveButton\"  type = \"submit\" value = \"Save\" name =\"UpdateUserInfo\"  /> \n");
      out.write("\t\t\t \t\t\t\t\t\t<input type=\"hidden\" value = \"");
      out.print(UserId );
      out.write("\" name =\"userID\" >\n");
      out.write("\t\t\t \t\t\t\t\t\t<input type=\"hidden\" value = \"");
      out.print(PassWord );
      out.write("\" name =\"PassWord\" >\n");
      out.write("\t\t \t\t\t\t\t\t\t\n");
      out.write("\t\t \t\t\t\t\t\t\t<table >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t     ");
if(editIt != null){  
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t      \t<td class =\"tdEdit\"><b> First Name </b></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    \t<td class =\"tdEdit\"> <input type=\"text\" name=\"fname\" value = \"");
      out.print( userN );
      out.write("\"    ></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    ");
 } 
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \t\t");
if(editIt != null){  
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class =\"tdEdit\"><b> Last Name</b></td>\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t\t\t\t<td class =\"tdEdit\">  <input type=\"text\" name=\"lname\" value = \"");
      out.print( FirstName );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t\t\t");
 } 
      out.write("  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \t\t");
if(editIt != null){  
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class =\"tdEdit\"><b> Password</b></td>\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t\t\t\t<td class =\"tdEdit\">  <input type=\"password\" name=\"password\" value = \"");
      out.print( PassWord );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t\t    \t\t\t\t\t\t");
 } 
      out.write("  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \t\t");
if(editIt != null){  
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \t \t\t<td class =\"tdEdit\" ><b> Phone Number</b></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    \t<td class =\"tdEdit\"> <input type=\"text\" name=\"mobno\" value = \"");
      out.print( PhoneNumber );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
 }
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \t  \t");
if(editIt != null){  
      out.write("   \t\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t\t\t\t \t<td class =\"tdEdit\" ><b> Email</b></td>\n");
      out.write("\t\t\t\t\t\t  \t\t \t\t\t\t\t\t<td class =\"tdEdit\"> <input type=\"text\" name=\"email\" value = \"");
      out.print( Email );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t  \t\t \t\t\t\t\t\t");
 }
      out.write(" \t\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \t\t ");
if(editIt != null){  
      out.write("   \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  \t<td class =\"tdEdit\"><b> Address</b></td>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t    <td class =\"tdEdit\"> <input type=\"text\" name=\"address\" value = \"");
      out.print( AddressStreet );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t    <td class =\"tdEdit\"> <input type=\"text\" name=\"city\" value = \"");
      out.print( AddressCity );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t    <td class =\"tdEdit\"> <input type=\"text\" name=\"state\" value = \"");
      out.print( AddressState );
      out.write("\" ></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  ");
 }
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t \t\t\t\t\t\t\t</table>\t\t\t\n");
      out.write("\t\t \t\t\t\t\t\t\n");
      out.write("\t\t \t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t");
 }
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t <table >\n");
      out.write("\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t    ");
if(editIt == null){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t    <td class =\"tdEdit\"><b> First Name </b></td>\n");
      out.write("\t\t\t\t\t\t\t    <td class =\"tdEdit\"> ");
      out.print( userN );
      out.write(" </td>\n");
      out.write("\t\t\t\t\t\t    ");
} 
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t  </tr>\n");
      out.write(" \t\t\t\t\t  <tr>\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t    ");
if(editIt == null){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t    \t<td class =\"tdEdit\"><b> Last Name</b></th>\n");
      out.write("\t\t\t\t\t\t    \t<td class =\"tdEdit\">");
      out.print( FirstName );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t    ");
} 
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t  </tr>\t\t  \n");
      out.write("\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t  \n");
      out.write(" \t\t\t\t\t  <tr>\t\t\t\t\t  \t\t\t\t\t  \t\n");
      out.write("\t\t\t\t\t  \t\t");
if(editIt == null){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t  \t<td class =\"tdEdit\" ><b> Phone Number</b></td>\n");
      out.write("\t\t\t\t\t\t\t  \t<td class =\"tdEdit\">");
      out.print( PhoneNumber );
      out.write("</td>\t\t\t\n");
      out.write("\t\t\t\t\t  \t\t");
} 
      out.write("\t\n");
      out.write("\t\t\t\t\t  \t\n");
      out.write("\t\t\t\t\t  </tr>\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t  <tr>\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t  \t\t");
if(editIt == null){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t  \t<td class =\"tdEdit\" ><b> Email</b></td>\n");
      out.write("\t\t\t\t\t\t\t  \t<td class =\"tdEdit\">");
      out.print( Email );
      out.write("</td>\t\t\n");
      out.write("\t\t\t\t\t  \t\t");
} 
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t  ");
if(editIt == null){  
      out.write("   \n");
      out.write("\t\t\t\t\t\t\t  \t<td class =\"tdEdit\"><b> Address</b></td>\n");
      out.write("\t\t\t\t\t\t\t  \t<td class =\"tdEdit\">");
      out.print( AddressStreet );
      out.write(' ');
      out.print(", ");
      out.write(' ');
      out.print( AddressCity );
      out.print(", ");
      out.write(' ');
      out.print( AddressState );
      out.write("</td>\t\t\n");
      out.write("\t\t\t\t\t\t  ");
 }
      out.write(" \t\t  \t\n");
      out.write("\n");
      out.write("\t\t\t\t\t  </tr> \n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t\n");
      out.write("\t    </div>\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     </div>\t\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
