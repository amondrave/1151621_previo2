<%-- 
    Document   : prueba
    Created on : 12/11/2019, 09:27:21 AM
    Author     : estudiante
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>A continuacion se presenta una serie de numeros de 10 en 10, por favor
         escoja la cantidad de números que considere necesaria que sumen 100</h1>
        <form name="pruebas" action="../../Respuesta.do">
            <input type="checkbox" value="10" name="x1">10||<input type="checkbox" value="20" name="x2">20|| <input type="checkbox" value="30" name="x3">30|| <input type="checkbox" value="40" name="x4">40|| <input type="checkbox" value="50" name="x5">50<br>
            <input type="checkbox" value="60" name="x6">60|| <input type="checkbox" value="70" name="x7">70|| <input type="checkbox" value="80" name="x8">80|| <input type="checkbox" value="90" name="x9">90|| <input type="checkbox" value="100" name="x10">100<br>
            <input type="submit" value="responder">
            
        </form>
    </body>
</html>
