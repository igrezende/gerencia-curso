package br.com.gabriel;

import java.util.*;

public class Curso {


    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer,Aluno> matriculaAluno = new HashMap<>();

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
        return Collections.unmodifiableList(aulas);// metodo pra retornar a lista
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);

    }

    @Override
    public String toString() {
        return "[ Curso: " + nome + "]";
    }

    public void matriculaAluno(Aluno aluno) { // metodo para adicionar alunos no curso
        this.alunos.add(aluno);

        this.matriculaAluno.put(aluno.getNumMatricula(),aluno); // assimilando o aluno a matricula
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos) ;
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public  Aluno buscaMatricula(int matricula) {
        return matriculaAluno.get(matricula);
    }
}
