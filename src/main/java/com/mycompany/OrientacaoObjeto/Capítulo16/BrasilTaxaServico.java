/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16;

public class BrasilTaxaServico {

    public double imposto(double valor) {
        if(valor <= 100){
            return valor * 0.2;
        }
        else{
            return valor * 0.15;
        }

    }
}
