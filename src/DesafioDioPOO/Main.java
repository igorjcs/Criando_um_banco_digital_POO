package DesafioDioPOO;

import DesafioDioPOO.br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Phyton");
        curso2.setDescricao("Descrição curso de Phyton");
        curso2.setCargaHoraria(6);


        //System.out.println(curso1);
        //System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria1");
        mentoria1.setDescricao("Descrição mentoria 1");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Igor: " + devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Igor: " + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Igor: " + devIgor.getConteudosConcluidos());
        System.out.println("XP: " + devIgor.calcularTotalXp());


        System.out.println("-------");

        Dev devJovana = new Dev();
        devJovana.setNome("Jovana");
        devJovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jovana: " + devJovana.getConteudosInscritos());
        devJovana.progredir();
        devJovana.progredir();
        devJovana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Jovana: " + devJovana.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Jovana: " + devJovana.getConteudosConcluidos());
        System.out.println("XP: " + devJovana.calcularTotalXp());



    }
}
