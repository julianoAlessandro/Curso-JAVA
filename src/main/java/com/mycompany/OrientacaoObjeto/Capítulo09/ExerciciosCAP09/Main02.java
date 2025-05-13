package com.mycompany.OrientacaoObjeto.Capítulo09.ExerciciosCAP09;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Banco cliente01; //criacao de uma variavel global do tipo da classe ou seja uma variavel de referencia
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero da conta:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre com o nome da sua conta: ");
        String Conta = sc.next();
        System.out.print("Existe um deposito inicial?[y/n] ");
        String linha = sc.next();
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Entre com o valor Inicial:");
            double valor = sc.nextDouble();
            cliente01 = new Banco(numero,Conta,valor);
           

        }
        else{
           cliente01 = new Banco(numero,Conta);
            
        }
        cliente01.Impressao();
        System.out.print("Entre com um deposito: ");
        double deposito = sc.nextDouble();
        cliente01.Depositar(deposito);
        cliente01.Impressao();
        System.out.print("Quanto gostaria de sacar da conta:");
        cliente01.Sacar(sc.nextDouble());
        cliente01.Impressao();

    }

}
