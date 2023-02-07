<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Ninja Gold Game</title>
</head>
<body>
    <div class="container mt-3">
        <h3>Your Gold: <c:out value="${gold}"/></h3>
        <div class="d-flex justify-content-between mt-3 mb-5">
            <div class="card">
                <div class="card-header">Farm</div>
                <div class="card-body">
                    <div class="mt-4 mb-4">
                        (Earns 10-20 Gold)
                    </div>
                    <form action="/" method = "post">
                        <div class="d-flex justify-content-center">
                            <input type="submit" class="btn btn-primary" name="farm" value="Find Gold!"/>
                        </div>
                    </form>
                </div>
            </div>
            <div class="card">
                <div class="card-header">Cave</div>
                <div class="card-body">
                    <div class="mt-4 mb-4">(Earns 5-10 Gold)</div>
                    <form action="/" method = "post">
                        <div class="d-flex justify-content-center">
                            <input type="submit" class="btn btn-primary" name="cave" value="Find Gold!"/>
                        </div>
                    </form>
                </div>
            </div>
            <div class="card">
                <div class="card-header">House</div>
                <div class="card-body">
                    <div class="mt-4 mb-4">(Earns 2-5 Gold)</div>
                    <form action="/" method = "post">
                        <div class="d-flex justify-content-center">
                            <input type="submit" class="btn btn-primary" name="house" value="Find Gold!"/>
                        </div>
                    </form>
                </div>
            </div>
            <div class="card">
                <div class="card-header">Quest</div>
                <div class="card-body">
                    <div class="mt-4 mb-4">(Earns/Takes 0-50 Gold)</div>
                    <form action="/" method = "post">
                        <div class="d-flex justify-content-center">
                            <input type="submit" class="btn btn-primary" name="quest" value="Find Gold!"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-header">
                <h4>Activites:</h4>
            </div>
            <div class="card-body">
                <iframe src="/activities" frameborder="Activites iFrame" width="100%" height="200%"></iframe>
            </div>
        </div>
    </div>
</body>
</html>