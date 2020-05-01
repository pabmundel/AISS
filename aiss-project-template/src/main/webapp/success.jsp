<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="js/jquery-1.12.4.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap"
	rel="stylesheet">
</head>
<title></title>
<style type="text/css" media="all">
<!--
h3, h4, h5 {
	display: inline;
}

-->
<!--
.Album, .Video, .table {
	display: inline;
}

-->
body {
	background-image: url("src/Fondo.png");
	background-size: cover;
	align-items: center;
}

.Titulo {
	color: white;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	height: 30px;
	font-size: 50px;
	text-align: center;
	margin: 10%;
	flex-direction: row;
}

.Logo {
	margin-left: -5%;
	position: absolute;
	padding: 0.35%;
}

.albtxt {
	color: whitesmoke;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	font-size: 20px;
	margin-left: 15%;
}

.vidtxt {
	color: whitesmoke;
	font-size: 20px;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	margin-left: 6%;
}

.tourtxt {
	color: whitesmoke;
	font-size: 20px;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	margin-left: 10%;
}

.Album {
	position: static;
	margin-left: 10%;
}

.Video {
	position: static;
	margin-left: 0%;
}

.table {
	position: static;
	width: 33%;
	height: 345px;
	margin-left: 0%;
	top: 0%;
	font-family: Arial, Helvetica, sans-serif;
}

.table tr:nth-child(even) {
	width: 40%;
	background-color: #444444;
	color: white
}

.table tr:nth-child(odd) {
	width: 40%;
	background-color: #262626;
	color: white
}

.table th {
	border: 1px solid whitesmoke;
	color: white;
	background-color: black;
}

th, td {
	border: 1px solid whitesmoke;
	text-align: left;
	padding: 15px;
}

tr {
	border: 1px solid whitesmoke;
}
</style>
<body>
	<div>
		<div>
			<div class="Titulo">
				<h1 style="font-family: courier;">
						${game}
				</h1>

			</div>
		</div>

	</div>
	<div class="container-fluid bg-3 text-center" id="redes">
		<div class="row">
			<div class="col-sm-4">
				<h3 style="font-family: courier;">Song of the Soundrack</h3>
			</div>
			<div class="col-sm-4">
				<h4 class="vidtxt" style="font-family: courier;">Video</h4>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4">

				<iframe name="Spotify" src="${tracks}" class="Track" width="300"
					height="345" frameborder="0" allowtransparency="true"
					allow="encrypted-media"></iframe>
			</div>


			<div class="col-sm-4">

				<iframe name="Youtube" class="Video" width="420" height="345"
					src="${video}"></iframe>
					
					<br><br><br><br>

				<a href="index.jsp"><img class="volver" width="150" height="36"
					src="images/volver.png"></a>
			</div>
		</div>
	</div>
</body>
</html>
