package com.mycompany.Exercicios;
import java.util.Scanner;
public class Questao05 {
    public static void main (String[] args){
        int number, valor;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        valor = sc.nextInt ();
        double salario = number * valor;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salario);
                
    }
    
}
