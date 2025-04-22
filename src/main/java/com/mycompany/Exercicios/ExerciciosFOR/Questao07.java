package com.mycompany.Exercicios.ExerciciosFOR;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        int x = sc.nextInt();
        for( int i=1; i <=x; i++){
           n1 = (int) Math.pow(i, 2);
           n2 = (int) Math.pow(i, 3);
           System.out.println(i +" "+ " " + n1 + " "+ n2);
        

        }
    }
    
}
