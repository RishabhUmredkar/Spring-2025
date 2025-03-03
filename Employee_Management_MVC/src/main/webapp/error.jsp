<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Oops! Page Not Found</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background: linear-gradient(135deg, #2c3e50, #4ca1af);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            color: white;
            font-family: Arial, sans-serif;
        }
        .container {
            position: relative;
            max-width: 600px;
            background: rgba(255, 255, 255, 0.1);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(255, 255, 255, 0.3);
            backdrop-filter: blur(10px);
            animation: fadeIn 1s ease-in-out;
        }
        h1 {
            font-size: 80px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        p {
            font-size: 18px;
            margin-bottom: 20px;
        }
        .btn-primary {
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            border: none;
            border-radius: 50px;
            font-size: 1.2rem;
            padding: 10px 20px;
            transition: 0.3s;
            color: white;
            text-decoration: none;
            display: inline-block;
        }
        .btn-primary:hover {
            transform: scale(1.05);
            box-shadow: 0 0 15px rgba(255, 255, 255, 0.8);
        }
        .astronaut {
            width: 150px;
            display: block;
            margin: 0 auto 20px;
            animation: float 3s infinite ease-in-out;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        @keyframes float {
            0%, 100% { transform: translateY(0); }
            50% { transform: translateY(-10px); }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>404</h1>
        <p>${message}</p>
        <img src="https://cdn-icons-png.flaticon.com/512/3214/3214733.png" class="astronaut" alt="Astronaut">
        <p>Let's get you back home before aliens find you!</p>
        <a href="/Employee_Management_MVC/index.jsp" class="btn-primary">Go Home</a>
    </div>
</body>
</html>
