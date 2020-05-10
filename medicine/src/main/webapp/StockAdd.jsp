<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2020/5/8
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script src="jquery.min.js"></script>
  <style>
    body{
      background: rgb(238,238,238);
    }
    .box {
      background: rgb(250,250,250);
      width: 1000px;
      height: 430px;
      margin: 100px auto;
      border: 1px #ccc solid;
      border-radius: 3px;
    }

    h2 {
      text-align: center;
    }

    input {
      height: 40px;
      width: 288px;
      margin-top: 25px;
      margin-left: 30px;
      border-radius: 5px;
      outline: none;
      border: 1px #ccc solid;
      padding-left: 10px;
    }

    span {
      font-size: 25px;
      margin-left: 20px;
    }

    .submit {
      color: white;
      background-color: rgb(45, 147, 214);
      height: 70px;
      width: 90%;
      margin: 40px auto;
      border: 1px #ccc solid;
      margin-top: 50px;
      margin-right: 0;
      padding-left: 0;
      margin-left: 50px;
    }

    .back {
      position: absolute;
      top: 20px;
      left: 100px;
      cursor: pointer;
    }

    .back p {
      width: 50px;
      height: 30px;
      border: 2px skyblue solid;
      padding-left: 10px;
      line-height: 30px;
    }
  </style>
</head>
<body>
<div class="back">
  <p>back</p>
</div>
<form method="post" action="StockAdd">
<div class="box">
  <div>
    <h2>添加的药品名称</h2>
  </div>
  <div>
    <input type="text" placeholder="药品名">
  </div>
  <div>
    <h2>添加数量</h2>
  </div>
  <div>
    <input type="text" placeholder="数量">
  </div>
  <div class="down">
    <input type="submit" value="提交" class="submit">
  </div>
</div>
</form>
<script>
  $(function() {
    $(".back").click(function() {
      window.location.href = "main.html";
    })
  })
</script>
</body>
</html>