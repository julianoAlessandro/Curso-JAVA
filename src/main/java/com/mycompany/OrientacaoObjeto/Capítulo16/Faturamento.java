/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16;

/**
 *
 * @author Juliano
 */
public class Faturamento {

    private double pagamentoBasico;
    private double imposto;

    public Faturamento() {

    }

    public Faturamento(double pagamentoBasico, double imposto) {
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    public double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double gettotalPagamento(){
        return getPagamentoBasico() +  getImposto();
    }


}
