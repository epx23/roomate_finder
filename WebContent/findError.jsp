<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body>

<div id="page-container">
<div id="content" >


<div id="header">
</div>
<center>
<div id="main-nav">
        <a STYLE="TEXT-DECORATION: NONE" href="index.jsp"> HOME</a>
        </a>
</div>
</center>

<s:property value="personBean.fname" />
<!--<h2> usr.Username-->
<s:bean name="org.apache.struts.register.model.usr" var="personBean"/>
<s:property value="fname" /></h2>
<h2>Hello Andrew Corey</h2>
<h4>Your Account Info:</h4>
</p>
Email: acorey@nowhere.com</br>
Major: Computer Science</br>
NightOwl: True</br>
Have A Job: True</br> 
Smokes: False</br> 
Has Pets: True</br>
Cleanleness level: 7 </br>
Average Daily Studytime: 6</br> 
Age: 21</br>
Level of Outgoingness: 8</br>
Noise Tolerance: 3</br>
Company (people you can tolerate in your house): 2
</p>
<p><s:property value="messageStore" /></p>

<s:form action="compare">

          <s:textfield name="personBean.username" label="Name" />
          <s:submit value="compare" />
          
</s:form>       
<p>User Not Found!</p>

<p><a href="index.jsp">Logout</a></p>
</body>
</html>