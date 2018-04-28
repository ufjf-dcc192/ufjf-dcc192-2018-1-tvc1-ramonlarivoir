/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ramon Larivoir
 */
@WebServlet(name = "OfertaServlet", urlPatterns = {"/index.html", "/nova-oferta.html", "/lista-oferta.html", "/adicionar-interessado.html", "/lista-interessados.html", "/anfitriao.html"})
public class OfertaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       if("/lista-oferta.html".equals(request.getServletPath())) {
           listaOfertas(request, response);
       } else if ("/adicionar-interessado.html".equals(request.getServletPath())) {
           adicionarInteressado(request, response);
       } else if("/nova-oferta.html".equals(request.getServletPath())) {
           novaOferta(request, response);
       } else if("/index.html".equals(request.getServletPath())) {
           listaOfertas(request, response);
       } else if("/lista-interessados.html".equals(request.getServletPath())) {
           listaInteressados(request, response);
       } else if("/anfitriao.html".equals(request.getServletPath())) {
           exibeAnfitriao(request, response);
       }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if("/adicionar-interessado.html".equals(request.getServletPath())) {
            Integer idAnf = Integer.parseInt(request.getParameter("idAnf"));
            String inter = request.getParameter("inter");
            Intercambista novoInter = new Intercambista(inter);
            ListaDeOfertasHosp.getInstance().get(idAnf).adicionaInteressado(novoInter);
            
            response.sendRedirect("lista-oferta.html");
        } else if("/nova-oferta.html".equals(request.getServletPath())) {
            String nomeAnf = request.getParameter("anf");
            Integer duracao = Integer.parseInt(request.getParameter("duracao"));
            Anfitriao anf = new Anfitriao(nomeAnf);
            OfertaHosp novaOferta = new OfertaHosp(anf, duracao);
            ListaDeOfertasHosp.getInstance().add(novaOferta);
            response.sendRedirect("lista-oferta.html");
        }
    }
    
    

    protected void listaOfertas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<OfertaHosp> ofertas = ListaDeOfertasHosp.getInstance();
        request.setAttribute("ofertas", ofertas);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/lista-oferta.jsp");
        despachante.forward(request, response);
    }
    
    protected void adicionarInteressado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idAnf = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("idAnf", idAnf);
        List<Intercambista> inters = ListaDeIntercambista.getInstance();
        request.setAttribute("inters", inters);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/adicionar-interessado.jsp");
        despachante.forward(request, response);
    }
    
    protected void novaOferta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Anfitriao> anfs = ListaDeAnfritriao.getInstance();
        request.setAttribute("anfs", anfs);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/nova-oferta.jsp");
        despachante.forward(request, response);
    }
    
    protected void listaInteressados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idOfer = Integer.parseInt(request.getParameter("id"));
        List<Intercambista> inters = ListaDeOfertasHosp.getInstance().get(idOfer).getListaInteressados();
        request.setAttribute("inters", inters);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/lista-interessados.jsp");
        despachante.forward(request, response);
    }

    protected void exibeAnfitriao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idOfer = Integer.parseInt(request.getParameter("id"));
        Anfitriao anf = ListaDeOfertasHosp.getInstance().get(idOfer).getAnfitriao();
        String nome = anf.getNome();
        String cargo = anf.getCargo();
        String email = anf.getEmail();
        request.setAttribute("nome", nome);
        request.setAttribute("cargo", cargo);
        request.setAttribute("email", email);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/anfitriao.jsp");
        despachante.forward(request, response);
    }
}
