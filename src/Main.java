import br.com.dio.desadio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        // Criando instância de Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        // Criando instância de Workshop
        Workshop workshop = new Workshop();
        workshop.setTitulo("Workshop sobre Docker");
        workshop.setDescricao("Descrição workshop Docker");
        workshop.setDuracao(5);

        // Criando instância de Palestra
        Palestra palestra = new Palestra();
        palestra.setTitulo("Palestra sobre Kubernetes");
        palestra.setDescricao("Descrição palestra Kubernetes");
        palestra.setDuracao(3);

        // Criando instância de Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(workshop);
        bootcamp.getConteudos().add(palestra);

        // Criando e inscrevendo Devs
        Dev devRomario = new Dev();
        devRomario.setNome("Romario");
        devRomario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Romario: " + devRomario.getConteudoInscrito());

        devRomario.progredir();
        devRomario.progredir();
        System.out.println("Conteúdos Concluídos Romario: " + devRomario.getConteudosConcluidos());
        System.out.println("XP: " + devRomario.calcularXp());

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudoInscrito());

        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("Conteúdos Concluídos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularXp());
    }
}

