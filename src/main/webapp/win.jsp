<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Тайна позолоченного кинжала</title>
    <link href="static/main.css" rel="stylesheet">
    <style>
        .description {
            width: 1000px;
            background: #2d8659;
            text-align: center;
            -moz-hyphens: auto;
            -webkit-hyphens: auto;
            -ms-hyphens: auto;
            margin: auto;
        }

        body {
            background-color: #2d8659;
            color: #FFF;
            font-size: 20px;
        }
    </style>
</head>
<body>
<div class="text">
    <div class="description" lang="ru">
        <p>${question}</p>
    </div>
    ${username}, вы верно указали на убийцу.
    <br/>
    <br/>

    <form action="/restart" method="post">
        <button class="btn default" type="submit">Начать заново</button>
    </form>
</div>
</body>
</html>