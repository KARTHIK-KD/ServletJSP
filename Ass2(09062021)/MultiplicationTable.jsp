<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Multiplication Table </h2>
<table width="100" height="100" border="5">
<% String val = request.getParameter("num"); 
int n=Integer.parseInt(val);

       for(int i=1;i<=10;i++)
           { 
    	   		out.println("<tr>");
              out.print("<td>"+" "+i+"*"+n+"="+i*n+" "+"</td>");
           }
%>
</table>
</body>
</html>