/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoAbstracao;

public class PessoaFisica extends Pessoa {
 protected double gastoSaude;

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
     
     public PessoaFisica(){
         super();
     }

    public PessoaFisica(String nome, double rendaAnual,double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcularImposto() {
       double imposto;
       imposto = ( rendaAnual < 20000) ? rendaAnual * 0.15 : (rendaAnual * 0.25) - (gastoSaude * 0.50);
       return imposto;
       
    }

    
     
    
    
    
}
