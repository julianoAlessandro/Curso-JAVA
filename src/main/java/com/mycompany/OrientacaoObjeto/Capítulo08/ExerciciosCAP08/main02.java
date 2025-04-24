
package com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08;
import java.util.Scanner;
import com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08.Conversao;

public class main02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============CONVERSAO DE DOLAR======================");
        System.out.print("Informe o valor da cotação do dolar: ");
        Conversao.valorDolar = sc.nextDouble();
        System.out.print("Informe  quanto de Dolar voce tem: ");
        Conversao.DinheiroDolar = sc.nextDouble();
        System.out.println("Considerando o IOF de 6% seu dinheiro em reais ficaria: " + Conversao.retornar());
        System.out.println("=============PROGRAMA ENCERRADO======================");
        
        
    }
    
}
