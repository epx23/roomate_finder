<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Comparison Page</title>
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

<h3></h3>

<!--<p>Your registration information: <s:property value="personBean" /> </p>-->

<table border="1" bordercolor="#000000" style="background-color:#FFFFCC" width="100%" cellpadding="3" cellspacing="3">
        <tr>
                <td>Name</td>
                <td>Andrew</td>
                <td>Eric</td>
        </tr>
        <tr>
                <td>Email</td>
                <td>acorey@nowhere.com</td>
                <td>eboudreau@dyn.com</td>
        </tr>
        <tr>
                <td>Major</td>
                <td>Computer Science</td>
                <td>Engineering</td>
        </tr>
        <tr>
                <td>Nightowl</td>
                <td>True</td>
                <td>True</td>
        </tr>
        <tr>
                <td>Has a Job</td>
                <td>True</td>
                <td>True</td>
        </tr>
        <tr>
                <td>Smokes</td>
                <td>False</td>
                <td>False</td>
        </tr>
        <tr>
                <td>Has Pets</td>
                <td>True</td>
                <td>True</td>
        </tr>
        <tr>
                <td>Cleanleness Level</td>
                <td>7</td>
                <td>6</td>
        </tr>
        <tr>
                <td>Average Daily Studytime</td>
                <td>6</td>
                <td>4</td>
        </tr>
        <tr>
                <td>Age</td>
                <td>21</td>
                <td>21</td>
        </tr>
        <tr>
                <td>Level of Outgoingness</td>
                <td>8</td>
                <td>6</td>
        </tr>
        <tr>
                <td>Noise Tolerance</td>
                <td>3</td>
                <td>3</td>
        </tr>
        <tr>
                <td>Company</td>
                <td>2</td>
                <td>8</td>
        </tr>
</table>

<p>You and Eric would have a compatibility score of 5 for living with each other.</p>
<p><a href="userProfile.jsp" >Back to My Page</a>.</p>
<p><a href="<s:url action='index' />" >Logout</a>.</p>

</body>
</html>