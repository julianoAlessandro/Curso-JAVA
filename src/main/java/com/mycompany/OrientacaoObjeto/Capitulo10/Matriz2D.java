/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capitulo10;

import java.util.Scanner;

public class Matriz2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        int valorMatriz = sc.nextInt();

        int[][] MatrizBidimensional = new int[linhas][colunas];
        for (int i = 0; i < MatrizBidimensional.length; i++) {
            for (int j = 0; j < MatrizBidimensional[i].length; j++) {
                MatrizBidimensional[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < MatrizBidimensional.length; i++) {
            for (int j = 0; j < MatrizBidimensional[i].length; j++) {
                if (MatrizBidimensional[i][j] == valorMatriz) {
                    System.out.println("Posicao: " + i + "," + j);
                    if (j > 0 ) {
                        System.out.println("Posicao a esquerda: " + MatrizBidimensional[i][j - 1]);
                        
                    }
                    if(i > 0){
                         System.out.println("Posicao acima:  " + MatrizBidimensional[i - 1][j]);
                    }
                    if(j < MatrizBidimensional[i].length - 1){                                             
                        System.out.println("Posicao a direita: " + MatrizBidimensional[i][j + 1]);
                       
                    }
                      if(i < MatrizBidimensional.length - 1){                                             
                        System.out.println("Posicao abaixo: " + MatrizBidimensional[i + 1][j]);
                       
                    }
                    
                    
                   
                }

            }
        }
    }

}
