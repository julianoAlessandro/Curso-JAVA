
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Maior_posicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double maior = 0;
        int p = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] ListaValores = new double[n];
        for (int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            ListaValores[i] = sc.nextDouble();
        }
        for(int i =0; i < ListaValores.length; i++){
            if(ListaValores[i]>= maior ){
                maior = ListaValores[i];
                p = i;
                
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + p);
        
    }
}
