package br.com.dio.desadio;

public class Curso extends conteudo {

    private int cargahoraria;
    public double calcularXp() {
        return XP_PADRAO + cargahoraria;
    }


    public Curso() {

    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
