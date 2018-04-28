/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon Larivoir
 */
public class ListaDeOfertasHosp {
    private static List<OfertaHosp> vagas;
    
    public static List<OfertaHosp> getInstance() {
        if(vagas == null) {
            vagas = new ArrayList<>();
            Anfitriao a1 = new Anfitriao("Jose");
            a1.setCargo("Aluno");
            a1.setEmail("aluno@aluno.com");
            int p1 = 1;
            OfertaHosp v1 = new OfertaHosp(a1, p1);
            Anfitriao a2 = new Anfitriao("Joao");
            a2.setCargo("Professor");
            a2.setEmail("professor@professor.com");
            int p2 = 12;
            OfertaHosp v2 = new OfertaHosp(a2, p2);
            
            
            vagas.add(v1);
            vagas.add(v2);
        }
        return vagas;
    }
}
