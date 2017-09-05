/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

/**
 *
 * @author Armano
 */
public class Livro1 implements Publicacao {
    private String titulo;
    private String autor;
    private int totalpag;
    private boolean  aberto;
    private String leitor;
    private int PaginaAtual;


    /**
     *
     * @return
     */
    public String toString() {
        return "Livro1{" + " \n,titulo="
                + titulo + "\n, autor=" 
                + autor + "\n, totalpag="
                + totalpag + "\n, aberto="
                + aberto + "\n, leitor=" 
                + leitor + '}';
    }

    public Livro1(String titulo, String autor, int totalpag, boolean aberto, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalpag = totalpag;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(int totalpag) {
        this.totalpag = totalpag;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhar(int p) {
        this.PaginaAtual=p;
    }

 
    @Override
    public void PaginaAtual() {
        this.PaginaAtual++;
    }

    @Override
    public void voltarp() {
        this.PaginaAtual--;
    }
    
}
