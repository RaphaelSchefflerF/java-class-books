/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcaoap2;

/**
 *
 * @author pcrap
 */
public class Autor {
    private String cpf,nome,dadosConta;
    
    public Autor(){}

    public Autor(String cpf, String nome, String dadosConta) {
        this.cpf = cpf;
        this.nome = nome;
        this.dadosConta = dadosConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDadosConta() {
        return dadosConta;
    }

    public void setDadosConta(String dadosConta) {
        this.dadosConta = dadosConta;
    }
    
    public String toString() {
        return "Autores{" + "cpf=" + cpf + ", nome=" + nome + ", dadosConta=" + dadosConta + '}';
    }
}
