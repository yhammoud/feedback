<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>	
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.11.4/jquery-ui.js"></script>
	<script>
  		$(function() {
    		$( "#datepicker" ).datepicker();
  		});
  	</script>
</head>
<body>
<form class="form-horizontal" action='Register' method="POST">
  <fieldset>
    <div id="legend">
      <legend class="">Register</legend>
    </div>
    <div class="control-group">
      <!-- First Name -->
      <label class="control-label"  for="firstName">First Name</label>
      <div class="controls">
        <input type="text" id="firstName" name="fName" placeholder="First Name" class="input-xlarge">
        <p class="help-block">Enter your first name</p>
      </div>
    </div>
    
    <div class="control-group">
      <!-- Last Name -->
      <label class="control-label"  for="lastName">Last Name</label>
      <div class="controls">
        <input type="text" id="lastName" name="lName" placeholder="last Name" class="input-xlarge">
        <p class="help-block">Enter your last name</p>
      </div>
    </div>
 
 	<div class="control-group">
      <!-- DOB -->
      <label class="control-label"  for=datepicker>Date of birth</label>
      <div class="controls">
        <input type="text" id="datepicker" name="dob" class="input-xlarge">
        <p class="help-block">Pick your DOB</p>
      </div>
    </div>
    
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="email">E-mail</label>
      <div class="controls">
        <input type="text" id="email" name="email" placeholder="Email" class="input-xlarge">
        <p class="help-block">Enter your E-mail</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <input type="password" id="password" name="password" placeholder="Password" class="input-xlarge">
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="password_confirm">Password (Confirm)</label>
      <div class="controls">
        <input type="password" id="password_confirm" name="password_confirm" placeholder="Confirm password" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>
    
    <div class="control-group">
      <!-- Gender -->
      <label class="control-label"  for="gender">Gender</label>
      <div class="controls">
        <input type="radio" id="gender" name="gender" value="male" checked class="input-xlarge">Male<br>
        <input type="radio" id="gender" name="gender" value="female" class="input-xlarge">Female
        <p class="help-block">Select your gender</p>
      </div>
    </div>
    
    <div class="control-group">
      <!-- Role -->
      <label class="control-label"  for="role">Role</label>
      <div class="controls">
        <input type="radio" id="role" name="role" value="coach" checked class="input-xlarge">Coach<br>
        <input type="radio" id="role" name="role" value="swimmer" class="input-xlarge">Swimmer
        <p class="help-block">Select your role</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button type="submit" class="btn btn-success">Register</button>
      </div>
    </div>
  </fieldset>
</form>
</body>
</html>