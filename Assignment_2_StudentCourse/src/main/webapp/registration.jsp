<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>

<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background: white;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	width: 400px;
}

h2 {
	text-align: center;
	margin-bottom: 20px;
	color: #333;
}

table {
	width: 100%;
}

td {
	padding: 10px;
}

input[type="text"], input[type="email"], input[type="date"], select {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.gender {
	display: flex;
	gap: 15px;
	align-items: center;
}

.buttons {
	text-align: center;
}

input[type="submit"], input[type="button"] {
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	background-color: #007bff;
	color: white;
	cursor: pointer;
	margin: 5px;
}

input[type="submit"]:hover, input[type="button"]:hover {
	background-color: #0056b3;
}

h3 {
	text-align: center;
	margin-top: 20px;
	font-size: 16px;
}

a {
	text-decoration: none;
	color: #007bff;
}

a:hover {
	text-decoration: underline;
}
</style>

</head>

<body>

	<div class="container">

		<h2>Registration Form</h2>

		<form action="addStudent.jsp" method="post">

			<table>

				<tr>
					<td>PRN Number</td>
					<td><input type="text" name="prn"></td>
				</tr>

				<tr>
					<td>First Name</td>
					<td><input type="text" name="fName"></td>
				</tr>

				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lName"></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>

				<tr>
					<td>Branch</td>
					<td><input type="text" name="branch"></td>
				</tr>

				<tr>
					<td>Birth-Date</td>
					<td><input type="date" name="dob"></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td class="gender"><input type="radio" name="gender"
						value="Male"> Male <input type="radio" name="gender"
						value="Female"> Female</td>
				</tr>

				<tr>
					<td>Semester</td>
					<td><select name="semister">
							<option selected>Select</option>
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
					</select></td>
				</tr>

				<tr>
					<td colspan="2"><input type="checkbox" name="terms">
						Agree Terms and Conditions</td>
				</tr>

				<tr>
					<td colspan="2" class="buttons"><input type="button"
						value="Back" onclick="location.href='index.jsp'"> <input
						type="submit" value="Register"></td>
				</tr>

			</table>

			<h3>
				If Already Registered? <a href="login.jsp">Login</a>
			</h3>

		</form>

	</div>

</body>
</html>