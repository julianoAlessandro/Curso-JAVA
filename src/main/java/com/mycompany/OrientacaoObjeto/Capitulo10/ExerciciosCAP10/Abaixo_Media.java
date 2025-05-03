
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Abaixo_Media {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double soma = 0;
        double media = 0.0;
        double[] VetorElementos = new double[n];
        for (int i = 0; i < VetorElementos.length; i ++){
            System.out.print("Digite um numero: ");
            VetorElementos[i] = sc.nextDouble();
            
        }
        for (int i = 0; i < VetorElementos.length; i ++){
             soma = soma + VetorElementos[i];
            
        }
        media = soma/VetorElementos.length;
        System.out.printf("MEDIA DO VETOR = %.3f ", media);
        System.out.println(" ");
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < VetorElementos.length; i ++){
            if(VetorElementos[i] < media){
                System.out.println(VetorElementos[i]);
            }
            
        }
        
        
        
        
    }
    
}
