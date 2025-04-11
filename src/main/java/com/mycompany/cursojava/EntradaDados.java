package com.mycompany.cursojava;

import java.util.Scanner;

public class EntradaDados {
  
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
        int x;
        double y;
        String nome;
        x = sc.nextInt(); //pegar valor interiro
        y = sc.nextDouble();
        nome = sc.next();
        System.out.printf("O valor de x e: %d sendo o valor de y: %.2f, e seu nome %s",x,y,nome);
        
    }
}
