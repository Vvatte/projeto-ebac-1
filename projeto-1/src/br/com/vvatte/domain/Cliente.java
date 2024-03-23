package br.com.vvatte.domain;

import java.util.Objects;

public class Cliente {

    private String nome;
    private Long cpf;
    private String endereco;
    private Long telefone;

    public Cliente(String nome, String cpf, String endereco, String telefone){
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.endereco = endereco;
        this.telefone = Long.valueOf(telefone.trim());



    }

    @java.lang.Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.lang.Long getCpf() {
        return cpf;
    }

    public void setCpf(java.lang.Long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public java.lang.Long getTelefone() {
        return telefone;
    }

    public void setTelefone(java.lang.Long telefone) {
        this.telefone = telefone;
    }
}
