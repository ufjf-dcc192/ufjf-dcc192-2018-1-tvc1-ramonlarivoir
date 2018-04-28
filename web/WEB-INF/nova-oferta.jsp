<%-- 
    Document   : nova-oferta
    Created on : 27/04/2018, 22:12:23
    Author     : Ramon Larivoir
--%>

<%@page import="br.ufjf.dcc192.Anfitriao"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nova Oferta</title>
    </head>
    <body>
        <form method="post">
            <label>Selecione o Anfitriao</label>
            <select name="anf">
                <%for (Anfitriao anf : (List<Anfitriao>)request.getAttribute("anfs")) { %>
                <option><%=anf.getNome()%></option>
                <%}%>
            </select>
            <label>Qual a duração em meses?</label>
            <input type="number" name="duracao">
            <input type="submit">
        </form>
    </body>
</html>
