package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon Larivoir
 */
public class ListaDeIntercambista {
    private static List<Intercambista> inters;
    
    public static List<Intercambista> getInstance() {
        if(inters == null) {
            inters = new ArrayList<>();
            Intercambista i1 = new Intercambista("Antonio");
            i1.setEmail("antonio@antonio.com");
            Intercambista i2 = new Intercambista("Mário");
            i2.setEmail("mario@mario.com");
            
            inters.add(i1);
            inters.add(i2);
        }
        return inters;
    }
}
