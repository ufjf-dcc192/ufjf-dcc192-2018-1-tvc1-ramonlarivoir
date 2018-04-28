package br.ufjf.dcc192;

/**
 *
 * @author Ramon Larivoir
 */
public class Anfitriao {
    String nome;
    String cargo;
    String email;

    public Anfitriao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
