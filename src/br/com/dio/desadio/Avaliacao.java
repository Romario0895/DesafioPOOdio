package br.com.dio.desadio;

public class Avaliacao {
    private Dev dev;
    private final  conteudo conteudo;
    private int nota;

    public Avaliacao(Dev dev, conteudo conteudo, int nota) {
        this.dev = dev;
        this.conteudo = conteudo;
        this.nota = nota;
    }

    public Dev getDev() {
        return dev;
    }

    public conteudo getConteudo() {
        return conteudo;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "dev=" + dev.getNome() +
                ", conteudo=" + conteudo.getTitulo() +
                ", nota=" + nota +
                '}';
    }
}

