<!DOCTYPE html>
<html>
<head>
<body bgcolor="yellow">
<title>FORM</title>
</head>
<body>
<center>
<form action="datacheck.php" method="POST">
<br><br>
	Login &nbsp;<input type="text" name="login" required><br>
	Password &nbsp;<input type="password" name="password" required><br><input type="submit" value="submit"><br></center>
</form>

	<br>
	<center><a href="passwordchange.php"> Forgot password </a>
	<br><center>
	<form action="datacheck.php" method="POST">
	Name &nbsp;<input type="text" name="name" required>*<br>
	ID &nbsp;<input type="text" name="id" required>*<br>
	Newpassword &nbsp;<input type="password" name="passwd" required>*<br>
	Phone &nbsp;<input type="number" name="phone"><br>
	What is ur nick name &nbsp;<input type="text" name="nick"><br>

	<input type="submit" value="submit">&nbsp;
	<input type="reset" value="reset">
	
</form>

</body>
</html>