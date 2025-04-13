package com.mycompany.Exercicios.QuestoesCondicionais;
import java.util.Scanner;
public class Questao05 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("=======BEM VINDO AO MENU DE ESCOLHAS =======================");
    System.out.println("CODIGO: 1 Cachorro Quente Preço R$ 4.OO");
    System.out.println("CODIGO: 2 X-salada Preço R$ 4.5O");
    System.out.println("CODIGO: 3 X-Bacon Preço R$ 5.OO");
    System.out.println("CODIGO: 4 Torrada Simples Preço R$ 2.OO");
    System.out.println("CODIGO: 5 Refrigerante Preço R$ 1.5O");
    System.out.println("==============================================================");
    double r;
    int opcao;
    opcao = sc.nextInt();
    int quantidade;
    System.out.print("Escolha a quantidade do item: ");
    quantidade = sc.nextInt();
    
     switch(opcao){
        case 1:
           r = 4.00 * quantidade;
           System.out.printf("Sua compra ficou no valor de R$ %.2f", r);
           break;
        case 2:
           r = 4.50 * quantidade;
           System.out.printf("Sua compra ficou no valor de R$ %.2f", r);
           break;
        case 3:
           r = 5.00 * quantidade;
           System.out.printf("Sua compra ficou no valor de R$ %.2f", r);
           break;
           
        case 4:
           r = 2.00 * quantidade;
           System.out.printf("Sua compra ficou no valor de R$ %.2f", r);
           break;
        case 5:
           r = 1.50 * quantidade;
           System.out.printf("Sua compra ficou no valor de R$ %.2f", r);
           break;
        default:
           System.out.println("Opção inválida");
                        
    }     
            
        
        
    }
    
    }

