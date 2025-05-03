
package com.mycompany.OrientacaoObjeto.Capítulo09;

public class Produtos {
    private String nome;
    private double preco;
    public int quantidade;
    
    //Construtor padrão so que agora os valores sao padroes null,0,0
    public Produtos(){
        
    }
    
    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    //Sobrecarga de Construtor, cosnturtor com o mesmo nome porem com parametros diferentes  
    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    //gerando gett e setters
    public String getName(){
        return nome;
    }
    public void setName(String nome){
        this.nome = nome;
        
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
        
    }
    
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
        return " Produto " + nome + " Preco: " + preco  + " R$ " + " Quantidade: " + quantidade + " ValorFinal: " + valorTotal();
    }
}
