<!DOCTYPE html>
<html>
<head>
<title></title>
<style>
body {
	background-image: url("src/Fondo.png");
	background-size: cover;
	align-items: center;
}

.Error {
	color: white;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	height: 50px;
	font-size: xx-large;
	text-align: center;
	margin: 10%;
	flex-direction: row;
}

.err {
	margin-left: -5%;
	position: absolute;
	padding: 0.35%;
}

.Text {
	color: white;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	text-align: center;
}

.SubTitulo {
	color: green;
	text-shadow: 0 0 3px #000000, 0 0 5px #000000;
	text-align: center;
}

.volver {
	margin-left: 50%;
}

@import url(http://fonts.googleapis.com/css?family=Cabin:400);

.webdesigntuts-workshop {
	position: relative;
	text-align: center;
	width: 100%;
}

.webdesigntuts-workshop form {
	background: #111;
	background: -webkit-linear-gradient(#1b1b1b, #111);
	background: -moz-linear-gradient(#1b1b1b, #111);
	background: -o-linear-gradient(#1b1b1b, #111);
	background: -ms-linear-gradient(#1b1b1b, #111);
	background: linear-gradient(#1b1b1b, #111);
	border: 1px solid #000;
	border-radius: 5px;
	box-shadow: inset 0 0 0 1px #272727;
	display: inline-block;
	font-size: 0px;
	margin: 50px auto 0;
	padding: 20px;
	position: relative;
	z-index: 1;
}

.webdesigntuts-workshop input {
	background: #222;
	background: -webkit-linear-gradient(#333, #222);
	background: -moz-linear-gradient(#333, #222);
	background: -o-linear-gradient(#333, #222);
	background: -ms-linear-gradient(#333, #222);
	background: linear-gradient(#333, #222);
	border: 1px solid #444;
	border-radius: 5px 0 0 5px;
	box-shadow: 0 2px 0 #000;
	color: #888;
	display: block;
	float: left;
	font-family: 'Cabin', helvetica, arial, sans-serif;
	font-size: 13px;
	font-weight: 400;
	height: 42px;
	margin: 0;
	padding: 0 10px;
	text-shadow: 0 -1px 0 #000;
	width: 200px;
}

.ie .webdesigntuts-workshop input {
	line-height: 40px;
}

.webdesigntuts-workshop input::-webkit-input-placeholder {
	color: #888;
}

.webdesigntuts-workshop input:-moz-placeholder {
	color: #888;
}

.webdesigntuts-workshop input:focus {
	-webkit-animation: glow 800ms ease-out infinite alternate;
	-moz-animation: glow 800ms ease-out infinite alternate;
	-o-animation: glow 800ms ease-out infinite alternate;
	-ms-animation: glow 800ms ease-out infinite alternate;
	animation: glow 800ms ease-out infinite alternate;
	background: #222922;
	background: -webkit-linear-gradient(#333933, #222922);
	background: -moz-linear-gradient(#333933, #222922);
	background: -o-linear-gradient(#333933, #222922);
	background: -ms-linear-gradient(#333933, #222922);
	background: linear-gradient(#333933, #222922);
	border-color: #393;
	box-shadow: 0 0 5px rgba(0, 255, 0, .2), inset 0 0 5px
		rgba(0, 255, 0, .1), 0 2px 0 #000;
	color: #efe;
	outline: none;
}

.webdesigntuts-workshop input:focus::-webkit-input-placeholder {
	color: #efe;
}

.webdesigntuts-workshop input:focus:-moz-placeholder {
	color: #efe;
}

.webdesigntuts-workshop button {
	background: #222;
	background: -webkit-linear-gradient(#333, #222);
	background: -moz-linear-gradient(#333, #222);
	background: -o-linear-gradient(#333, #222);
	background: -ms-linear-gradient(#333, #222);
	background: linear-gradient(#333, #222);
	-webkit-box-sizing: content-box;
	-moz-box-sizing: content-box;
	-o-box-sizing: content-box;
	-ms-box-sizing: content-box;
	box-sizing: content-box;
	border: 1px solid #444;
	border-left-color: #000;
	border-radius: 0 5px 5px 0;
	box-shadow: 0 2px 0 #000;
	color: #fff;
	display: block;
	float: left;
	font-family: 'Cabin', helvetica, arial, sans-serif;
	font-size: 13px;
	font-weight: 400;
	height: 40px;
	line-height: 40px;
	margin: 0;
	padding: 0;
	position: relative;
	text-shadow: 0 -1px 0 #000;
	width: 80px;
}

.webdesigntuts-workshop button:hover, .webdesigntuts-workshop button:focus
	{
	background: #292929;
	background: -webkit-linear-gradient(#393939, #292929);
	background: -moz-linear-gradient(#393939, #292929);
	background: -o-linear-gradient(#393939, #292929);
	background: -ms-linear-gradient(#393939, #292929);
	background: linear-gradient(#393939, #292929);
	color: #5f5;
	outline: none;
}

.webdesigntuts-workshop button:active {
	background: #292929;
	background: -webkit-linear-gradient(#393939, #292929);
	background: -moz-linear-gradient(#393939, #292929);
	background: -o-linear-gradient(#393939, #292929);
	background: -ms-linear-gradient(#393939, #292929);
	background: linear-gradient(#393939, #292929);
	box-shadow: 0 1px 0 #000, inset 1px 0 1px #222;
	top: 1px;
}

@
-webkit-keyframes glow { 0% {
	border-color: #393;
	box-shadow: 0 0 5px rgba(0, 255, 0, .2), inset 0 0 5px
		rgba(0, 255, 0, .1), 0 2px 0 #000;
}

100%
{
border-color
:
 
#6f6
;

		
box-shadow
:
 
0
0
20
px
 
rgba
(0
,
255,0,
.6
)
,
inset
 
0
0
10
px
 
rgba
(0
,
255,0,
.4
)
,
0
2
px
 
0
#000
;

    
}
}
@
-moz-keyframes glow { 0% {
	border-color: #393;
	box-shadow: 0 0 5px rgba(0, 255, 0, .2), inset 0 0 5px
		rgba(0, 255, 0, .1), 0 2px 0 #000;
}

100%
{
border-color
:
 
#6f6
;

		
box-shadow
:
 
0
0
20
px
 
rgba
(0
,
255,0,
.6
)
,
inset
 
0
0
10
px
 
rgba
(0
,
255,0,
.4
)
,
0
2
px
 
0
#000
;

    
}
}
@
-o-keyframes glow { 0% {
	border-color: #393;
	box-shadow: 0 0 5px rgba(0, 255, 0, .2), inset 0 0 5px
		rgba(0, 255, 0, .1), 0 2px 0 #000;
}

100%
{
border-color
:
 
#6f6
;

		
box-shadow
:
 
0
0
20
px
 
rgba
(0
,
255,0,
.6
)
,
inset
 
0
0
10
px
 
rgba
(0
,
255,0,
.4
)
,
0
2
px
 
0
#000
;

    
}
}
@
-ms-keyframes glow { 0% {
	border-color: #393;
	box-shadow: 0 0 5px rgba(0, 255, 0, .2), inset 0 0 5px
		rgba(0, 255, 0, .1), 0 2px 0 #000;
}

100%
{
border-color
:
 
#6f6
;

		
box-shadow
:
 
0
0
20
px
 
rgba
(0
,
255,0,
.6
)
,
inset
 
0
0
10
px
 
rgba
(0
,
255,0,
.4
)
,
0
2
px
 
0
#000
;

    
}
}
@
keyframes glow { 0% {
	border-color: #393;
	box-shadow: 0 0 5px rgba(0, 255, 0, .2), inset 0 0 5px
		rgba(0, 255, 0, .1), 0 2px 0 #000;
}
100%
{
border-color
:
 
#6f6
;

		
box-shadow
:
 
0
0
20
px
 
rgba
(0
,
255,0,
.6
)
,
inset
 
0
0
10
px
 
rgba
(0
,
255,0,
.4
)
,
0
2
px
 
0
#000
;

    
}
}
</style>
</head>
<body>

	<div>
		<div class="Error">
			<h1 style="font-family: courier;">
				<img class="err" src="src/err.png" alt="err" width="60" height="60">
				Game not found
			</h1>
		</div>
	</div>
	<div class="Text">
		<h2 style="font-family: courier;">Find another Game:</h2>
	</div>
	<div class="SubTitulo">
		<h3 style="font-family: courier;">Enter the full name</h3>
	</div>

	<section class="webdesigntuts-workshop">
		<form action="YoutubeController" method="get">
			<input type="search" placeholder="Search..." id="query" name="query" />
			<button>Search</button>
		</form>
	</section>
	<br>
	<br>
	<a href="index.jsp"><img class="volver" width="125" height="30"
		src="images/volver.png"></a>
</body>
</html>



