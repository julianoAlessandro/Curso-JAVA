package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;
import java.util.Scanner;
import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prox = 0;
        double anterior = 0;
        System.out.print("Quantos quartos serão reservados?");
        int quantidadeReserva = sc.nextInt();
        Pensionista[] reserva = new Pensionista[10];
        for (int i = 0; i <quantidadeReserva; i++) {
            int n = i + 1;
            System.out.println("Alugueis #" + n);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Email: ");
            sc.nextLine();
            String email = sc.next();
            System.out.print("Quarto: ");
            int reservaQuarto = sc.nextInt();
            reserva[reservaQuarto] = new Pensionista(nome, email); // quando eu  peguei o quarto que a pessoa vai ficar eu estou guardando na memoria aquela posicao para ser a posicao do meu objeto

        }
        System.out.println("Quartos reservados: ");
        for (int i = 0; i <reserva.length; i++) {
            if (reserva[i] != null) {
                System.out.println( i + ":" + reserva[i]);
            } else {
                continue; 
            }
        }
        
      
    }

}
