<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style>
/* 	  table {
	    border: 1px dashed red;
	    padding: 15px;
	  }
	  td  {
	    border: 1px dashed blue;
	    padding: 15px;
	   /*  padding: 10px; */
	  }
	  .image{
	  	padding: 15px;
			width:200px;
			height:200px;
		
		} */
	  
	  
	 </style> 
<!-- 	 
	 <style>
		table {
		    border: 1px solid black;
		   
		
		    width:100%;
		}
		
		th,td{
		    border-bottom: 1px solid #ddd;
		     border-collapse: collapse;
		}

</style> -->
	 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="mainfruit.css"> 
<title>Insert title here</title>

		
 		<script type="text/javascript">
 		/* var scriptAdded =false; */
 		
 		function myFunction() {
 			var len;
 		    var x = document.createElement("SELECT");
 		    x.setAttribute("id", "mySelect");
 		    document.body.appendChild(x);  
 			

 		    var z = document.createElement("option");
 		    z.setAttribute("value", "volvocar");
 		    var t = document.createTextNode("Volvo");
 		   z.appendChild(t);
 		 /*  if(len <=  2) { */
 		     	document.getElementById("mySelect").appendChild(z);	  	
 		   
 		 /*   }  */
 		    var z = document.createElement("option");
		    z.setAttribute("value", "Mercadescar");
		    var t = document.createTextNode("Mercades");
		     z.appendChild(t); 
		   /*  if(len <=  2) { */
		   	document.getElementById("mySelect").appendChild(z); 
		    	
		 /*   }  */
		 
/* 		    len = document.getElementById("mySelect").options.length;
		 	document.getElementById("boxlength").innerHTML = len; */
			
		 /* 	document.getElementById("demo").innerHTML = document.getElementById("mySelect").value;  */
		 
		 
		 	/* return document.getElementById("mySelect").value;  */
		 /* 	var yourSelect = document.getElementById( "mySelect" );
			alert( yourSelect.options[ yourSelect.selectedIndex ].value ) */
		 	
		 	
		   	return document.getElementById("mySelect"); 
		    
 		}
 		
 		/* document.getElementById("demo").onchange = function() {changevalue()}; */
 		
 		function changevalue(x){
 			
 			 var x = myFunction();	
 			
 			/* document.getElementById("demo").value = x; */
 			/* var e = document.getElementById("mySelect");
			var strUser = e.options[e.selectedIndex].value;
			document.getElementById("demo").innerHTML = strUser;  */
 			
 			
 			document.getElementById("demo").innerHTML = x; 
 			
 		
 		}
 		
 		
 		
 		function createoptions(id){
 			
 			
 			var s = document.getElementById("mySelect");
 			
 			var z = document.createElement("option");
 		    z.setAttribute("value", "volvocar");
 		    var t = document.createTextNode("Volvo");
 		    z.appendChild(t);
	 	    document.getElementById(id).appendChild(z);	  	
 		    
	 	    var z = document.createElement("option");
		    z.setAttribute("value", "Mercadescar");
		    z.setAttribute("selected", "selected");
		    var t = document.createTextNode("Mercades");
		     z.appendChild(t); 
		   	document.getElementById(id).appendChild(z); 
		   
 			
		  /*  	return document.getElementById("mySelect");  */
 		}
 		
 		
 		
 		function choose(id) {
/*  			var e = document.getElementById("mySelect");
 			strUser = e.options[e.selectedIndex].value; */
 		    var x = document.getElementById(id).value;
 		  /*  document.getElementById("demo").innerHTML = strUser; */
 		    document.getElementById("demo").innerHTML = "You selected: " + x;
 		}
 		

 		
	   </script> 

		
		<script type="text/javascript">
		
				function newfunction(){
						var my_form=document.createElement('FORM');
						my_form.name='myForm';
			 			my_form.method='GET'; 
						my_form.action='example.jsp'; 
						
					    var myDiv = document.createElement('div');
				 		myDiv.style.position = 'absolute';
						myDiv.style.width = '900px';
						myDiv.style.height = '200px';
						myDiv.style.top = '50px';
						myDiv.style.left = '280px';
						myDiv.style.background  = 'pink';
				 		myDiv.setAttribute("id", "thisDiv"); 
				 		myDiv.setAttribute("name", "thisDiv");
				 		
				 		myDiv.setAttribute("value", "myvalue"); 
				 		my_form.appendChild(myDiv);  
						
						/* var my_tb=document.createElement('INPUT');
						my_tb.type='TEXT';
						my_tb.name='myInput';
						
						my_form.appendChild(my_tb); */
						var myp = document.createElement('P');
						myp.setAttribute("id", "Pid");
						myp.setAttribute("name", "Pid");
						myDiv.setAttribute("value", "Palue"); 
					 	myDiv.appendChild(myp);	
					 	my_form.appendChild(myDiv);	
						
				 		var  mySelect =  document.createElement("select");
					 	mySelect.setAttribute("id", "mySelect");
					 	mySelect.setAttribute("name", "mySelect");
					 	myDiv.appendChild(mySelect);	
					 	my_form.appendChild(myDiv);	
					 	
					 	var option1 = document.createElement("option");
					 	option1.setAttribute("value", "111");
					 	var word = document.createTextNode("111"); 	
					 	option1.appendChild(word);
					 	mySelect.appendChild(option1);
					 	
					 	var option2 = document.createElement("option");
					 	option2.setAttribute("value", "222");
					 	var word = document.createTextNode("222"); 	
					 	option2.appendChild(word);
					 	mySelect.appendChild(option2);  
						
						 	 
						var s = document.createElement('INPUT'); 
						s.setAttribute("type", "submit");
						s.setAttribute("value","Submit");
						myDiv.appendChild(s); 
						my_form.appendChild(myDiv);  
						
						
						
/* 						var textit = document.createElement('INPUT'); 
						textit.setAttribute("text", "submit");
						textit.setAttribute("name","textBox");
						myDiv.appendChild(textit); 
						my_form.appendChild(myDiv);   */
						
						var outbutton = document.createElement('button'); 
		/* 				outbutton.setAttribute("type", "button");
						 */
						outbutton.setAttribute("name","textBox");
						outbutton.setAttribute("value","outbutton");
						var word  = document.createTextNode("show button ");
						outbutton.appendChild(word);
						myDiv.appendChild(outbutton); 
						my_form.appendChild(myDiv); 
						
						
						document.body.appendChild(my_form);
				/* my_form.submit(); */
				}
		</script>




</head>
	<body>
	
		<!-- method 1 -->
		<!-- <button onclick="changevalue()">set value</button>  		
		<p id="demo"> </p>  -->
		
		
		
		
 	<!-- 	<div onchange="changevalue()">Try it</div>  -->
 	
<!-- 	<p id="demo"> </p> 
	 <script type="text/javascript">
	 
	 		var x = myFunction();
	 	/* 	var e = document.getElementById("mySelect"); */
			var strUser = x.options[x.selectedIndex].value;
			document.getElementById("demo").innerHTML = strUser; 
 			
			
			
	 		/* changevalue(x); */
	 		/*  document.getElementById("myBtn").value = x; */
	 		/* document.getElementById("myBtn").value = x ; */
	 		/* document.getElementById("demo").innerHTML = x;  */
		</script>    -->
		

		<%
		StringBuilder str = new StringBuilder();
		str.append("\"mySelect\"");
		String s = str.toString();
		/* System.out.println("---->" + s); */
		
		StringBuilder str2 = new StringBuilder();
		str2.append("\"mySelect2\"");
		String s2 = str2.toString();
		
		%>
		 
		 
 		<select id=<%=s%> onchange="choose(this.id);"  name= "selectA">
		</select>
			
		<p id="demo" style= "color:blue"> </p>
		
		<script type="text/javascript">
		 	 var str = <%=s%>;
		 	createoptions(str);

		 </script>  
		 
		


		<script type="text/javascript">
			newfunction();
		</script>

			<%  
			System.out.println("");
		 	String a = (String)request.getParameter("mySelect");
			System.out.println("select ---> " +a);
			
			String b = (String)request.getParameter("textBox");
			System.out.println("textBox ---> " +b);
		    %> 
 

		<script type="text/javascript">
		
		var a = document.createElement('a');
		var linkText = document.createTextNode("remove button");
		a.appendChild(linkText);
		a.title = "my title text";
		a.href = "http://localhost:8080/mainpage/example.jsp";
		
		
		document.body.appendChild(a);
		
		</script>


		
		<!-- <button id ="myBtn"  onclick="changevalue()" >set value</button>
 -->
		
		
		
	
	

	
	
<!-- 		
			<script>
		  var arr, body, tab, tr, td, tn, row, col;
		  arr = [
		    [0,1,2],
		    [1,2,3],
		    [2,3,4]
		  ];
		  body = document.getElementsByTagName('body')[0];
		  tab = document.createElement('table');
		  for (row = 0; row < arr.length; row++){
		    tr = document.createElement('tr');
		    for (col = 0; col < arr[row].length; col++){
		      td = document.createElement('td');
		      tn = document.createTextNode(arr[row][col]);
		      td.appendChild(tn);
		      tr.appendChild(td);
		    }
		    tab.appendChild(tr);
		  }
		  body.appendChild(tab);
		</script>
		 -->

	
			
			
	</body>
</html>