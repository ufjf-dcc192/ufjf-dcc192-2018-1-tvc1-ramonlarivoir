<%-- 
    Document   : anfitriao
    Created on : 27/04/2018, 22:47:16
    Author     : Ramon Larivoir
--%>

<%@page import="br.ufjf.dcc192.Anfitriao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Anfitrião</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Cargo</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=request.getAttribute("nome")%></td>
                    <td><%=request.getAttribute("cargo")%></td>
                    <td><%=request.getAttribute("email")%></td>
                </tr>
            </tbody>
        </table>
                <a href="index.html"><input type="button" value="Voltar"</a>
    </body>
</html>
