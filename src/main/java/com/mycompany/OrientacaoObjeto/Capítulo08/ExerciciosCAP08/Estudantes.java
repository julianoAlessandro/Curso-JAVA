
package com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08;

public class Estudantes {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    double media;
    public double notafinal(){
             return media;
    }
    public String situacao(){
        if ( media > 70.0){
            return "APROVADO";
        }
        else{
            return "REPROVADO";
        }
    }
}
