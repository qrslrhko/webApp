/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2017-08-23 04:41:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class example_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<style>\n");
      out.write("/* \t  table {\n");
      out.write("\t    border: 1px dashed red;\n");
      out.write("\t    padding: 15px;\n");
      out.write("\t  }\n");
      out.write("\t  td  {\n");
      out.write("\t    border: 1px dashed blue;\n");
      out.write("\t    padding: 15px;\n");
      out.write("\t   /*  padding: 10px; */\n");
      out.write("\t  }\n");
      out.write("\t  .image{\n");
      out.write("\t  \tpadding: 15px;\n");
      out.write("\t\t\twidth:200px;\n");
      out.write("\t\t\theight:200px;\n");
      out.write("\t\t\n");
      out.write("\t\t} */\n");
      out.write("\t  \n");
      out.write("\t  \n");
      out.write("\t </style> \n");
      out.write("<!-- \t \n");
      out.write("\t <style>\n");
      out.write("\t\ttable {\n");
      out.write("\t\t    border: 1px solid black;\n");
      out.write("\t\t   \n");
      out.write("\t\t\n");
      out.write("\t\t    width:100%;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tth,td{\n");
      out.write("\t\t    border-bottom: 1px solid #ddd;\n");
      out.write("\t\t     border-collapse: collapse;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("</style> -->\n");
      out.write("\t \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"mainfruit.css\"> \n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write(" \t\t<script type=\"text/javascript\">\n");
      out.write(" \t\t/* var scriptAdded =false; */\n");
      out.write(" \t\t\n");
      out.write(" \t\tfunction myFunction() {\n");
      out.write(" \t\t\tvar len;\n");
      out.write(" \t\t    var x = document.createElement(\"SELECT\");\n");
      out.write(" \t\t    x.setAttribute(\"id\", \"mySelect\");\n");
      out.write(" \t\t    document.body.appendChild(x);  \n");
      out.write(" \t\t\t\n");
      out.write("\n");
      out.write(" \t\t    var z = document.createElement(\"option\");\n");
      out.write(" \t\t    z.setAttribute(\"value\", \"volvocar\");\n");
      out.write(" \t\t    var t = document.createTextNode(\"Volvo\");\n");
      out.write(" \t\t   z.appendChild(t);\n");
      out.write(" \t\t /*  if(len <=  2) { */\n");
      out.write(" \t\t     \tdocument.getElementById(\"mySelect\").appendChild(z);\t  \t\n");
      out.write(" \t\t   \n");
      out.write(" \t\t /*   }  */\n");
      out.write(" \t\t    var z = document.createElement(\"option\");\n");
      out.write("\t\t    z.setAttribute(\"value\", \"Mercadescar\");\n");
      out.write("\t\t    var t = document.createTextNode(\"Mercades\");\n");
      out.write("\t\t     z.appendChild(t); \n");
      out.write("\t\t   /*  if(len <=  2) { */\n");
      out.write("\t\t   \tdocument.getElementById(\"mySelect\").appendChild(z); \n");
      out.write("\t\t    \t\n");
      out.write("\t\t /*   }  */\n");
      out.write("\t\t \n");
      out.write("/* \t\t    len = document.getElementById(\"mySelect\").options.length;\n");
      out.write("\t\t \tdocument.getElementById(\"boxlength\").innerHTML = len; */\n");
      out.write("\t\t\t\n");
      out.write("\t\t /* \tdocument.getElementById(\"demo\").innerHTML = document.getElementById(\"mySelect\").value;  */\n");
      out.write("\t\t \n");
      out.write("\t\t \n");
      out.write("\t\t \t/* return document.getElementById(\"mySelect\").value;  */\n");
      out.write("\t\t /* \tvar yourSelect = document.getElementById( \"mySelect\" );\n");
      out.write("\t\t\talert( yourSelect.options[ yourSelect.selectedIndex ].value ) */\n");
      out.write("\t\t \t\n");
      out.write("\t\t \t\n");
      out.write("\t\t   \treturn document.getElementById(\"mySelect\"); \n");
      out.write("\t\t    \n");
      out.write(" \t\t}\n");
      out.write(" \t\t\n");
      out.write(" \t\t/* document.getElementById(\"demo\").onchange = function() {changevalue()}; */\n");
      out.write(" \t\t\n");
      out.write(" \t\tfunction changevalue(x){\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\t var x = myFunction();\t\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\t/* document.getElementById(\"demo\").value = x; */\n");
      out.write(" \t\t\t/* var e = document.getElementById(\"mySelect\");\n");
      out.write("\t\t\tvar strUser = e.options[e.selectedIndex].value;\n");
      out.write("\t\t\tdocument.getElementById(\"demo\").innerHTML = strUser;  */\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\tdocument.getElementById(\"demo\").innerHTML = x; \n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\n");
      out.write(" \t\t}\n");
      out.write(" \t\t\n");
      out.write(" \t\t\n");
      out.write(" \t\t\n");
      out.write(" \t\tfunction createoptions(id){\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\tvar s = document.getElementById(\"mySelect\");\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t\tvar z = document.createElement(\"option\");\n");
      out.write(" \t\t    z.setAttribute(\"value\", \"volvocar\");\n");
      out.write(" \t\t    var t = document.createTextNode(\"Volvo\");\n");
      out.write(" \t\t    z.appendChild(t);\n");
      out.write("\t \t    document.getElementById(id).appendChild(z);\t  \t\n");
      out.write(" \t\t    \n");
      out.write("\t \t    var z = document.createElement(\"option\");\n");
      out.write("\t\t    z.setAttribute(\"value\", \"Mercadescar\");\n");
      out.write("\t\t    z.setAttribute(\"selected\", \"selected\");\n");
      out.write("\t\t    var t = document.createTextNode(\"Mercades\");\n");
      out.write("\t\t     z.appendChild(t); \n");
      out.write("\t\t   \tdocument.getElementById(id).appendChild(z); \n");
      out.write("\t\t   \n");
      out.write(" \t\t\t\n");
      out.write("\t\t  /*  \treturn document.getElementById(\"mySelect\");  */\n");
      out.write(" \t\t}\n");
      out.write(" \t\t\n");
      out.write(" \t\t\n");
      out.write(" \t\t\n");
      out.write(" \t\tfunction choose(id) {\n");
      out.write("/*  \t\t\tvar e = document.getElementById(\"mySelect\");\n");
      out.write(" \t\t\tstrUser = e.options[e.selectedIndex].value; */\n");
      out.write(" \t\t    var x = document.getElementById(id).value;\n");
      out.write(" \t\t  /*  document.getElementById(\"demo\").innerHTML = strUser; */\n");
      out.write(" \t\t    document.getElementById(\"demo\").innerHTML = \"You selected: \" + x;\n");
      out.write(" \t\t}\n");
      out.write(" \t\t\n");
      out.write("\n");
      out.write(" \t\t\n");
      out.write("\t   </script> \n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\tfunction newfunction(){\n");
      out.write("\t\t\t\t\t\tvar my_form=document.createElement('FORM');\n");
      out.write("\t\t\t\t\t\tmy_form.name='myForm';\n");
      out.write("\t\t\t \t\t\tmy_form.method='GET'; \n");
      out.write("\t\t\t\t\t\tmy_form.action='example.jsp'; \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t    var myDiv = document.createElement('div');\n");
      out.write("\t\t\t\t \t\tmyDiv.style.position = 'absolute';\n");
      out.write("\t\t\t\t\t\tmyDiv.style.width = '900px';\n");
      out.write("\t\t\t\t\t\tmyDiv.style.height = '200px';\n");
      out.write("\t\t\t\t\t\tmyDiv.style.top = '50px';\n");
      out.write("\t\t\t\t\t\tmyDiv.style.left = '280px';\n");
      out.write("\t\t\t\t\t\tmyDiv.style.background  = 'pink';\n");
      out.write("\t\t\t\t \t\tmyDiv.setAttribute(\"id\", \"thisDiv\"); \n");
      out.write("\t\t\t\t \t\tmyDiv.setAttribute(\"name\", \"thisDiv\");\n");
      out.write("\t\t\t\t \t\t\n");
      out.write("\t\t\t\t \t\tmyDiv.setAttribute(\"value\", \"myvalue\"); \n");
      out.write("\t\t\t\t \t\tmy_form.appendChild(myDiv);  \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t/* var my_tb=document.createElement('INPUT');\n");
      out.write("\t\t\t\t\t\tmy_tb.type='TEXT';\n");
      out.write("\t\t\t\t\t\tmy_tb.name='myInput';\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tmy_form.appendChild(my_tb); */\n");
      out.write("\t\t\t\t\t\tvar myp = document.createElement('P');\n");
      out.write("\t\t\t\t\t\tmyp.setAttribute(\"id\", \"Pid\");\n");
      out.write("\t\t\t\t\t\tmyp.setAttribute(\"name\", \"Pid\");\n");
      out.write("\t\t\t\t\t\tmyDiv.setAttribute(\"value\", \"Palue\"); \n");
      out.write("\t\t\t\t\t \tmyDiv.appendChild(myp);\t\n");
      out.write("\t\t\t\t\t \tmy_form.appendChild(myDiv);\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t \t\tvar  mySelect =  document.createElement(\"select\");\n");
      out.write("\t\t\t\t\t \tmySelect.setAttribute(\"id\", \"mySelect\");\n");
      out.write("\t\t\t\t\t \tmySelect.setAttribute(\"name\", \"mySelect\");\n");
      out.write("\t\t\t\t\t \tmyDiv.appendChild(mySelect);\t\n");
      out.write("\t\t\t\t\t \tmy_form.appendChild(myDiv);\t\n");
      out.write("\t\t\t\t\t \t\n");
      out.write("\t\t\t\t\t \tvar option1 = document.createElement(\"option\");\n");
      out.write("\t\t\t\t\t \toption1.setAttribute(\"value\", \"111\");\n");
      out.write("\t\t\t\t\t \tvar word = document.createTextNode(\"111\"); \t\n");
      out.write("\t\t\t\t\t \toption1.appendChild(word);\n");
      out.write("\t\t\t\t\t \tmySelect.appendChild(option1);\n");
      out.write("\t\t\t\t\t \t\n");
      out.write("\t\t\t\t\t \tvar option2 = document.createElement(\"option\");\n");
      out.write("\t\t\t\t\t \toption2.setAttribute(\"value\", \"222\");\n");
      out.write("\t\t\t\t\t \tvar word = document.createTextNode(\"222\"); \t\n");
      out.write("\t\t\t\t\t \toption2.appendChild(word);\n");
      out.write("\t\t\t\t\t \tmySelect.appendChild(option2);  \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t \t \n");
      out.write("\t\t\t\t\t\tvar s = document.createElement('INPUT'); \n");
      out.write("\t\t\t\t\t\ts.setAttribute(\"type\", \"submit\");\n");
      out.write("\t\t\t\t\t\ts.setAttribute(\"value\",\"Submit\");\n");
      out.write("\t\t\t\t\t\tmyDiv.appendChild(s); \n");
      out.write("\t\t\t\t\t\tmy_form.appendChild(myDiv);  \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("/* \t\t\t\t\t\tvar textit = document.createElement('INPUT'); \n");
      out.write("\t\t\t\t\t\ttextit.setAttribute(\"text\", \"submit\");\n");
      out.write("\t\t\t\t\t\ttextit.setAttribute(\"name\",\"textBox\");\n");
      out.write("\t\t\t\t\t\tmyDiv.appendChild(textit); \n");
      out.write("\t\t\t\t\t\tmy_form.appendChild(myDiv);   */\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tvar outbutton = document.createElement('button'); \n");
      out.write("\t\t/* \t\t\t\toutbutton.setAttribute(\"type\", \"button\");\n");
      out.write("\t\t\t\t\t\t */\n");
      out.write("\t\t\t\t\t\toutbutton.setAttribute(\"name\",\"textBox\");\n");
      out.write("\t\t\t\t\t\toutbutton.setAttribute(\"value\",\"outbutton\");\n");
      out.write("\t\t\t\t\t\tvar word  = document.createTextNode(\"show button \");\n");
      out.write("\t\t\t\t\t\toutbutton.appendChild(word);\n");
      out.write("\t\t\t\t\t\tmyDiv.appendChild(outbutton); \n");
      out.write("\t\t\t\t\t\tmy_form.appendChild(myDiv); \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tdocument.body.appendChild(my_form);\n");
      out.write("\t\t\t\t/* my_form.submit(); */\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\t<body>\n");
      out.write("\t\n");
      out.write("\t\t<!-- method 1 -->\n");
      out.write("\t\t<!-- <button onclick=\"changevalue()\">set value</button>  \t\t\n");
      out.write("\t\t<p id=\"demo\"> </p>  -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write(" \t<!-- \t<div onchange=\"changevalue()\">Try it</div>  -->\n");
      out.write(" \t\n");
      out.write("<!-- \t<p id=\"demo\"> </p> \n");
      out.write("\t <script type=\"text/javascript\">\n");
      out.write("\t \n");
      out.write("\t \t\tvar x = myFunction();\n");
      out.write("\t \t/* \tvar e = document.getElementById(\"mySelect\"); */\n");
      out.write("\t\t\tvar strUser = x.options[x.selectedIndex].value;\n");
      out.write("\t\t\tdocument.getElementById(\"demo\").innerHTML = strUser; \n");
      out.write(" \t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t \t\t/* changevalue(x); */\n");
      out.write("\t \t\t/*  document.getElementById(\"myBtn\").value = x; */\n");
      out.write("\t \t\t/* document.getElementById(\"myBtn\").value = x ; */\n");
      out.write("\t \t\t/* document.getElementById(\"demo\").innerHTML = x;  */\n");
      out.write("\t\t</script>    -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t");

		StringBuilder str = new StringBuilder();
		str.append("\"mySelect\"");
		String s = str.toString();
		/* System.out.println("---->" + s); */
		
		StringBuilder str2 = new StringBuilder();
		str2.append("\"mySelect2\"");
		String s2 = str2.toString();
		
		
      out.write("\n");
      out.write("\t\t \n");
      out.write("\t\t \n");
      out.write(" \t\t<select id=");
      out.print(s);
      out.write(" onchange=\"choose(this.id);\"  name= \"selectA\">\n");
      out.write("\t\t</select>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<p id=\"demo\" style= \"color:blue\"> </p>\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t \t var str = ");
      out.print(s);
      out.write(";\n");
      out.write("\t\t \tcreateoptions(str);\n");
      out.write("\n");
      out.write("\t\t </script>  \n");
      out.write("\t\t \n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tnewfunction();\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t");
  
			System.out.println("");
		 	String a = (String)request.getParameter("mySelect");
			System.out.println("select ---> " +a);
			
			String b = (String)request.getParameter("textBox");
			System.out.println("textBox ---> " +b);
		    
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t\tvar a = document.createElement('a');\n");
      out.write("\t\tvar linkText = document.createTextNode(\"remove button\");\n");
      out.write("\t\ta.appendChild(linkText);\n");
      out.write("\t\ta.title = \"my title text\";\n");
      out.write("\t\ta.href = \"http://localhost:8080/mainpage/example.jsp\";\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\tdocument.body.appendChild(a);\n");
      out.write("\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- <button id =\"myBtn\"  onclick=\"changevalue()\" >set value</button>\n");
      out.write(" -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<!-- \t\t\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t  var arr, body, tab, tr, td, tn, row, col;\n");
      out.write("\t\t  arr = [\n");
      out.write("\t\t    [0,1,2],\n");
      out.write("\t\t    [1,2,3],\n");
      out.write("\t\t    [2,3,4]\n");
      out.write("\t\t  ];\n");
      out.write("\t\t  body = document.getElementsByTagName('body')[0];\n");
      out.write("\t\t  tab = document.createElement('table');\n");
      out.write("\t\t  for (row = 0; row < arr.length; row++){\n");
      out.write("\t\t    tr = document.createElement('tr');\n");
      out.write("\t\t    for (col = 0; col < arr[row].length; col++){\n");
      out.write("\t\t      td = document.createElement('td');\n");
      out.write("\t\t      tn = document.createTextNode(arr[row][col]);\n");
      out.write("\t\t      td.appendChild(tn);\n");
      out.write("\t\t      tr.appendChild(td);\n");
      out.write("\t\t    }\n");
      out.write("\t\t    tab.appendChild(tr);\n");
      out.write("\t\t  }\n");
      out.write("\t\t  body.appendChild(tab);\n");
      out.write("\t\t</script>\n");
      out.write("\t\t -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
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
