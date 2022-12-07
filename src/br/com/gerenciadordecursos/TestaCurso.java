package br.com.gerenciadordecursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

public class TestaCurso {

    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> list = curso.getAulas();
        List<Aula> listAulas = new ArrayList<>(list);

        Collections.sort(listAulas);

        System.out.println(listAulas);
        System.out.println(curso.getAulas());

        System.out.println("Tempo total de aulas: " + curso.getTempoTotal());

        System.out.println(curso);
    }
}
