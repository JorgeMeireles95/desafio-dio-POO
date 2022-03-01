import br.com.dio.desafio.dominio.*;

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



        Bootcamp bootcamp = new Bootcamp("GTP4","Bootcamp Desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);



        //Obriga a construtor  a receber todas as informações no momento da criação
        //A instância só será criada se o CPF for válido

        Dev devMeireles = new Dev("Jorge","78965412316","Rio de Janeiro","Nova Iguaçu","Brasil");
        Dev devSouza= new Dev("Antônio","14965445687","São Paulo","Osasco","Brasil");


        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        devSouza.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" +  devSouza.getConteudosInscritos());
        System.out.println();
        System.out.println("Usando o método progredir 2 vez");
        devSouza.progredir();
        devSouza.progredir();
        System.out.println();
        System.out.println("Depois do método ");
        System.out.println();
        System.out.println("Conteúdos Inscritos" +   devSouza.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" +  devSouza.getConteudosConcluidos());
        System.out.println("Total de XP: " +  devSouza.calcularXp());


        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        devMeireles.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" +   devMeireles.getConteudosInscritos());
        System.out.println();
        System.out.println("Usando o método progredir 1 vez");
        devMeireles.progredir();
        System.out.println();
        System.out.println("Depois do método ");
        System.out.println();
        System.out.println("Conteúdos Inscritos" +   devMeireles.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" +   devMeireles.getConteudosConcluidos());
          System.out.println("Total de XP: " +   devMeireles.calcularXp());




    }
}
