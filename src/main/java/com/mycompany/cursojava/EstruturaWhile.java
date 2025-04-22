package com.mycompany.cursojava;
import java.util.Scanner;
public class EstruturaWhile {
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero de entrada: ");
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0){
            soma = soma + x;
            System.out.println(soma);
            x = sc.nextInt();
 
        }
    }
    
}
