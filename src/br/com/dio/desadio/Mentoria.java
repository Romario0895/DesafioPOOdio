package br.com.dio.desadio;

import java.time.LocalDate;

public class Mentoria {
   private String titulo;
    private String descricao;
   private LocalDate data;

    public Mentoria() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDwscricao() {
        return descricao;
    }

    public void setDwscricao(String dwscricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
