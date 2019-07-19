<?php
	$x=$_POST['login'];
	$y=$_POST['password'];
	mysql_connect("localhost","root","");
	mysql_select_db("bit2016");
	$query = "SELECT * from netcamp WHERE name='$x' AND passwd='$y'";
	$result=mysql_query($query);
	$row=mysql_fetch_array($result);
	if($result)
		echo "logged in";
	else 
	{
		echo 'wrong Id or password! Redirecting.....';
	header("Location: form.php");
	}

?>