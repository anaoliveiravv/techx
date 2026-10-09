package br.com.estudo.entregavel.dto;

public class AlunoRequest {

    private String nome;
    private int idade;
    private String ra;

    public AlunoRequest() {
    }

    public AlunoRequest(String nome, int idade, String ra) {
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
