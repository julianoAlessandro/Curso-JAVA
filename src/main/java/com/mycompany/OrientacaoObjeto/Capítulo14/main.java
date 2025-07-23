/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String VetorNome[] = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(VetorNome[posicao]);
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fora da Lista:" + e.getMessage());

        }
          catch (InputMismatchException e){
                System.out.println("Tipo incorreto para encontrar o valor");
              
              }
         System.out.println("Programa encerrado");
        }
       
       
    }


