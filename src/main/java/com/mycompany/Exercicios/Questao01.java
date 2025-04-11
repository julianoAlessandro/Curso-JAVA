
package com.mycompany.Exercicios;


public class Questao01 {       
    public static void main(String[] args){
        //Criacao das variaveis
        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int code = 5697979;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 56.4567897897684838856565656;
        
        //Configurando a saida do resultado
         System.out.println("Products:");
         System.out.printf("%s, wich price is R$ %.2f", product1,price1);
         System.out.println(" ");
         System.out.printf("%s wich price is R$ %.2f ",product2,price2);
         System.out.println(" ");
         System.out.printf("Record: %d years old, code %d and gender is %s",age,code,gender);
         System.out.println(" ");
         System.out.printf("Measure with eigth decimal place is % .8f", measure);
         System.out.println(" ");
         System.out.printf("With three decimal place is %.3f", measure);
         System.out.println(" ");
         System.out.printf("Measure with US point is %.2f",measure);
         
         
    }
}
