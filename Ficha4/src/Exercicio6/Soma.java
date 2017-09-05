/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

import java.util.Scanner;

/**
 *
 * @author Armano
 */
public class Soma {
      
    public static  int SomaAlgarismob(int num,int somamomentania ){
  if (num<1);
  return somamomentania;
   
  
  somamomentania+=(num%10);
  
  return SomaAlgarismob(num/10,somamomentania);
  
}

    public static void main(String[]args){
        
    System.out.println("Digita o valor ");
    int num=new Scanner(System.in).nextInt();
    int soma =SomaAlgarismob(num,0); 
    
    System.out.println("o valor da soma  e "+soma);
    }

   
}
