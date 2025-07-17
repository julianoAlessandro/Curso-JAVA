/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13;

/**
 *
 * @author Juliano
 */
public final  class ContaPoupanca extends Conta {
    private double taxaJuros;
    public ContaPoupanca(){
        
    }

    public ContaPoupanca(int Numero, String titular, double saldoConta,double taxaJuros) {
        super(Numero, titular, saldoConta);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        saldoConta = saldoConta - valor - 5;
        
    }
    
    
}
