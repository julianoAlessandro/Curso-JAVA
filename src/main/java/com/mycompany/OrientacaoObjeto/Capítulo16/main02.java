/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16;

import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class main02 {

    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o preco por hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Entre com o preco por dia: ");
        double precoPorDia = sc.nextDouble();
        System.out.print("Entre com o imposto:");
        double valor = sc.nextDouble();
        BrasilTaxaServico bts = new BrasilTaxaServico();
        ServicoAluguel ac = new ServicoAluguel(precoPorHora, precoPorDia, bts);
        ac.processarVeiculo(null);

    }

}
