/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16.ExercicioFixacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juliano
 */
public class Contratos {

    private int numeroContrato;
    private LocalDate dataContrato;
    private double valorTotal;
    private List<Parcelamento> ListParcelas;

    public Contratos() {

    }

    public Contratos(int numeroContrato, LocalDate dataContrato, double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
        this.ListParcelas = new ArrayList<>();
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelamento> getListParcelas() {
        return ListParcelas;
    }

   

}
