<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login</title>
<s:head />
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

<h3>Login and find roommates</h3>

<s:form action="login">

 	  <s:textfield name="personBean.username" label="Username" />
 	  <s:password name="personBean.password" label="password" />
   	  <s:submit value="Login" />
   	  
</s:form>	
 
</body>
</html>