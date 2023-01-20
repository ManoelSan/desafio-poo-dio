import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main{

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("cruso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("cruso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setTitulo("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.SetNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");

       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devNeo = new Dev();
       devNeo.setNome("Neo");
       devNeo.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Neo" + devNeo.getConteudosInscritos());

       devNeo.progredir();
       devNeo.progredir();

       System.out.println("#");

       System.out.println("Conteúdos Inscritos Neo" + devNeo.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos Neo" + devNeo.getConteudosConcluidos());
       System.out.println("XP: " + devNeo.calcularTotalXp());

       System.out.println("##############");

       Dev devManolo = new Dev();
       devManolo.setNome("Manolo");
       devManolo.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Manolo" + devManolo.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos Neo" + devManolo.getConteudosConcluidos());

       System.out.println("XP: " + devManolo.calcularTotalXp());
       
       devManolo.progredir();
       devManolo.progredir();
       devManolo.progredir();
       
       System.out.println("#");
       System.out.println("Conteúdos Inscritos Manolo" + devManolo.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos Manolo" + devManolo.getConteudosConcluidos());



    
    }

}