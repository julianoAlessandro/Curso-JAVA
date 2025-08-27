/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Juliano
 */
public class CoringaTipo {

    public static void main(String[] args) {
        List<Integer> ListaInteiro = Arrays.asList(1, 2, 3, 4, 7);
        imprimirLista(ListaInteiro);
        List<String> Nomes = Arrays.asList("juliano","gustavo","jose","maria");
        imprimirLista(Nomes);

    }

    public static void imprimirLista(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

}
