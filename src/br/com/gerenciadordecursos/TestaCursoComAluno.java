package br.com.gerenciadordecursos;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));

        Aluno dudu = new Aluno("Eduardo Sartori", 1010);
        Aluno rique = new Aluno("Enrique Sartori", 1110);
        Aluno gui = new Aluno("Guilherme Doebber", 1012);

        curso.matricula(dudu);
        curso.matricula(rique);
        curso.matricula(gui);

        curso.getAlunos().forEach(System.out::println);

        System.out.println(curso.alunoMatriculado(dudu));

    }
}
