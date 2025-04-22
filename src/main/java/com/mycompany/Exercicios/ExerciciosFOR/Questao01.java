package com.mycompany.Exercicios.ExerciciosFOR;

import java.util.Scanner;

/*
 * Este programa realiza o seguinte:
 *
 * 1. Lê um valor inteiro X, onde 1 <= X <= 1000.
 * 2. Em seguida, imprime todos os números ímpares de 1 até X, um por linha.
 * 3. Caso o valor X também seja ímpar, ele será incluído na saída.
 */

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
