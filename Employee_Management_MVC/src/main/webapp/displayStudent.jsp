<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background: linear-gradient(135deg, #2c3e50, #4ca1af);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }
        .container {
            background: rgba(255, 255, 255, 0.1);
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(255, 255, 255, 0.3);
            backdrop-filter: blur(10px);
            animation: fadeIn 1s ease-in-out;
            max-width: 900px;
            width: 100%;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        table {
            border-radius: 10px;
            overflow: hidden;
        }
        th {
            background: #ff758c;
            color: white;
        }
        tr:hover {
            background: rgba(255, 255, 255, 0.2);
        }
    </style>
</head>
<body>
    <div class="container text-white">
        <h2 class="mb-4 text-center">Student Details</h2>
        <table class="table table-hover table-bordered text-center text-white">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Stream</th>
                    <th>Passout Year</th>
                    <th>Email</th>
                    <th>Mobile No</th>
                </tr>
            </thead>
            <tbody>
                <!-- Sample Data (Replace with Dynamic Data from Backend) -->
                <tr>
                    <td>Rohit Sharma</td>
                    <td>Computer Science</td>
                    <td>2023</td>
                    <td>rohit@example.com</td>
                    <td>9876543210</td>
                </tr>
                <tr>
                    <td>Virat Kohli</td>
                    <td>Electronics</td>
                    <td>2022</td>
                    <td>virat@example.com</td>
                    <td>9876543211</td>
                </tr>
                <!-- Dynamic Data from Backend Goes Here -->
            </tbody>
        </table>
    </div>
</body>
</html>
