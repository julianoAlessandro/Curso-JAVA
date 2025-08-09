/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16.ExercicioFixacao;

import java.util.Date;

public class PagamentoPayPal implements MeiosPagamentoOnline {

    @Override
    public double taxaPagamento(double quantidade) {
       double result = quantidade  * 2/100;
       return quantidade + result;
       
    }

    @Override
    public double juros(double quantidade, int mes) {
        double result = quantidade  *  mes/100;
        return result + quantidade;
        
    }
    
    
}
