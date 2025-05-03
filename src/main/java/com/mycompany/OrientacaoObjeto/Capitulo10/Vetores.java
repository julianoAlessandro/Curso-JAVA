
package com.mycompany.OrientacaoObjeto.Capitulo10;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
     
        System.out.print("Informe a quantidade de peso que voce quer: ");
        int n = sc.nextInt(); //indice tamanho do vetor tem que ser SEMPRE INT!!!
        double[] vect = new double[n];
        for(int i=0; i<n;i++){
            System.out.print("Informe seu peso: ");
            vect[i] = sc.nextDouble();
            
        }
        double soma = 0;
        for (int i=0; i<n;i++){
            soma = soma + vect[i];
            System.out.println(soma);
        }
        System.out.printf("A soma total do peso é: %.2f ", soma);
        
    double media = soma/n;
    System.out.printf("Sua media é: %.1f/n", media);
    }
    
    
}
