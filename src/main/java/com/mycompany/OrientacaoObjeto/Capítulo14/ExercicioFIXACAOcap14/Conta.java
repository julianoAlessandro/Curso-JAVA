/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14.ExercicioFIXACAOcap14;

import com.mycompany.OrientacaoObjeto.Capítulo14.Exception.DomainException;

/**
 *
 * @author Juliano
 */
public class Conta {

    private int numero;
    private String titularConta;
    private double saldo;
    private double limiteRetirada;

    public Conta() {

    }

    public Conta(int numero, String titularConta, double saldo, double limiteRetirada) {
        this.numero = numero;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.limiteRetirada = limiteRetirada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteRetirada() {
        return limiteRetirada;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        if (valor > limiteRetirada) {
            throw new DomainException("Valor a ser retirado é superior  ao limite de Saque da sua conta.");
        }
        saldo = saldo - valor;

        if (saldo <= 0) {
            throw new DomainException("Saldo insuficiente para ser retirado da conta");

        } 

    }

    @Override
    public String toString() {
        return "Conta: " + "numero=" + numero + ", titularConta=" + titularConta + ", saldo=" + saldo + ", limiteRetirada=" + limiteRetirada + '}';
    }

}
