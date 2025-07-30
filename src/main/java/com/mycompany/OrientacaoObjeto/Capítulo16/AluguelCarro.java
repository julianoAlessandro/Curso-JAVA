/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16;

import java.time.LocalDateTime;

/**
 *
 * @author Juliano
 */
public class AluguelCarro {

    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private Veiculo veiculo;
    private Faturamento faturamento;

    public AluguelCarro(LocalDateTime dataInicial, LocalDateTime dataFinal, Veiculo veiculo, Faturamento faturamento) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.veiculo = veiculo;
        this.faturamento = faturamento;
    }

    public AluguelCarro(LocalDateTime dataInicial, LocalDateTime dataFinal, Veiculo veiculo) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.veiculo = veiculo;
       
    }

    public AluguelCarro() {

    }

    public Faturamento getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Faturamento faturamento) {
        this.faturamento = faturamento;
    }

    public LocalDateTime getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDateTime dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
