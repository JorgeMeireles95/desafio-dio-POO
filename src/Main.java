import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);  // vale 80 de XP


        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição do curso javascript");
        curso2.setCargaHoraria(12); // vale 120 de XP



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now()); // vale 20 de Xp + 10 do valor padrão, dando o total de 30 XP



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GTP4");
        bootcamp.setDescricao("Bootcamp Desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);



        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp do Dev "+ devJorge.getNome());
        System.out.println("Conteúdos Inscritos" + devJorge.getConteudosInscritos());
        System.out.println();
        System.out.println("Usando o método progedir 3 vezes");
        devJorge.progredir();
        devJorge.progredir();
        devJorge.progredir();
        System.out.println();
        System.out.println("Depois de usar a o método");
        System.out.println("Conteúdos Inscritos" + devJorge.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devJorge.getConteudosConcluidos());
        System.out.println("total de XP:  " + devJorge.calcularXp());


        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        Dev devAntonio = new Dev();
        devAntonio.setNome("Antônio");
        System.out.println("Bootcamp do Dev"+ devAntonio.getNome());
        devAntonio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devAntonio.getConteudosInscritos());
        System.out.println();
        System.out.println("Usando o método progredir 1 vez");
        devAntonio.progredir();
        System.out.println();
        System.out.println("Depois do método ");
        System.out.println();
        System.out.println("Conteúdos Inscritos" + devAntonio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devAntonio.getConteudosConcluidos());
        System.out.println("Total de XP: " + devAntonio.calcularXp());




    }
}
