package br.com.dio.desadio;

import java.io.File;

public abstract class conteudo {

  protected static final  double XP_PADRAO = 10d;
     private String titulo;
     private String descricao;

     public abstract double calcularXp();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
