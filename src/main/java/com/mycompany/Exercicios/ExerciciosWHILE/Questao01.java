package com.mycompany.Exercicios.ExerciciosWHILE;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        int senha =  2002;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a senha:");
        int digitacao = sc.nextInt();       
        while(digitacao != senha){
            System.out.println("Senha Invalida");
            digitacao = sc.nextInt();
            
        }
        System.out.println("Acesso Permitido");
    }
}
