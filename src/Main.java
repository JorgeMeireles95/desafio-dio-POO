import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição do curso javascript");
        curso2.setCargaHoraria(12);

        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);









    }
}
