/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12.ExercicioFIXACAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAniversario = null;
        System.out.println("<---------Entre com os dados do Cliente-------> ");
        System.out.print("Nome:");
        String nome = sc.nextLine();
        System.out.print("Email:");
        String email = sc.next();
        System.out.print("Data de Aniversário(DD/MM/YYYY):");
        String DataSTR = sc.next();
        dataAniversario = sdf.parse(DataSTR);
        Cliente c1 = new Cliente(nome, email, dataAniversario);
        System.out.println("<---------Entre com os dados do Pedido-------> ");
        System.out.print("Status:");
        String statusStr = sc.next().toUpperCase(); // Converte para maiúsculo para evitar erro de digitação
        StatusPedido status = StatusPedido.valueOf(statusStr);
        System.out.print("<------Quantos itens para esse pedido ?");
        int quantidadeItens = sc.nextInt();
        LocalDateTime momentoEmissao = LocalDateTime.now();
        Pedido pe = new Pedido(momentoEmissao, status);
        for (int i = 0; i < quantidadeItens; i++) {
            int v = i + 1;
            System.out.println("Entre com o #" + v + "Item:");
            System.out.print("Nome do Produto:");
            String produto = sc.next();
            System.out.print("Preco do Produto:");
            double preco = sc.nextDouble();
            System.out.print("Quantidade de Produto:");
            int quantidade = sc.nextInt();
            Produtos pr = new Produtos(produto, preco);
            ItemPedido p = new ItemPedido(quantidade, preco, pr);
            pe.adicionarItemPedido(p);

        }
        System.out.println("======PEDIDO SUMÁRIO============");
        pe.ImprimirPedido();
        c1.ImprimirDadosCliente();
        for(ItemPedido itemPedido : pe.ListaItensPedido){
            System.out.println("Itens do Pedido: ");
            System.out.println( itemPedido.getProduto().getNome() + "," + "R$" + itemPedido.getPreco() + "," + "Quantidade: " +
                    itemPedido.getQuantidade() + "," + "SubTotal; " + itemPedido.subTotal());
            
        }
        System.out.println("Valor Total: " +  pe.total());

    }
}
