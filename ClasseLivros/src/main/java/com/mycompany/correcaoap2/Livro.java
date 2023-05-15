/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcaoap2;

/**
 *
 * @author pcrap
 */
public class Livro {
    private String isbn, titulo;
    private int codigo, valor;
    private Autor autor;
    
    public Livro(){}

    public Livro(String isbn, String titulo, int codigo, int valor, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.codigo = codigo;
        this.valor = valor;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", titulo=" + titulo + ", codigo=" + codigo + ", valor=" + valor + ", autor=" + autor + '}';
    }
    
    public double calvalor(){
        return valor * 1.5;
    }
}
