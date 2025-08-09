/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16.ExercicioFixacao;

import java.util.Date;

/**
 *
 * @author Juliano
 */
public interface MeiosPagamentoOnline {
    public double taxaPagamento(double quantidade);
    public double juros(double quantidade, int mes);
}
