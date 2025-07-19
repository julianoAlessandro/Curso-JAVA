/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoAbstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> listPessoa = new ArrayList<>();
        System.out.print("Entre com o numero de contribuintes: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            int n = i + 1;
            System.out.println("Dados do " + n + "# " + "Contribuinte: ");
            System.out.print("Sua conta sera Fisica ou Juridica ? [f/j] ");
            String resposta = sc.next();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            if (resposta.equalsIgnoreCase("f")) {
                System.out.print("Despesas com Saude: ");
                double gastoSaude = sc.nextDouble();
                Pessoa p1 = new PessoaFisica(nome, rendaAnual, gastoSaude);
                listPessoa.add(p1);
            } else {
                System.out.print("Numero de funcionarios: ");
                int NumeroFuncionarios = sc.nextInt();
                Pessoa p1 = new PessoaJuridica(nome, rendaAnual, NumeroFuncionarios);
                listPessoa.add(p1);
            }

        }
        
        System.out.println("Impostos Pagos: ");
         double soma = 0;
        for(Pessoa p : listPessoa){
           
            System.out.println(p.getNome() + ":" + " $ " +  String.format("%.2f", p.calcularImposto()));
            soma = soma + p.calcularImposto();
        }
        System.out.println("Total de imposto: " + soma);
    }
}
