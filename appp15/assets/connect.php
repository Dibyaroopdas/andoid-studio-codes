<?php

$a=$_POST['name'];
$b=$_POST['id'];
$c=$_POST['passwd'];
$d=$_POST['phone'];
$e=$_POST['nick'];


mysql_connect("localhost","root","");
mysql_select_db("bit2016");

$query= "INSERT INTO `bit2016`.`netcamp` (`name`, `id`, `passwd`, `phone`, `nick`) VALUES ('$a', '$b', '$c', '$d', '$e');";
 $result=mysql_query($query);
if(!$result)
	{echo "query error";
   echo"$query";
}
else
{
echo "database updated";
}
?>