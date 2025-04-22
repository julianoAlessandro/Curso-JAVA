package com.mycompany.Exercicios.ExerciciosFOR;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de valores a ser lidos: ");
        int n = sc.nextInt();
        int x  = 0;
        int y = 0;
        for (int i=0; i < n; i++){
           int valor = sc.nextInt();
           if(valor >=10 && valor <= 20){
              x = x + 1;
           }
           else{
              y = y +1;
           }
            
            
        }
     System.out.printf("%d IN\n", x);
     System.out.printf("%d OUT\n", y);

    }
    
}
