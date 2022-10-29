package main;

import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descri��o curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descri��o curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descri��o mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        System.out.println(curso2);
        //System.out.println(mentoria);
        
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descri��o do bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp1);

        Dev dev2 = new Dev();
        dev2.setNome("Jo�o");
        dev2.inscreverBootcamp(bootcamp1);
        
        System.out.println("Inscritos:" + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Concluidos" + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos:" + dev1.getNome() + ":" + dev1.getConteudosInscritos());

        System.out.println("----");

        System.out.println("Inscritos:" + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Concluidos" + dev2.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("Inscritos:" + dev2.getNome() + ":" + dev2.getConteudosInscritos());


        System.out.println("XP Camila:" + dev1.calcularTotalXp());
        System.out.println("XP Joao:" + dev2.calcularTotalXp());

    }
}