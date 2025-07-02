/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Entre com o nome do Departamento: ");
        String departamentoName = sc.nextLine();
        Departamentos dp = new Departamentos(departamentoName);
        System.out.println("Entre com a data de trabalho: ");
        System.out.print("Name:");
        String TrabalhoName = sc.nextLine();
        System.out.print("Nivel de Trabalho:");
        String TrabalhoNivel = sc.nextLine();
        System.out.print("Salário Base:");
        double TrabalhoSalario = sc.nextDouble();
        Trabalho trabalhador = new Trabalho(TrabalhoName, NiveisTrabalho.valueOf(TrabalhoNivel), TrabalhoSalario, dp);
        System.out.println("Quantos contratos para esse trabalahador ?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com o contrato #" + i + "data: ");
            System.out.print("Data (DD/MM/YYYY) ");
            Date contratoDate = sdf.parse(sc.next());
            System.out.println("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.println("Duração do contrato em horas: ");
            int horas = sc.nextInt();
            ContratosPorHora contrato = new ContratosPorHora(valorHora, horas, contratoDate);
            trabalhador.adicionadoContrato(contrato);

        }
        System.out.println();
        System.out.println("Entre com o ano e o mes para  calcular a receita(MM/YYYY): ");
        String MesAno = sc.next();
        int mes = Integer.parseInt(MesAno.substring(0, 2));
        int Year = Integer.parseInt(MesAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamentos());
        System.out.println("Departamento: " + trabalhador.getDepartamentos().getNome());
        System.out.println("Receita por:  " + MesAno + String.format("%.2f", trabalhador.receita(Year,mes)));

    }
}
