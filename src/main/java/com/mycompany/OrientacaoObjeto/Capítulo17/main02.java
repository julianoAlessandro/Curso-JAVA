/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo17;

import java.util.ArrayList;
import java.util.List;

public class main02 {

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(10.2, 5.4));
        formas.add(new Circulo(10.0));

        //Criar Lista especifica
        List<Retangulo> retangulo = new ArrayList<>();
        retangulo.add(new Retangulo(12.2, 3.4));
        retangulo.add(new Retangulo(12.2, 5.4));

        System.out.println("A soma das areas das figuras é: " + somar(formas));
        System.out.println("A soma das areas das figuras é: " + somar(retangulo));

    }

    public static double somar(List<? extends Forma> lista) {
        double soma = 0;
        for (Forma f : lista) {
            soma += f.area(); // += em vez de apenas =, senão só pega a última área
        }
        return soma;
    }

}
