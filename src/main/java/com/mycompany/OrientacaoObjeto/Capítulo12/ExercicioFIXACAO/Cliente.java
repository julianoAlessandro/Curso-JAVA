/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12.ExercicioFIXACAO;

import java.util.Date;

/**
 *
 * @author Juliano
 */
public class Cliente {
    private String nome;
    private String email;
    private Date DataAniversario;
    
    public Cliente(){
        
    }
    public Cliente(String nome, String email,Date DataAniversario){
        this.nome = nome;
        this.email = email;
        this.DataAniversario = DataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAniversario() {
        return DataAniversario;
    }

    public void setDataAniversario(Date DataAniversario) {
        this.DataAniversario = DataAniversario;
    }

    public void ImprimirDadosCliente(){
        System.out.println("Cliente: " + nome +  " " + DataAniversario + "- " +  email);
    }
    
}
