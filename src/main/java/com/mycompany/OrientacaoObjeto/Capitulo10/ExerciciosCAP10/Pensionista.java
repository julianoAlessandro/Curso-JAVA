package com.mycompany.OrientacaoObjeto.Capitulo10.ExerciciosCAP10;

public class Pensionista {
    private String nome;
    private String email;
   
    
    public Pensionista(String nome, String email){
        this.nome = nome;
        this.email = email;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
    @Override
public String toString() {
    return   nome + "," + email + "\n";

        
}

}
