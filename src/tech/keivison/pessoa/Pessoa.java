package tech.keivison.pessoa;

import tech.keivison.composicao.Endereco;
import tech.keivison.composicao.Telefone;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private Telefone telsContato;

    public void cadastrar(){

    }

    public String obterIdade(){
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }
}
