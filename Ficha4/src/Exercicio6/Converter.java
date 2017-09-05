rec/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

/**
 *
 * @author Armano
 */
     public class Converter {

     public static void  Converterrr(int n){
                   if (n>0){
                       Converterrr(n/2);
                       System.out.println(n%2);
          }
       }
     public static void main(String[]args){
          Converterrr(4);


     }

   }
    

