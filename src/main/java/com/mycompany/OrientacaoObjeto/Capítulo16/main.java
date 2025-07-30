/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class main {

    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do Aluguel: ");
        System.out.print("Modelo do Carro: ");
        String modelo = sc.nextLine();
        Veiculo veiculo = new Veiculo(modelo);
        System.out.print("Retirada(dd/mm/yyyy hh: mm): ");
        LocalDateTime dataInicial = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno(dd/mm/yyyy hh: mm): ");
        LocalDateTime dataFinal = LocalDateTime.parse(sc.nextLine(), fmt);
        AluguelCarro agl = new AluguelCarro(dataInicial, dataFinal, veiculo);

        System.out.print("Entre com o preco por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Entre com o preco por dia: ");
        double precoPorDia = sc.nextDouble();
        System.out.print("Entre com o imposto:");
        double valor = sc.nextDouble();
        BrasilTaxaServico bts = new BrasilTaxaServico();
        ServicoAluguel ac = new ServicoAluguel(precoPorHora, precoPorDia, bts);
        System.out.println("FATURA: ");
        ac.processarVeiculo(agl);
        System.out.println("Pagamento Basico:  " + agl.getFaturamento().getPagamentoBasico());
        System.out.println("Imposto:  " + agl.getFaturamento().getImposto());
        System.out.println("Pagamento Total: " + agl.getFaturamento().gettotalPagamento());
        
        
        

    }
}
