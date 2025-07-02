/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Juliano
 */
public class Trabalho {

    private String nome;
    private NiveisTrabalho level;
    private double salarioBase;
    private Departamentos departamentos; // composição associação de objetos(1:1)
    private List<ContratosPorHora> contratos = new ArrayList<>(); // composicao d objeto (1:n)

    public Trabalho() {

    }

    public Trabalho(String nome, NiveisTrabalho level, double salarioBase, Departamentos departamentos) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamentos = departamentos;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NiveisTrabalho getLevel() {
        return level;
    }

    public void setLevel(NiveisTrabalho level) {
        this.level = level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public List getContratos() {
        return contratos;
    }

    

    public void adicionadoContrato(ContratosPorHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratosPorHora contrato) {
        contratos.remove(contrato);
    }
    public double receita(int ano, int mes){
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(ContratosPorHora  contrato : contratos){
            cal.setTime(contrato.getDate());
            int contratoAno = cal.get(Calendar.YEAR);
            int contratoMes =  1 + cal.get(Calendar.MONTH);
            if(contratoAno == ano && contratoMes == mes){
                sum += contrato.valorporHora();
            }
            
        }
     return sum;
    }
}
