/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14.ExercicioFIXACAOcap14;

import com.mycompany.OrientacaoObjeto.Capítulo14.Exception.DomainException;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class main {

    public static void main(String[] args) {
        try {
            System.out.println("Entre com os dados da conta ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Numero da conta: ");
            int numero = sc.nextInt();
            sc.nextLine(); // Consumir o \n pendente
            System.out.print("Titular da conta: ");
            String titularConta = sc.nextLine(); // Captura o nome completo
            System.out.print("Saldo em conta:  ");
            double saldo = sc.nextDouble();
            System.out.print("Informe o limite a ser retirado da conta: ");
            double limiteRetirada = sc.nextDouble();
            Conta c1 = new Conta(numero, titularConta, saldo, limiteRetirada);
            System.out.print("Informe o valor a ser sacado da conta: ");
            double valor = sc.nextDouble();
            c1.retirar(valor);
            System.out.println("Novo saldo em conta: " + c1.getSaldo());

        } catch (DomainException e) {
            System.out.println("Erro:" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro:" + e.getMessage());
        }

    }
}
