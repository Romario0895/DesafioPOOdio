import br.com.dio.desadio.Bootcamp;
import br.com.dio.desadio.Curso;
import br.com.dio.desadio.Dev;
import br.com.dio.desadio.Mentoria;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //+System.out.println(curso1);
        //System.out.println(curso2);//
       // System.out.println(mentoria);//
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java deceloper");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRomario = new Dev();
        devRomario.setNome("Romario");
        devRomario.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito" +devRomario.getConteudoInscrito());

        devRomario.proguedir();
        devRomario.proguedir();

        System.out.println("Conteudos concluido" +devRomario.getConteudosConcluidos());
        System.out.println("Xp" +devRomario.calcularXp());
        System.out.println("----------");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscrito" +devMarcos.getConteudoInscrito());
        devMarcos.proguedir();
        devMarcos.proguedir();
        devMarcos.proguedir();

        System.out.println("Conteudos concluidos" +devMarcos.getConteudosConcluidos());
        System.out.println("Xp" +devMarcos.calcularXp());
        System.out.println("----");
    }

}