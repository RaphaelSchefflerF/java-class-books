/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correcaoap2;

/**
 *
 * @author pcrap
 */
public class Livrofisico extends Livro {
    private Categoria categoria;
    private boolean esgotado = false, capa;

    public Livrofisico(Categoria categoria, boolean capa, String isbn, String titulo, int codigo, int valor, Autor autor) {
        super(isbn, titulo, codigo, valor, autor);
        this.categoria = categoria;
        this.capa = capa;  
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isEsgotado() {
        return esgotado;
    }

    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Livrofisico{" + "categoria=" + categoria + ", esgotado=" + esgotado + ", capa=" + capa + '}';
    }  
}
