package com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08;

public class Retangulo {
    public double altura;
    public double largura;
    
    public String area(){
       double resultado = altura * largura;
       return "AREA = " + resultado;
    }
    
    public String Perimetro(){
       double resultado = 2 * (altura + largura);
       return "PERIMETRO = " + resultado;
    }
    
    public String Diagonal(){
       double potencia = Math.pow(altura,2) +  Math.pow(largura,2);
       double diagonal = Math.sqrt(potencia);
       return "DIAGONAL = " + diagonal;
    }
    
    

    
    
}
