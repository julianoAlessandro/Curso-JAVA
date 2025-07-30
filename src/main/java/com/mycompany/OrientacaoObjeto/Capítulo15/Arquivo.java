package com.mycompany.OrientacaoObjeto.Capítulo15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Juliano\\Documents\\Dados\\Teste2607.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }

        }
    }
}
