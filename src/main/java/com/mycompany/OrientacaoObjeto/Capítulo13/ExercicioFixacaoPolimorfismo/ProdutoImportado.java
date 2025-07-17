/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoPolimorfismo;

/**
 *
 * @author Juliano
 */
public class ProdutoImportado extends Produto {
    private double taxaAlfandegaria;
    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, double preco, double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    @Override
    public String TagProduto() {
        return  nome + " $ " + ValorTotal() + "(Custom fee:" + "$ " +  taxaAlfandegaria + ")"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public double ValorTotal(){
        return preco + taxaAlfandegaria;
    }

   
    
    
    
}
