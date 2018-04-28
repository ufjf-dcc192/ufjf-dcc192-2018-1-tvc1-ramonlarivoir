package br.ufjf.dcc192;

/**
 *
 * @author Ramon Larivoir
 */
public class Intercambista {
    String nome;
    String email;

    public Intercambista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
