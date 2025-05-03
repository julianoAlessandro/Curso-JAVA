
package com.mycompany.OrientacaoObjeto.Capítulo09;
import com.mycompany.OrientacaoObjeto.Capítulo09.Produtos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o nome do Produto: ");
    String nome = sc.next();
    System.out.println("Informe o preco do produto: ");
    double preco = sc.nextDouble();
    System.out.println("Informe a quantidade do produto a ser comprado: ");
    int quantidade = sc.nextInt();
    Produtos p = new Produtos(nome,preco,quantidade);
    System.out.println(p);
    System.out.println("===========PROGRAMA ENCERRADO====================");
    Produtos g = new Produtos("tv",400); // construtor com apenas 2 parametros
    Produtos gp = new Produtos(); //consturtor padrão
    
    

    }
    
    
}
