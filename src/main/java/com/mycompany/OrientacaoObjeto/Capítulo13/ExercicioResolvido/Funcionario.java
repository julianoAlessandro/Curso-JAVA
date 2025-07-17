/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioResolvido;

public class Funcionario {
    private String nome;
    protected int horas;
    protected double ValorHora;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, int horas, double ValorHora) {
        this.nome = nome;
        this.horas = horas;
        this.ValorHora = ValorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }
    
    public double pagamento(){
        return horas * ValorHora;
    }
    
}
