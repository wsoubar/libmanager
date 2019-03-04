<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>

<head>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
</head>

<body>
    <h1>${msg}</h1>
    <h2>Hoje é dia
        <fmt:formatDate value="${today}" pattern="dd/MM/yyyy" />
    </h2>
</body>

</html>