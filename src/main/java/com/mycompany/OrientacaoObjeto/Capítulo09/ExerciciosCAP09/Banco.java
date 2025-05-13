package com.mycompany.OrientacaoObjeto.Capítulo09.ExerciciosCAP09;

import java.util.Scanner;

public class Banco {
    // cosntrutores privados para proteger e gerenciar os dados da minha classe
    private int numero;
    private String Conta;
    private double valor;
    
    // vou ter 2 construtores na minha classe um construtor que vai receber 2 parametros e outros que recebera 3 pois o valor padrao de um dos construtores sera 0 entao nao precisa instancair ele
    // cosntrutor com 3 parametros, quando preciso definir um valor para minha conta inicial
    public Banco( int numero, String Conta, double valor){
        this.numero = numero;
        this.Conta = Conta;
        this.valor =valor;
        
    }
    //Construtor com 2 parametros para quando valor inicial = 0
    public Banco( int numero, String Conta){
        this.numero = numero;
        this.Conta = Conta;
       
        
    }
   
    public int getNumero() {
        return numero; // nao vou ter setNumero pois nao posso alterar  o valor do numero da conta
    }

   

    public String getConta() {
        return Conta;
    }

    public void setConta(String Conta) {
        this.Conta = Conta;
    }

    public double getValor(){
        return valor; // eu so posso mudar o valor atraves de Depositar/Sacar
    }
   
   
    
    public void Impressao(){
        System.out.println("Dados da Conta:");
        System.out.println("Numero da conta: " + numero + " Conta: " + Conta +" Saldo:  $ " + valor);
    }
    public double Depositar(double deposito){
        this.valor =  this.valor + deposito;
        return valor;
    }
    public double Sacar(double deposito){
        this.valor =  this.valor - deposito - 5;
        return valor;
    }
}
