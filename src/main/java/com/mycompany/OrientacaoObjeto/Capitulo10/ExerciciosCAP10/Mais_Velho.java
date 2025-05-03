package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

import java.util.Scanner;

public class Mais_Velho {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar ?");
        int n = sc.nextInt();
        int v = 0;
        int maior = 0;
        int p = 0;
        String pessoa = null;
        Pessoa01[] ListaPessoa = new Pessoa01[n];
        for(int i = 0; i<n; i++){
             v = i +1;
             System.out.println("Dados da " + v + "a " + "pessoa");
             System.out.print("Nome: ");
             String nome = sc.next();
             System.out.print("Idade: ");
             int idade = sc.nextInt();
             ListaPessoa[i] = new Pessoa01(nome,idade);
             
        }
        for(int i = 0; i<n; i++){
            if(ListaPessoa[i].getIdade() > maior){
                maior = ListaPessoa[i].getIdade();
                pessoa = ListaPessoa[i].getNome();
                
              
            }
        }
        System.out.print("PESSOA MAIS VELHA: " + pessoa);
        
    }
}
