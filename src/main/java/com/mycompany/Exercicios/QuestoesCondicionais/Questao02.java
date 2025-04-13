package com.mycompany.Exercicios.QuestoesCondicionais;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero para verficar se é PAR/IMPAR: ");
        numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        
    }
    
}
