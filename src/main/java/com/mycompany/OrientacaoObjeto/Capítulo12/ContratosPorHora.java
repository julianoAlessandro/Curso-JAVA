/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

import java.util.Date;

/**
 *
 * @author Juliano
 */
public class ContratosPorHora {
    private double valorporHora;
    private Integer horas;
    private Date date;
    
    public ContratosPorHora(double valorHora, int horas1, Date contratoDate){
        
    }
    public ContratosPorHora(double valorporHora, Integer horas){
        this.valorporHora = valorporHora;
        this.horas = horas;
    }

    public double getValorporHora() {
        return valorporHora;
    }

    public void setValorporHora(double valorporHora) {
        this.valorporHora = valorporHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public double valorporHora(){
        return valorporHora * horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
