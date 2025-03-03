<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background: linear-gradient(135deg, #1d2671, #c33764);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            background: rgba(255, 255, 255, 0.1);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(255, 255, 255, 0.3);
            backdrop-filter: blur(10px);
            animation: fadeIn 1s ease-in-out;
            width: 400px;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        .form-control {
            background: rgba(255, 255, 255, 0.2);
            border: none;
            border-radius: 10px;
            color: white;
        }
        .form-control::placeholder {
            color: rgba(255, 255, 255, 0.7);
        }
        .btn-primary {
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
            border: none;
            border-radius: 50px;
            font-size: 1.2rem;
            padding: 10px;
            transition: 0.3s;
        }
        .btn-primary:hover {
            transform: scale(1.05);
            box-shadow: 0 0 15px rgba(255, 255, 255, 0.8);
        }
    </style>
</head>
<body>
    <div class="container text-white text-center">
        <h2 class="mb-4">Admin Login</h2>
        <form action="adminLogin" method="get">
            <div class="mb-3">
                <input type="text" class="form-control" placeholder="Name" name="name" required>
            </div>
            <div class="mb-3">
                <input type="email" class="form-control" placeholder="Email ID" name="email" required>
            </div>
            <div class="mb-3">
                <input type="text" class="form-control" placeholder="Mobile No" name="phone" required>
            </div>
            <div class="mb-3">
                <input type="password" class="form-control" placeholder="Password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Login</button>
        </form>
    </div>
</body>
</html>