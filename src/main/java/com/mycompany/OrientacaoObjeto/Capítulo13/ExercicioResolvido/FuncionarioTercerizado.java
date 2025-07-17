/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioResolvido;

/**
 *
 * @author Juliano
 */
public class FuncionarioTercerizado extends Funcionario {
    private double custoAdicional;
    
    public FuncionarioTercerizado(){
        super();
    }

    public FuncionarioTercerizado(String nome, int horas, double ValorHora, double custoAdicional) {
        super(nome, horas, ValorHora);
        this.custoAdicional = custoAdicional;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        return (ValorHora * horas) + custoAdicional * 1.1;
    }
    
    
    
}
