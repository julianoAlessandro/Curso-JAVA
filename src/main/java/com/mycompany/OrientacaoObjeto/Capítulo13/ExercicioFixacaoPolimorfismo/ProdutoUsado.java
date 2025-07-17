/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo13.ExercicioFixacaoPolimorfismo;
 
import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date DataFabricacao;
    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, double preco,Date DataFabricacao ) {
        super(nome, preco);
        this.DataFabricacao = DataFabricacao;
    }

    public Date getDataFabricacao() {
        return DataFabricacao;
    }

    public void setDataFabricacao(Date DataFabricacao) {
        this.DataFabricacao = DataFabricacao;
    }

    @Override
    public String TagProduto() {
         return nome + " ( Usado )  " + " $ " + preco + " (Data da Fabrição: " + DataFabricacao + " )";
    }
    
    
}
