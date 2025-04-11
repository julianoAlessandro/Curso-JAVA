

package com.mycompany.cursojava;

import java.util.Locale;

public class CursoJAVA {

    public static void main(String[] args) {
        int x = 24;
        int y = 30;
        int r = x + y;
        double valor = 2.5789877;
        System.out.println("O resultado e: " + r);
        System.out.printf("%.2f%n", valor); // definir casas decimais
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", valor); 
        
        //CONCATENAR STRINGS COM VARIAVEIS
        System.out.println("O resultado de: " + x + " + " + y + " igual = " + r);
        System.out.printf(" o resultado de %d + %d = %d", x,y,r);
    }
}
