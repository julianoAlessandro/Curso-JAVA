/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main02 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int numeroQuarto = sc.nextInt();

        System.out.print("Data de Entrada: (dd/MM/yyyy): ");
        Date dataEntrada = sdf.parse(sc.next());

        System.out.print("Data de Saida: (dd/MM/yyyy): ");
        Date dataSaida = sdf.parse(sc.next());

        if (!dataSaida.after(dataEntrada)) {
            System.out.println("Erro: a data de entrada deve ser anterior à data de saída.");
        } else {
            Reserva re = new Reserva(numeroQuarto, dataEntrada, dataSaida);
            System.out.println("Reserva: " + re);
            System.out.println("");
            System.out.println("Entre com os dados da Atualização das datas: ");
            System.out.print("Data de Entrada: (dd/MM/yyyy): ");
            dataEntrada = sdf.parse(sc.next());
            System.out.print("Data de Saida: (dd/MM/yyyy): ");
            dataSaida = sdf.parse(sc.next());
            Date now = new Date();
            if (dataSaida.before(now) || dataEntrada.before(now)) {
                System.out.println("Erro de atualização: as datas para atualização devem ser datas futuras");
            } else if (!dataSaida.after(dataEntrada)) {
                System.out.println("Erro: a data de entrada deve ser anterior à data de saída.");

            } else {
                re.atualizarData(dataSaida, dataEntrada);
                System.out.println("Reserva: " + re);
            }

        }

        sc.close();
    }
}
