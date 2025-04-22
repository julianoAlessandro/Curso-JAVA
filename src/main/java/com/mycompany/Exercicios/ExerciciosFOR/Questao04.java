package com.mycompany.Exercicios.ExerciciosFOR;
import java.util.Scanner;

public class Questao04 {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Quantidade de numeros trabalhados");
        int x = sc.nextInt();
        double numerador, denominador,divisao;
        for(int i =1; i <= x; i++){
            numerador = sc.nextDouble();
            denominador = sc.nextDouble();
            if(denominador == 0){
                System.out.println("Divisao Impossivel");
            }
            divisao = numerador/denominador;
            System.out.printf("%.1f", divisao);
            
        }
    }
    
}
