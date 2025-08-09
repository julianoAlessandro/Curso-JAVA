/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16.ExercicioFixacao;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class mainTeste {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PagamentoPayPal pai = new PagamentoPayPal();
         System.out.println( "Reusltadooo: " + pai.juros(200, 1));
         double resultado = pai.juros(200, 1);
         System.out.println("Resultado02: " + pai.taxaPagamento(resultado));
     }
    
}
