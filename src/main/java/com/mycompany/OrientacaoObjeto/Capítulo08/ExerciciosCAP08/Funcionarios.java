
package com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08;

public class Funcionarios {
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public void imprimir(){
        System.out.println("Funcionario: " + nome + " Salario: " + salarioLiquido());
    }
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public void ModificarSalario(double porcentagem){
       this.salarioBruto += this.salarioBruto  * porcentagem / 100.0;
        
    }
    
}
