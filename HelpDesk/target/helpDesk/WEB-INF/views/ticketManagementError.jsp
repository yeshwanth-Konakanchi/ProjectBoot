<%@ page language ="java" contentType ="text/html; charset = ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Welcome user</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
    
 .footer {
   position:absolute;
   bottom:0;
   width:100%;
   height:60px;   /* Height of the footer */
   background:#808080;
}
    center{
        color: white;
        
    }
    .head{
    	font-family: serif;
    	font-style: italic;
    }
    
    .navbar{
        background-color: #008B8B;
        
    }
    .navbar-brand{
        color: white;
    }
    .dropdown-toggle{
        color: white;
    }
    .home{
        color: white;
    }
    
  	    .signUp{
        color: white;
    }
    .login{
        color: white;
    }
    .TM{
        color: white;
    }
    .help{
        color: white;
    }

  
   
</style>
</head>
<body>

<header>

<h2 class="head">Ektha Solutions</h2>
</header>
  
<nav class="navbar">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="homePage">Help Desk</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a class= "home" href="homePage">Home</a></li>
      <li><a class= "TM" href="dashBoard">Ticket Management</a></li>
      <li><a class= "help" href="#">Contact Us</a></li> 
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a class= "login" href="login" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>  
</nav>
	<br></br>
	<br></br>
	<h4 align ="center">   Please login to continue!!</h4>

    <div class="footer">
        <p ><center>Copyright@Yeshwanth Konakanchi</center></p> 
    </div>   


</body>
</html>