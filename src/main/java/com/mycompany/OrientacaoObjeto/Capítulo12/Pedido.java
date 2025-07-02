/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

/**
 *
 * @author Juliano
 */
public class Pedido {

    private int id;
    private String nomeProduto;
    private StatusPedido status;
    

    public Pedido() {

    }

    public Pedido(int id, String nomeProduto, StatusPedido status) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", nomeProduto=" + nomeProduto + ", status=" + status + '}';
    }
    

}
