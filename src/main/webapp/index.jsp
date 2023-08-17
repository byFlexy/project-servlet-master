<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Тайна позолоченного кинжала</title>
    <link href="static/main.css" rel="stylesheet">
    <style>

        .description {
            width: 700px;
            background: #0A3542;
            text-align: center;
            -moz-hyphens: auto;
            -webkit-hyphens: auto;
            -ms-hyphens: auto;
            margin: auto;
        }

        body {
            background-color: #0A3542;
            color: #FFF;
            font-size: 20px;
        }
    </style>
</head>
<body>
<div class="text">
    <h1>Пролог</h1>
    <div class="description" lang="ru">
        <p>Вы - частный детектив, который проездом остановился в небольшом городке.<br/>
            Весь город говорит о таинственном убийстве богатого коллекционера антиквариата, которое произошло
            утром.<br/>
            Коллекционер был найден мертвым с позолоченным кинжалом в своей груди.<br/>
        </p>
        <p>
            К вам обращается брат жертвы с просьбой расследовать загадочное убийство.<br/>
            Он подозревает жену убитого и хочет, чтобы расследование происходило без её участия.<br/>
            У вас есть только пара дней, чтобы раскрыть тайну и найти убийцу.<br/>
        </p>
    </div>

    <b>Введите имя своего персонажа</b>
    <br/>
    <br/>
    <form action="/username" method="get">
        <label>Имя:
            <input type="text" name="username">
        </label>

        <button class="btn default" type="submit">Продолжить</button>
    </form>
</div>
</body>
</html>