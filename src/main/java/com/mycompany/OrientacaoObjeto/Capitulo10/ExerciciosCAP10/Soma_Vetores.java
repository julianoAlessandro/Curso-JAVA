
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Soma_Vetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada Vetor? ");
        int n = sc.nextInt();
        int[] VetorA =  new int[n];
        int[] VetorB = new int[n];
        int [] VetorC = new int[n];
        System.out.println("Digite os valores do VetorA:");
        for(int i =0; i<n; i++){
            VetorA[i]= sc.nextInt();
        }
        System.out.print("Digite os valores do VetorB: ");
        for(int i =0; i<n; i++){
            VetorB[i]= sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i<n; i++){
            VetorC[i]= VetorA[i] + VetorB[i];
            System.out.println(VetorC[i]);
          
        }
    }
    
}
