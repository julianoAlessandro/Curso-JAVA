/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoAbstracao;

public class PessoaJuridica extends Pessoa {
    private int NumeroFuncionarios;
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int NumeroFuncionarios) {
        super(nome, rendaAnual);
        this.NumeroFuncionarios = NumeroFuncionarios;
        
    }

    @Override
    public double calcularImposto() {
     double imposto;
      imposto = (NumeroFuncionarios > 10 ) ? rendaAnual * 0.14 : rendaAnual * 0.16;
      return imposto;
    }
    
    
}
