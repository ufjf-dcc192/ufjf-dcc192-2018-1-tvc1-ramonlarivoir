<%-- 
    Document   : intercambista
    Created on : 27/04/2018, 23:06:39
    Author     : Ramon Larivoir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Intercambista</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=request.getAttribute("nome")%></td>
                    <td><%=request.getAttribute("email")%></td>
                </tr>
            </tbody>
        </table>
                <a href="index.html"><input type="button" value="Voltar"</a>
    </body>
</html>
