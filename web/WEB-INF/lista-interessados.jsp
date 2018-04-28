<%-- 
    Document   : lista-interessados
    Created on : 27/04/2018, 22:25:42
    Author     : Ramon Larivoir
--%>

<%@page import="br.ufjf.dcc192.Intercambista"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Interessados</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                </tr>
            </thead>
            <tbody>
                <%for (Intercambista inter : (List<Intercambista>)request.getAttribute("inters")) { %>
                <tr>
                    <td><%=inter.getNome()%></td>
                </tr>     
                <%    }  %>
            </tbody>
        </table>
    </body>
</html>
