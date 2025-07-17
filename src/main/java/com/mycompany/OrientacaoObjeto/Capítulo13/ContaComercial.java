/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13;

public class ContaComercial extends Conta {
    private double emprestimo;
    
    public ContaComercial(){
        super();
    }

    public ContaComercial(int Numero, String titular, double saldoConta, double emprestimo) {
        super(Numero, titular, saldoConta);
        this.emprestimo = emprestimo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    public void emprestimo(double valor){
        if(valor < emprestimo){
            saldoConta = valor - 10;
        }
    }
}
