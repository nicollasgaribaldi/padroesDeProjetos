package tech.nicollas.com.pessoas;

import tech.nicollas.com.composicao.Profissao;

public class Cliente extends Pessoa {
    private String codigo;
    private Profissao profissao;

    public Cliente(String nome, Profissao profissao){
        this.nome = nome;
        this.profissao = profissao;
    }

    //GETS E SETS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", profissao=" + profissao + ", nome=" + nome + "]";
    }
}