/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo14;

import com.mycompany.OrientacaoObjeto.Capítulo14.Exception.DomainException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();

            System.out.print("Data de Entrada: (dd/MM/yyyy): ");
            Date dataEntrada = sdf.parse(sc.next());

            System.out.print("Data de Saida: (dd/MM/yyyy): ");
            Date dataSaida = sdf.parse(sc.next());

            Reserva re = new Reserva(numeroQuarto, dataEntrada, dataSaida);
            System.out.println("Reserva: " + re);
            System.out.println("");
            System.out.println("Entre com os dados da Atualização das datas: ");
            System.out.print("Data de Entrada: (dd/MM/yyyy): ");
            dataEntrada = sdf.parse(sc.next());
            System.out.print("Data de Saida: (dd/MM/yyyy): ");
            dataSaida = sdf.parse(sc.next());
            re.atualizarData(dataEntrada,dataSaida);
            System.out.println("Reserva: " + re);
        } catch (ParseException e) {
            System.out.println("Usuario digitou uma data inválida");

        } catch (DomainException e) {
            System.out.println("Mensagem error: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
    }
}
