<
<!DOCTYPE html>
<%@page import="java.sql.Connection"%>
<html>
<head>
<!-- Font Awesome Icon Library -->
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@ page import="java.sql.Connection"%>

<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.lang.String"%>
<style>
.checked {
	color: orange;
}

input.star {
	display: none;
}

label.star {
	float: right;
	padding: 10px;
	font-size: 36px;
	color: #444;
	transition: all .2s;
}

input.star:checked ~ label.star:before {
	content: '\f005';
	color: #FD4;
	transition: all .25s;
}

input.star-5:checked ~ label.star:before {
	color: #FE7;
	text-shadow: 0 0 20px #952;
}

input.star-1:checked ~ label.star:before {
	color: #F62;
}

/* label.star:hover { transform: rotate(-15deg) scale(1.3); }
 */
label.star:before {
	content: '\f006';
	font-family: FontAwesome;
}
</style>
</head>


<body>

	<div class="container-flow">
		<div class="row">
			<div class="col-sm-6">
				<div class="hero-image">
					<iframe width="650" height="350"
						src="https://www.youtube.com/embed/fnGW4iQzVLw" frameborder="0"
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
						allowfullscreen></iframe>
				</div>
			</div>

			<!-- 			<div class="row"> -->


			<div class="col-sm-6">
				<h3 style="font-family: Arial, Helvetica, sans-serif;">
					<b>Synopsis</b>
				</h3>
				<p style="font-family: Arial, Helvetica, sans-serif">K.G.F:
					Chapter 1 is a 2019 Indian Kannada-language period action
					film[7][8] written and directed by Prashanth Neel, and produced by
					Vijay Kiragandur under the banner Hombale films. It is the first
					installment in the two-part series, followed by K.G.F: Chapter 2.
					The film centers around Raja Krishnappa Bairya "Rocky", born into
					poverty, who arrives in Bombay (now Mumbai) in the 1960s, on a
					quest for power and wealth as desired by his dying mother. Involved
					with the gold mafia there, he is recruited to kill Garuda, the
					oppressive heir-in-waiting, in Kolar Gold Fields. Yash stars as
					Rocky, while Ramachandra Raju features as Garuda. Anant Nag
					narrates the film while also playing a supporting role alongside
					Srinidhi Shetty, Vasishta N. Simha, Ayyappa P. Sharma and Harish
					Rai.</p>
				<p style="font-family: Arial, Helvetica, sans-serif;">&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;K.G.F
					Chapter[1] is a 2019 Telugu film</p>
			</div>
		</div>


		<div class="row">
			<div align="left" class="stars">

				<label class="star star-5" for="5"></label> <input
					class="star star-4" id="4" type="radio" name="star" value="4" /> <label
					class="star star-4" for="4"></label> <input class="star star-3"
					id="3" type="radio" name="star" value="3" /> <label
					class="star star-3" for="3"></label> <input class="star star-2"
					id="2" type="radio" name="star" value="2" /> <label
					class="star star-2" for="2"></label> <input class="star star-1"
					id="1" type="radio" name="star" value="1" /> <label
					class="star star-1" for="1"></label>
			</div>
		</div>

		<div class="row">
			<form action="login" method="post">
				<input type="text" placeholder="name" name="name">
				<button type="submit" class="float">Rate</button>
				<input class="star star-5" id="5" type="radio" name="star" value="5" />
			</form>
		</div>



	</div>


	<%
		// Connection com=ConnectionFactory.getConnection();
		// Statement st=com.createStatement();
		// String sql="select com from ratingcomment";
		// ResultSet rs=st.executeQuery(sql);
		// while(rs.next())
		// {
		//       //String ra = rs.getString("user_emailid");

		// 	 String comment = rs.getString("com");
		// }
	%>

</html>