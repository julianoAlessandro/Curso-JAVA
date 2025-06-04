/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capitulo10;

import java.util.Scanner;

public class ExercicioResolvido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
           

        }
         System.out.println("Diagonal Principal: ");
         for(int i=0; i<mat.length; i++){
              System.out.print(mat[i][i] + " ");
         }
         int cout = 0;
          for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               if(mat[i][j] < 0){
                   cout = cout + 1;
               }
            }
           

        }
       System.out.println("");
       System.out.println("Numeros negativos: " + cout); 
    }

}
