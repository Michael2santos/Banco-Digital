package BancoDigital;

import java.util.List;

public class Banco {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    public List<Conta> contas;

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
