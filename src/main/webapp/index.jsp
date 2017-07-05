<html>
<body>

	<div id="demo">

		<h2>My Calculator</h2>
		<input id="myInput" type="text" value="my number">
		<br>
		<button type="button" onclick="doSomething()">Calc it!</button>
	</div>

	<script>
		var url = "http://localhost:8088/students/yossef/myresource/";
		
		function doSomething() {
			var myReq;
			myReq = new XMLHttpRequest();
			myReq.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					
					document.getElementById("myOutput").value = myReq.responseText;
				}
			};
			
			var myParam = document.getElementById("myInput").value;
			myReq.open("GET", url+myParam, true);
			myReq.send();
		}
		
	</script>
	<input id="myOutput" type="text" value="my answer">
</body>
</html>
