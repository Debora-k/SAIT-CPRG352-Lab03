<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First:</label>
            <input type="text" name="number1" value="${input1}"><br>
            <label>Second:</label>
            <input type="text" name="number2" value="${input2}"> <br>
            <br>
            <input type="submit" name="operation" value="+"> 
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
            <br>
            <p>Result: ${message}</p>
            <a href="/age">Age Calculator</a>
        </form>
    </body>
</html>
