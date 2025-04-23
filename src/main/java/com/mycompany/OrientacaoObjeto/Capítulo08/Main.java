
package com.mycompany.OrientacaoObjeto.Capítulo08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Produtos p = new Produtos();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================Bem vindo ao Sistema de Gestão de Produtos=================");
        System.out.print("Informe o produto a ser adicionado ao Estoque: ");
        p.nome = sc.next();
        System.out.print("Informe o preco do produto a ser adicionado: ");
        p.preco = sc.nextDouble();
        System.out.print("Informe  a quantidade desejada do produto: ");
        p.quantidade = sc.nextInt();
        System.out.println("====================RESULTADO=================================================");
        System.out.println(p);
        p.adicionarProduto(20);
        System.out.println(p);
        p.removerProduto(12);
        System.out.println(p);
        
        
        
       
    }
    
}
