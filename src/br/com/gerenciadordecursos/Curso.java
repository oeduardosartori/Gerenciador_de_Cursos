package br.com.gerenciadordecursos;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private final List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaEAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public void remover(int aula) {
        this.aulas.remove(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", tempo total: " + this.getTempoTotal();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaEAluno.put(aluno.getNumeroMatricula(),aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean alunoMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        return matriculaEAluno.get(numero);
    }
}
