package com.mycompany.Exercicios.ExerciciosWHILE;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======ESCOLHA SEU PRODUTO FAVORITO==========");
        System.out.println("Álcool codigo: 1 ");
        System.out.println("Gasolina codigo: 2 ");
        System.out.println("Diesel  codigo: 3 ");
        System.out.println("encerrar pesquisa codigo: 4 ");
        System.out.print("Escolha um produto de sua preferencia: ");
        int codigo = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        while(codigo != 4){
            if (codigo == 1){
                codigo = sc.nextInt();
                x = x + 1;
               
            }
            else if (codigo == 2){
                codigo = sc.nextInt();
                y = y + 1;
              
            }
            else if (codigo == 3){
                codigo = sc.nextInt();
                z = z + 1;
               
            }
            else{
                codigo = sc.nextInt();
                System.out.println(" ");
                
            }
           
           
            
        }
        System.out.println("Programa encerrado obrigado pela participacao");
        System.out.println("Alcool: " + x);
        System.out.println("Gasolina: " + y); 
        System.out.println("Diesel: " + z); 
       
        
    }
    
}
