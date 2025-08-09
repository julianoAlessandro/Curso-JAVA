/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16.ExercicioFixacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do Contrato");

        System.out.print("Numero do contrato: ");
        int numeroContrato = sc.nextInt();
        sc.nextLine(); // <- limpa o buffer do enter após o nextInt()

        System.out.print("Data do Contrato (dd/MM/yyyy): ");
        String dataStr = sc.nextLine(); // agora vai ler corretamente
        LocalDate dataContrato = LocalDate.parse(dataStr, fmt);

        System.out.print("Valor do contrato: ");
        double valorTotal = sc.nextDouble();
        Contratos contratos = new Contratos(numeroContrato, dataContrato, valorTotal);
        System.out.println("Entre com o numero de parcelas: ");
        int mes = sc.nextInt();
        System.out.println("Parcelas: ");
        ServicoContrato servicocontrato = new ServicoContrato(new PagamentoPayPal());
        servicocontrato.ProcessarContratos(contratos, mes);

    }

}
