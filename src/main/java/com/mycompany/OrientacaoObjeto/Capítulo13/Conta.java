/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13;

public class Conta {

    private int Numero;
    private String titular;
    protected double saldoConta;

    public Conta() {

    }

    public Conta(int Numero, String titular, double saldoConta) {
        this.Numero = Numero;
        this.titular = titular;
        this.saldoConta = saldoConta;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void sacar(double valor) {
        if (valor > saldoConta) {
            System.out.println("Não é possível sacar esse valor!");
        } else {
            saldoConta = saldoConta - valor;
        }

    }

    public void depositar(double valor) {
        saldoConta = saldoConta + valor;
        
    }
    public final void MultiplicarValor(double valor){
        saldoConta = saldoConta * valor;
    }
    

}
