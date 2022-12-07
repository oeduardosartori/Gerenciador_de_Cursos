package br.com.gerenciadordecursos;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Eduardo Sartori");
        alunos.add("Enrique Sartori");
        alunos.add("Rhayane Sartori");
        alunos.add("Neila Sartori");
        alunos.add("Caio Scherer");
        alunos.add("Patrick Deters");

        boolean alex = alunos.contains("Alex Sartori");
        System.out.println(alex);

        alunos.remove("Neila Sartori");

        System.out.println(alunos.size());
        System.out.println(alunos);


    }
}
