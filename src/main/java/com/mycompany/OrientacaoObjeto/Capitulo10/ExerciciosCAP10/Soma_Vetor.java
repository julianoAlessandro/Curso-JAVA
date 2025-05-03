
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double soma = 0;
        double media = 0;
        System.out.print("Quantos numeros voce deseja digitar ?");
        int n = sc.nextInt();
        double[] vetores = new double[n];
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetores[i] = sc.nextDouble();
            
        }
        System.out.print("VALORES =");
        for(int i=0; i<n;i++){
            System.out.print(vetores[i] + " ");
            
        }
        System.out.println(" ");
        for(int i=0; i<n;i++){
            soma = soma + vetores[i];
        }
        System.out.println("SOMA = " + soma);
        media = soma / vetores.length;
        System.out.printf("MEDIA = %.2f", media);
        
        
    }
    
}
