
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas ?");
        int n = sc.nextInt();
        double soma = 0;
        double media = 0;
        int contador = 0;
        Pessoas[] ListaPessoas = new Pessoas[n];
        for(int i=1; i< ListaPessoas.length; i++){
            System.out.println("Dados da " + i   + " pessoa");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            ListaPessoas[i] = new Pessoas(nome,idade,altura);
        }
        for(int i = 1; i < ListaPessoas.length; i++){
            soma = soma  + ListaPessoas[i].getAltura();
            
        }
        media = soma / ListaPessoas.length;
        System.out.printf("Altura Media: %.2f ", media );
        for(int i = 1; i < ListaPessoas.length; i++){
            if(ListaPessoas[i].getIdade() < 16){
              System.out.println(ListaPessoas[i].getNome());
              contador = contador + 1;
            }
            
        }
        System.out.println("Pessoas com menos de 16 anos: " + n/contador * 100 + " % ");
        
        
    }
}
