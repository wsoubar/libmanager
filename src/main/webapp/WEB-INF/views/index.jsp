<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>COTI - Lib Manager</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.css" />
  <link rel="stylesheet" href="resources/css/index.css">
</head>

<body class="container">
  <!--
    <div class="row">
        <div class="col-md-3">
            <ul class="nav flex-column">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Active</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
            </ul>
        </div>
        <div class="col-md-9">
            <h1>${msg}</h1>
            <h2>Hoje é dia
                <fmt:formatDate value="${today}" pattern="dd/MM/yyyy" />
            </h2>
        </div>

    </div>
    -->
  <!-------->
  <h1>COTI - Bradesco Seguros</h1>
  <div id="content">
    <ul id="tabs" class="nav nav-tabs" data-tabs="tabs">
      <li class="active"><a href="#servers" data-toggle="tab">Servidores</a></li>
      <li><a href="#orange" data-toggle="tab">Orange</a></li>
      <li><a href="#yellow" data-toggle="tab">Yellow</a></li>
      <li><a href="#green" data-toggle="tab">Green</a></li>
      <li><a href="#blue" data-toggle="tab">Blue</a></li>
    </ul>
    <div id="my-tab-content" class="tab-content">
      <div class="tab-pane active" id="servers">
        <h1>Servidores</h1>
        <c:import url="servers.jsp"></c:import>
      </div>
      <div class="tab-pane" id="orange">
        <h1>Orange</h1>
        <c:import url="orange.jsp"></c:import>
      </div>
      <div class="tab-pane" id="yellow">
        <h1>Yellow</h1>
        <p>yellow yellow yellow yellow yellow</p>
      </div>
      <div class="tab-pane" id="green">
        <h1>Green</h1>
        <p>green green green green green</p>
      </div>
      <div class="tab-pane" id="blue">
        <h1>Blue</h1>
        <p>blue blue blue blue blue</p>
      </div>
    </div>
  </div>
  <script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="webjars/bootstrap/3.3.7-1/js/bootstrap.js"></script>
  <script type="text/javascript" src="resources/js/index.js"></script>
</body>

</html>