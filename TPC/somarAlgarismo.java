/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author Armano
 */
public class somarAlgarismo {
    
     public static int somaNumero(String numero){
        if(numero.length()==0){
         return numero.length();}
 
    return somaNumero(numero.substring(1))+(int)Character.getNumericValue(numero.charAt(0));
    }
    
    public static void main(String[] args) {
        String n=JOptionPane.showInputDialog(null,"Introduza o numero!");
    
       JOptionPane.showMessageDialog(null,somaNumero(n));
    }
    
    
}
