<%@page import="logic.converter.AmountToWords"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='styl.css'>
<title>Converter</title>
</head>
<body>
<h1>Convert amount into polish words</h1>
<div class='frame'>
<form>
<%String number1 = request.getParameter("number");%>
Enter number:
<input type="number" name="number" >
<br><button>Convert</button>
</form>
<br>
<%
String numbertxt = "";
if (number1 != null){
	try{
int number = Integer.parseInt(number1);
numbertxt = AmountToWords.wartoscTekstowo(number); 

	}catch(NumberFormatException e) {
	out.println("<p class='error'>Incorrect number format</p>");
}
}

%>
<h2><%=numbertxt %></h2>

</div>
</body>
</html>