/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Produto> ListProdutos = new ArrayList<>();
        System.out.print("Entre com o numero de Produtos que deseja cadastrar: ");
        int NumeroProdutosCadastrados = sc.nextInt();
        for (int i = 0; i < NumeroProdutosCadastrados; i++) {
            int n = i + 1;
            System.out.println("Dados do " + n + "#" + "Produto: ");
            System.out.print("Seu produto é Comum/Usado/Importado ? [c/u/i] ");
            String resposta = sc.next();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            if (resposta.equalsIgnoreCase("u")) {
                System.out.print("Data Fabricacao: (DD/MM/YYYY): ");
                String DataFabricacao = sc.next();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                Produto produto = new ProdutoUsado(nome, preco, sdf.parse(DataFabricacao));
                ListProdutos.add(produto);

            }
            else if (resposta.equalsIgnoreCase("i")) {
                System.out.print("Custo Alfandegario: ");
                double taxaAlfandegaria = sc.nextDouble();
                Produto produto = new ProdutoImportado(nome, preco, taxaAlfandegaria);
                ListProdutos.add(produto);

            } else if (resposta.equalsIgnoreCase("c")) {
                Produto produto = new Produto(nome, preco);
                ListProdutos.add(produto);
            }

        }
        System.out.println(" ");
        System.out.println("Valor das Tags dos Produtos: ");
        for(Produto p : ListProdutos){
            System.out.println(p.TagProduto());
        }

    }

}
