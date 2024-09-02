<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<style>
body,html{
margin:0;
padding:0;
font-family:Times New Roman,serif;
height:100%;
display:flex;
flex-direction:column;
background-color:#f4f4f4;
align-items:center;
justify-content:center;
}

.contact-container{
background-color: #fff;
	padding: 40px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius:10px;
	width:100%;
	max-width:600px;
	box-sizing:border-box;
	}
	
	
	h2{
	text-align:center;
	color:#333;
	margin-bottom:20px;
	
	}
form{
display:flex;
flex-direction:column;
}
label{
color:#555;
	margin-bottom:20px;
}

input[type="text"], input[type="email"],textarea {
            width: 93%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            	box-sizing:border-box;
            
            font-size:16px;
        }

textarea{
resize:vertical;
height:150px;

}


input[type="submit"] {
            width: 93%;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color:#4CAF50;
            color:white;
            font-size:16px;
            cursor:pointer;
        }
        
        input[type="submit"]:hover {
                    background-color:#45a049;
        }
</style>

</head>
<body>
<div class="contact-container">
        <h2>Contact Us</h2>
        <form action=contact.jsp method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="message">Message:</label>
            <textarea id="message" name="message" required></textarea>

            <button type="submit" class="button">Submit</button>
        </form>
    </div>

</body>
</html>