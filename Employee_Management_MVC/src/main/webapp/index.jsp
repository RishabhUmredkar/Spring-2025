<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Elegant Login Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background: linear-gradient(135deg, #1e3c72, #2a5298);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            overflow: hidden;
        }
        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.15);
            padding: 50px;
            border-radius: 20px;
            box-shadow: 0 0 25px rgba(173, 216, 230, 0.6);
            animation: fadeIn 1.5s ease-in-out;
            position: relative;
            backdrop-filter: blur(15px);
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        .btn {
            width: 250px;
            font-size: 1.5rem;
            font-weight: bold;
            transition: all 0.3s ease-in-out;
            border-radius: 50px;
            padding: 15px;
            text-transform: uppercase;
            letter-spacing: 1px;
        }
        .btn-primary {
            background: linear-gradient(135deg, #6a11cb, #2575fc);
            border: none;
            box-shadow: 0 5px 15px rgba(106, 17, 203, 0.6);
        }
        .btn-danger {
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            border: none;
            box-shadow: 0 5px 15px rgba(255, 117, 140, 0.6);
        }
        .btn:hover {
            transform: translateY(-5px) scale(1.05);
            box-shadow: 0 0 30px rgba(255, 255, 255, 0.9);
        }
        .glow {
            position: absolute;
            width: 600px;
            height: 600px;
            background: radial-gradient(circle, rgba(173, 216, 230, 0.5), transparent);
            filter: blur(120px);
            animation: moveGlow 5s infinite alternate ease-in-out;
        }
        @keyframes moveGlow {
            0% { transform: translate(-40%, -40%); }
            100% { transform: translate(40%, 40%); }
        }
    </style>
</head>
<body>
    <div class="glow"></div>
    <div class="container text-white">
        <h1 class="mb-4">Welcome to the Student Portal</h1>
        <p class="mb-4">Please select your login type</p>
        <button class="btn btn-primary mb-3" onclick="location.href='userLogin.jsp'">User Login</button><br>
        <button class="btn btn-danger" onclick="location.href='adminLogin.jsp'">Admin Login</button>
    </div>
</body>
</html>