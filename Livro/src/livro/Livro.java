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
public class Livro {

    public Livro(String panteras_, String jose, int par, Pessoa par1) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa [] P=new Pessoa[3];
        Livro[] L=new Livro[2];
    
    P[0]=new Pessoa("Armano",24,"M");
    P[1]=new Pessoa("Maria",27,"F");
    P[2]=new Pessoa("Helena",25,"F");
    
    L[0]=new Livro("PANTERAS ","Jose",300, P[0]);
    L[1]=new Livro("POO","da silva ",500,P[1]);
    
    
  System.out.println(L[0].toString());
}

   

   
}
