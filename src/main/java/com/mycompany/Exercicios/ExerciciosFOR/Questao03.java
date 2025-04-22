package com.mycompany.Exercicios.ExerciciosFOR;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double valor1, valor2, valor3;

        for(int i = 1; i <= n; i++){
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();
            double r = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
            System.out.printf("%.1f", r);
        }
        sc.close();
    }
}
