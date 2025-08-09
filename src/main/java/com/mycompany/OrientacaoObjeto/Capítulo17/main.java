/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo17;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class main {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja colocar na sua Lista ?");
        int valor = sc.nextInt();
        PrintService<Integer> pr = new  PrintService<>(); //GARANTE  que eu adicione apenas um tipo especifico na minha lista
        for( int i = 0; i < 3; i ++){
            int numero  = sc.nextInt();
            pr.adicionarValores(numero);
        }
       pr.lerValores();
       pr.primeiroValor();
    }
}
