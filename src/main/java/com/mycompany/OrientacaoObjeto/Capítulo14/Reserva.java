/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private int numeroQuarto;
    private Date dataEntrada;
    private Date dataSaida;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

    public Reserva() {

    }

    public Reserva(int numeroQuarto, Date dataEntrada, Date dataSaida) {
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public long DuracaoEstadia() {
        long diferenca = dataSaida.getTime() - dataEntrada.getTime(); //diferenca em milisegundos
        long diff = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
        return diff;

    }

    public String atualizarData(Date dataSaida, Date dataEntrada) {
        Date now = new Date();
        if (dataSaida.before(now) || dataEntrada.before(now)) {
            return"Erro de atualização: as datas para atualização devem ser datas futuras";
        }
        if (!dataSaida.after(dataEntrada)) {
            return "Erro: a data de entrada deve ser anterior à data de saída.";

        }
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        return null;

    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", data Saída: " + sdf.format(dataSaida) + ", data Entrada: " + sdf.format(dataEntrada)
                + ", " + DuracaoEstadia() + " Noites";
    }

}
