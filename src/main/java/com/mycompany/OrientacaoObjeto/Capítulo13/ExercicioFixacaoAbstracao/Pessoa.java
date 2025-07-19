/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoAbstracao;

public abstract class Pessoa {
    private String nome;
    protected double rendaAnual;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    
    public abstract double calcularImposto();
    //método somente com assinatura sem corpo
    
}
