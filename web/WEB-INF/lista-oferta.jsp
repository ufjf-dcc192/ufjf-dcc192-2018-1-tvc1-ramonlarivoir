<%-- 
    Document   : lista-oferta
    Created on : 27/04/2018, 21:33:37
    Author     : Ramon Larivoir
--%>

<%@page import="br.ufjf.dcc192.OfertaHosp"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oferta Hospedagem</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Anfitriao</th>
                    <th>Duração (meses)</th>
                    <th colspan="3">Ação</th>
                </tr>
            </thead>
            <tbody>
                <%  int i = 0;
                    for (OfertaHosp oferta : (List<OfertaHosp>)request.getAttribute("ofertas")) { %>
                <tr>
                    <td><%=oferta.getAnfitriao().getNome()%></td>
                    <td><%=oferta.getDuracao()%></td>
                    <td><a href="adicionar-interessado.html?id=<%=i%>">Adicionar interessado</a></td>
                    <td><a href="lista-interessados.html?id=<%=i%>">Ver Interessados</a></td>
                    <td><a href="anfitriao.html?id=<%=i%>">Ver Anfitrião</a></td>
                </tr>
                <%i++; }%>
            </tbody>
        </table>
            <a href="nova-oferta.html"><input type="button" value="Nova Oferta"></a>
    </body>
</html>
