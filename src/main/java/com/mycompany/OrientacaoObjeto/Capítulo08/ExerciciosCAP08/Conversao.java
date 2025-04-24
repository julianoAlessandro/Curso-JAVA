package com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08;

public class Conversao {
    public static  double valorDolar;
    public static double DinheiroDolar;
    
    public static  double retornar(){
        double conversao =  valorDolar * DinheiroDolar;
        conversao = conversao * 1.06;
        return conversao;
        
    }
    

}
