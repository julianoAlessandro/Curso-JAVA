package com.mycompany.Exercicios;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         double raio;
         double pi = 3.14159;
         raio = sc.nextDouble();
         double Area = pi * (raio * raio);
         System.out.printf("A= %.4f", Area);
         
    }
    
}
