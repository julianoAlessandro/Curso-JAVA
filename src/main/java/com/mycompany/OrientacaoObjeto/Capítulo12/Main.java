/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

/**
 *
 * @author Juliano
 */
public class Main {
    public static void main(String[] args){
        Pedido p1 = new Pedido(02,"Pipoca",StatusPedido.AGUARDANDO);
        System.out.println(p1.toString());
        StatusPedido p2 = StatusPedido.valueOf("AGUARDANDO");
        System.out.println(p2);
    }
}
