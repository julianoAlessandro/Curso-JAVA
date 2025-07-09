/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12.ExercicioFIXACAO;

public class ItemPedido {
    private int quantidade;
    private double preco;
    private Produtos produto;
    public ItemPedido(int quantidade, double preco, Produtos produto){
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double subTotal(){
        return this.preco * this.quantidade;
    }

    
    
}
