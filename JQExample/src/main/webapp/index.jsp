
<html>
<head>
<title>set up jquery</title>
<link rel="stylesheet" href="style.css"/>
</head>
<body>
<h2 class="myheading" id="firstH2">Hello World!</h2>
<h2 class="myheading">Hello World!</h2>
<h2 class="myheading">Hello World!</h2>
<button onclick="fn1()" id=btn1>Click me</button>

<script src="jquery.js"></script>

<script>

function fn1()
{


	//$("#heading1").fadeToggle(2000);
 //$("#firstH2").fadeToggle();
$(".myheading").fadeToggle();
	}
</script>


</body>
</html>
