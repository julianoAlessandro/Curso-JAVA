
package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar ? ");
        int num = sc.nextInt();
        
        int[] listNum = new int [num];
        for(int i=0; i<num; i++){
            System.out.print("Digite um numero: ");
            listNum[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for(int i = 0; i<num;i++ ){
            if(listNum[i] < 0){
                System.out.println(listNum[i]);
            }
        }
    }
    
}
