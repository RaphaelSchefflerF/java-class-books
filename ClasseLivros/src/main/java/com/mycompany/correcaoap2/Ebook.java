/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcaoap2;

/**
 *
 * @author pcrap
 */
public class Ebook extends Livro {
    private Formato formato;
    private int tamanho;

    public Ebook(Formato formato, int tamanho, String isbn, String titulo, int codigo, int valor, Autor autor) {
        super(isbn, titulo, codigo, valor, autor);
        this.formato = formato;
        this.tamanho = tamanho;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Ebook{" + "formato=" + formato + ", tamanho=" + tamanho + '}';
    }
    
    
}
