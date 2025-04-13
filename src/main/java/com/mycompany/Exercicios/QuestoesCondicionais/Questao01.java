
package com.mycompany.Exercicios.QuestoesCondicionais;
import java.util.Scanner;

public class Questao01 {
    public static void main (String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Informe um numero: ");
        numero = sc.nextInt();
        if (numero > 0){
            System.out.println("NÃO NEGATIVO");
            
        }
        else{
            System.out.println("NEGATIVO");
        }
    }
    
}
