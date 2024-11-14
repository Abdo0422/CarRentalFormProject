<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Rental Form</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            background: linear-gradient(135deg, #71b7e6, #9b59b6);
        }

        h2 {
            text-align: center;
            color: #333;
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        form {
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            transition: transform 0.3s ease;
        }

        form:hover {
            transform: scale(1.02);
        }

        label {
            font-size: 1rem;
            color: #555;
            margin-bottom: 5px;
            display: inline-block;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 1rem;
            transition: border-color 0.3s;
        }

        input[type="text"]:focus,
        input[type="email"]:focus,
        input[type="number"]:focus {
            border-color: #9b59b6;
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            font-size: 1rem;
            border: none;
            border-radius: 5px;
            color: #fff;
            background-color: #9b59b6;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #71b7e6;
        }
    </style>
</head>
<body>
    <form action="CarRentalServlet" method="post">
        <h2>Car Rental Form</h2>

        <label for="name">Name:</label>
        <input type="text" name="name" required>

        <label for="email">Email:</label>
        <input type="email" name="email" required>

        <label for="carModel">Car Model:</label>
        <input type="text" name="carModel" required>

        <label for="rentalDays">Number of Rental Days:</label>
        <input type="number" name="rentalDays" required>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
