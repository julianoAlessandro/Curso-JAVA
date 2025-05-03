package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Media_Pares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media = 0;
        int contador = 0;
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double [] VetoresValores = new double[n];
        for(int i =0; i<n; i++){
            System.out.print("Digite um numero:");
            VetoresValores[i] = sc.nextDouble();
        }
        for(int i =0; i<n; i++){
           if(VetoresValores[i] % 2 == 0){
               soma = soma + VetoresValores[i];
               contador = contador + 1;
               
           }
           
        }
        media = soma /contador;
        if(contador == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else{
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
        
        
        
        
    }
}
