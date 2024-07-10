package br.com.dio.desadio;

public class Workshop extends conteudo {
    private int duracao;

    @Override
    public double calcularXp() {
        return XP_PADRAO + duracao * 1.5;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
