package br.com.gabriel;

public class TestaBuscaPorMatricula {
    public static void main(String[] args) {

        Curso coll = new Curso("", "Gabriel");

        coll.adiciona(new Aula("Collections",20));
        coll.adiciona(new Aula("Arrays",14));// adionando listas das aulas que tem no curso
        coll.adiciona(new Aula("LinkedList", 15));

       Aluno a = new Aluno("Igor", 123456);
       Aluno a1 = new Aluno("Pedro", 654135);
       Aluno a2 = new Aluno("Maria", 741258);

       coll.matriculaAluno(a);
       coll.matriculaAluno(a1);

       coll.buscaMatricula(123456);

        System.out.println(coll.getAlunos());
        System.out.println(coll.getAulas());

        Aluno aluno = coll.buscaMatricula(123456);// aluno matriculado
        System.out.println(aluno);
    }
}
