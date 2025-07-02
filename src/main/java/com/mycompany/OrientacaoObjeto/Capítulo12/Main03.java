/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class Main03 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comentario c1 = new Comentario("Mano se Deus quiser sim kkkkkk");
        Comentario c2 = new Comentario("Fluminense vai ganhar do ALL-HILLAL KSSKSKS");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Fluminense x ALL-HILLAL", 22, "Voces acham que os times brasileiros vão conseguir avançar para semiFinal ?");
        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);
        System.out.println(p1);
    }

}
