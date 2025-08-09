/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juliano
 */
public class PrintService<T> {
//Espera que ele seja generico a lista ele so ganha uma tipagem no momento da instanciação
    List<T> listaNumeros = new ArrayList<>();

    public void adicionarValores(T valor){
        listaNumeros.add(valor);
    
}
    public void lerValores(){
        for(T x : listaNumeros){
            System.out.println(x);
            
        }
    }
    public void primeiroValor(){
        System.out.println("Primeiro valor: " + listaNumeros.get(0));
    }
}

    
    


