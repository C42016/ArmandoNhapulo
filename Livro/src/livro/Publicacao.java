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
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhar(int p);
    public void  PaginaAtual();
    public void voltarp();
}
