package com.mycompany.Exercicios.QuestoesCondicionais;
import java.util.Scanner;

public class Questao03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A > B && A % B == 0){
            System.out.println("Sao Multiplos");
            
        }
        else if (A > B && A % B != 0){
            System.out.println("Nao sao Multiplos");
        }
        else if (B > A && B % A == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao Sao Multiplos");
        }
    }
    
}
