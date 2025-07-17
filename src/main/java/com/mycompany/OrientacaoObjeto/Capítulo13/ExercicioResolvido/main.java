/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioResolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        List<Funcionario> ListaFuncionario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o  numero de funcionarios: ");
        int funcionarios = sc.nextInt();
        for (int i = 0; i < funcionarios; i++) {
            int n = i + 1;
            System.out.println("Dados do" + "#" + n + "Funcionario:");
            System.out.print("Funcionario Tercerizado ? [s/n]");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Nome:");
                String nome = sc.next();
                System.out.print("Horas:");
                int horas = sc.nextInt();
                System.out.print("Valor por Hora:");
                double ValorHora = sc.nextDouble();
                System.out.print("Custo Adicional:");
                double custoAdicional = sc.nextDouble();
                Funcionario f1  = new FuncionarioTercerizado(nome,horas,ValorHora,custoAdicional);
                ListaFuncionario.add(f1);

            } else {
                System.out.print("Nome:");
                String nome = sc.next();
                System.out.print("Horas:");
                int horas = sc.nextInt();
                System.out.print("Valor por Hora:");
                double ValorHora = sc.nextDouble();
                Funcionario f1  = new Funcionario(nome,horas,ValorHora);
                ListaFuncionario.add(f1);

            }
        }
        System.out.println("Pagamentos:");
        for(Funcionario funcionario : ListaFuncionario){
            System.out.println(funcionario.getNome() + "-" + "$ " + funcionario.pagamento());
            
        }

    }
}
