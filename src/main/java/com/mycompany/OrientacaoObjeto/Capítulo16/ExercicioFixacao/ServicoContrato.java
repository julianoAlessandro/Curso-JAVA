/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo16.ExercicioFixacao;

import java.time.LocalDate;

/**
 *
 * @author Juliano
 */
public class ServicoContrato {

    private MeiosPagamentoOnline pagamento;

    public ServicoContrato() {

    }

    public ServicoContrato(MeiosPagamentoOnline pagamento) {
        this.pagamento = pagamento;
    }

    public MeiosPagamentoOnline getPagamento() {
        return pagamento;
    }

    public void setPagamento(MeiosPagamentoOnline pagamento) {
        this.pagamento = pagamento;
    }

    public void ProcessarContratos(Contratos contratos, int mes) {
             double ValorporParcela = contratos.getValorTotal() / mes;
             for(int i = 0; i< mes; i++){
                 int n = i + 1;
                 LocalDate dataVencimento = contratos.getDataContrato().plusMonths(n);
                 double juros = pagamento.juros(ValorporParcela,n);
                 System.out.println("Valor com juros mensal: " + juros);
                 double valorParcela = pagamento.taxaPagamento(juros);
                 System.out.println("Vlaor com juros fixos de 2% " + valorParcela);
                 Parcelamento parcelas = new Parcelamento(dataVencimento,valorParcela);
                 contratos.getListParcelas().add(parcelas);
             
             }
             for(Parcelamento parcela : contratos.getListParcelas()){
                 System.out.println(parcela.getDataVencimento() + " - " + parcela.getValorParcela());
             }
               
             
             
    }

}
