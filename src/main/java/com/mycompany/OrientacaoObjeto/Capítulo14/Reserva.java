/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14;

import com.mycompany.OrientacaoObjeto.Capítulo14.Exception.DomainException;
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
        if (!dataSaida.after(dataEntrada)) {
            throw new DomainException("Erro: a data de entrada deve ser anterior à data de saída.");
        }
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

    public void atualizarData(Date dataEntrada, Date dataSaida) {
        Date now = new Date();

        if (dataEntrada.before(now) || dataSaida.before(now)) {
            throw new DomainException("Erro de atualização: as datas devem ser futuras.");
        }

        if (!dataSaida.after(dataEntrada)) {
            throw new DomainException("Erro: a data de entrada deve ser anterior à data de saída.");
        }

        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", data Saída: " + sdf.format(dataSaida) + ", data Entrada: " + sdf.format(dataEntrada)
                + ", " + DuracaoEstadia() + " Noites";
    }

}
