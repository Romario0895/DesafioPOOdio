package br.com.dio.desadio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private Set<Bootcamp> bootcampsInscritos = new HashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        this.bootcampsInscritos.add(bootcamp);
    }

    public void progredir() {
        Optional<conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularXp() {
        return this.conteudosConcluidos.stream()
                .mapToDouble(conteudo::calcularXp)
                .sum();
    }

    public void avaliarConteudo(conteudo conteudo, int nota) {
        if (this.conteudosConcluidos.contains(conteudo)) {
            Avaliacao avaliacao = new Avaliacao(this, conteudo, nota);
            this.avaliacoes.add(avaliacao);
        } else {
            System.err.println("Você não concluiu este conteúdo.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudoInscrito, dev.conteudoInscrito) &&
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudosConcluidos);
    }
}
