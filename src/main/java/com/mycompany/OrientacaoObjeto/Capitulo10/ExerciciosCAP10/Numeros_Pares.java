
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Numeros_Pares {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int [] ListaNumeros = new int[n];
        for(int i=0; i <n; i ++){
            System.out.print("Digite um numero: ");
            ListaNumeros[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES: ");
        for(int i=0; i<n; i++){
            if(ListaNumeros[i] % 2 == 0){
                contador = contador + 1;
                System.out.print(ListaNumeros[i] + "  ");
                
            }
        }
        System.out.println(" ");
        System.out.println("QUANTIDADE DE PARES = " + contador);
    }
    
}
