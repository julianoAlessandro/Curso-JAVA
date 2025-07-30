/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16;

import java.time.Duration;

/**
 *
 * @author Juliano
 */
public class ServicoAluguel {
    private double precoPorHora;
    private double precoPorDia;
    private ServicosImpostos imposto;
    
   

    public ServicoAluguel(double precoPorHora, double precoPorMes, ServicosImpostos imposto) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorMes;
        this.imposto = imposto;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getPrecoPorMes() {
        return precoPorDia;
    }

    public void setPrecoPorMes(double precoPorMes) {
        this.precoPorDia = precoPorMes;
    }

    public BrasilTaxaServico getImposto() {
        return imposto;
    }

    public void setImposto(BrasilTaxaServico imposto) {
        this.imposto = imposto;
    }
    
    public void processarVeiculo( AluguelCarro alugarVeiculo){
       double minutos =  Duration.between(alugarVeiculo.getDataInicial(),alugarVeiculo.getDataFinal()).toMinutes();
       double horas = minutos / 60;
       double pagamentoBasico;
       if(horas <= 12){
           pagamentoBasico = precoPorHora *  Math.ceil(horas);
       }
       else{
           pagamentoBasico = precoPorDia * Math.ceil(horas/24);
       }
        
        
        double impostoValor = this.imposto.imposto(pagamentoBasico);
        alugarVeiculo.setFaturamento(new Faturamento(pagamentoBasico,impostoValor));
    }
}
