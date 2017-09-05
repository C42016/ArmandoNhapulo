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
public class converterDecimalBinario {
    
    public static  String binario(String n){
        int num=Integer.parseInt(n);
          if(num==0){
          return "";
          } return binario(Integer.toString(num/2))+(num%2);
        
     
}
    public static void main(String[] args) {
        String numero=JOptionPane.showInputDialog("Introduza o numero!");
        JOptionPane.showMessageDialog(null, numero+" = "+binario(numero));
        
    }
    
}
