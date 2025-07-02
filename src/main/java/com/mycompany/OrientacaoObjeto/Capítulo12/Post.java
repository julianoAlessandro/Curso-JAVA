/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OrientacaoObjeto.Capítulo12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date DataComentario;
    private String TituloComentario;
    private int Likes;
    private String conteudo;
    private List<Comentario> ListComentario = new ArrayList<>();

    public Post() {

    }

    public Post(Date DataComentario, String TituloComentario, int Likes, String conteudo) {
        this.DataComentario = DataComentario;
        this.TituloComentario = TituloComentario;
        this.Likes = Likes;
        this.conteudo = conteudo;
    }

    public Date getDataComentario() {
        return DataComentario;
    }

    public void setDataComentario(Date DataComentario) {
        this.DataComentario = DataComentario;
    }

    public String getTituloComentario() {
        return TituloComentario;
    }

    public void setTituloComentario(String TituloComentario) {
        this.TituloComentario = TituloComentario;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public List<Comentario> getListComentario() {
        return ListComentario;
    }

    public void adicionarComentario(Comentario comentario) {
        ListComentario.add(comentario);
    }

    public void removerComentario(Comentario comentario) {
        ListComentario.add(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TituloComentario + "\n");
        sb.append(Likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(DataComentario) + "\n");
        sb.append(conteudo + "\n");
        sb.append("COMENTÁRIOS: " + "\n");
        for(Comentario c : ListComentario){
            sb.append(c.getComentario() + "\n");
        }
       return sb.toString();
    }
}
