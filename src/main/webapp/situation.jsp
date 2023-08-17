<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Тайна позолоченного кинжала</title>
    <link href="static/main.css" rel="stylesheet">
    <style>
        .description {
            width: 700px;
            height: 120px;
            background: #0A3542;
            text-align: center;
            align-self: center;

        }

        html, body {
            background-color: #0A3542;
            color: #FFF;
            font-size: 20px;
            height: 100%;
        }
    </style>
</head>
<body>
<div class="text">
    <div class="description" lang="ru">
        ${question}
    </div>
    <div>
        <form action="/logic" method="get">

            <button class="btn default" type="submit" name="answer" value="first"> ${answer1}</button>
            <button class="btn default" type="submit" name="answer" value="second">${answer2}</button>

        </form>
    </div>
</div>

</body>
</html>
