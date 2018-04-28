package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon Larivoir
 */
public class OfertaHosp {
    Anfitriao anfitriao;
    List<Intercambista> listaInteressados;
    int duracao;

    public OfertaHosp(Anfitriao anfitriao, int duracao) {
        this.anfitriao = anfitriao;
        this.duracao = duracao;
    }

    public Anfitriao getAnfitriao() {
        return anfitriao;
    }

    public void setAnfitriao(Anfitriao anfitriao) {
        this.anfitriao = anfitriao;
    }

    public List<Intercambista> getListaInteressados() {
        return listaInteressados;
    }

    public void setListaInteressados(List<Intercambista> listaInteressados) {
        this.listaInteressados = listaInteressados;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public void adicionaInteressado(Intercambista inter) {
        if(listaInteressados == null) {
            listaInteressados = new ArrayList<>();
            listaInteressados.add(inter);
        } else {
            listaInteressados.add(inter);
        }
    }
    
}
