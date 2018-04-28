<%-- 
    Document   : adicionar-interessado
    Created on : 27/04/2018, 21:45:34
    Author     : Ramon Larivoir
--%>

<%@page import="br.ufjf.dcc192.Intercambista"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Interessado</title>
    </head>
    <body>
        <form method="POST">
            <input type="hidden" value="<%=request.getAttribute("idAnf")%>" name="idAnf">
            <label>Selecione o intercambista interessado</label>
            <select name="inter">
                <% for (Intercambista inter : (List<Intercambista>)request.getAttribute("inters")) { %>
                <option><%=inter.getNome()%></option>     
                <%  }   %>
            </select>
            <input type="submit" value="Selecionar">
            <a href="index.html"><input type="button" value="Voltar"></a>
        </form>
    </body>
</html>
