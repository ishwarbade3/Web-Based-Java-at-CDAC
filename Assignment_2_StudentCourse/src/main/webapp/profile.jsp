<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
Integer student = (Integer) session.getAttribute("student");

if (student == null) {

	response.sendRedirect("login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">

<title>Profile</title>

<script>
	let time = 120;

	function updateTimer() {

		let minutes = Math.floor(time / 60);

		let seconds = time % 60;

		document.getElementById("timer").innerHTML = minutes + ":"
				+ (seconds < 10 ? "0" : "") + seconds;

		time--;

		if (time < 0) {

			alert("Session Expired");

			window.location = "logoutServlet";
		}
	}

	setInterval(updateTimer, 1000);
</script>

</head>

<body align="center">

	<h1>Welcome Student</h1>

	<h2>
		PRN :
		<%=student%>
	</h2>

	<h2>
		Session Timeout : <span id="timer"> 2:00 </span>
	</h2>

	<br>
	<br>

	<a href="logoutServlet">

		<button>Logout</button>

	</a>

</body>
</html>