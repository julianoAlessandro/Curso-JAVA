
package com.mycompany.OrientacaoObjeto.Capítulo08;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;
    
    public void imprimir(){
        System.out.println("O nome do produto e: " + nome + " Sendo seu Preco: " + preco +"R$"+ " Sendo que foi comprado: " + quantidade );
    }
    public double valorTotal(){
        return Math.round(preco * quantidade);
    }
    public void adicionarProduto(int quantidade){
        this.quantidade = this.quantidade + quantidade;
        
    }
    public void removerProduto(int quantidade){
        this.quantidade = this.quantidade - quantidade;
        
    }
    public String toString(){
        return "Produto " + nome + "Preco: " + preco  + " R$ " + " Quantidade: " + quantidade + " ValorFinal: " + valorTotal();
    }
}
