package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon Larivoir
 */
public class ListaDeAnfritriao {
    private static List<Anfitriao> anfs;
    
    public static List<Anfitriao> getInstance() {
        if(anfs == null) {
            anfs = new ArrayList<>();
            Anfitriao a1 = new Anfitriao("Jose");
            a1.setCargo("Aluno");
            a1.setEmail("aluno@aluno.com");
            Anfitriao a2 = new Anfitriao("Joao");
            a2.setCargo("Professor");
            a2.setEmail("professor@professor.com");
            
            anfs.add(a1);
            anfs.add(a2);
        }
        return anfs;
    }
}
