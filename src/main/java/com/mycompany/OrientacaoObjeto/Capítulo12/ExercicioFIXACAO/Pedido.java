/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12.ExercicioFIXACAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private LocalDateTime MomentoEmissaoPedido;
    private StatusPedido Status;
    List<ItemPedido> ListaItensPedido = new ArrayList<>();

    public Pedido(LocalDateTime MomentoEmissaoPedido, StatusPedido Status) {
        this.MomentoEmissaoPedido = MomentoEmissaoPedido;
        this.Status = Status;

    }

    public LocalDateTime getMomentoEmissaoPedido() {
        return MomentoEmissaoPedido;
    }

    public void setMomentoEmissaoPedido(LocalDateTime MomentoEmissaoPedido) {
        this.MomentoEmissaoPedido = MomentoEmissaoPedido;
    }

    public StatusPedido getStatus() {
        return Status;
    }

    public void setStatus(StatusPedido Status) {
        this.Status = Status;
    }

    public List<ItemPedido> getListaItensPedido() {
        return ListaItensPedido;
    }

    public void adicionarItemPedido(ItemPedido item) {
        ListaItensPedido.add(item);

    }

    public void removerItemPedido(ItemPedido item) {
        ListaItensPedido.remove(item);

    }

    public double total() {
        double soma = 0;
        for (ItemPedido itensValor : ListaItensPedido) {
            soma = soma + itensValor.subTotal();

        }
        return soma;
    }

    public void ImprimirPedido() {
        System.out.println("Momento do Pedido:" + MomentoEmissaoPedido);
        System.out.println("Status do Pedido:" + Status);
    }
}
