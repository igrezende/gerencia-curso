package br.com.gabriel;

public class TesteCursoAluno {
    public static void main(String[] args) {

        Curso coll = new Curso("List", "Gabriel");

        coll.adiciona(new Aula("Collections",20));// adionando listas das aulas que tem no curso
        coll.adiciona(new Aula("LinkedList", 15));

        Aluno a = new Aluno("Igor",123456);
        Aluno a1 = new Aluno("Gabriel", 654321);
        Aluno a2 = new Aluno("Batista",789456);

        coll.matriculaAluno(a);    //adicionando alunos no curso
        coll.matriculaAluno(a1);
        coll.matriculaAluno(a2);

        System.out.println("Alunos matriculados: ");
        coll.getAlunos().forEach(System.out::println);// vendo a lista de alunos no curso com metodo foreach


        System.out.println(coll.estaMatriculado(a));





    }


}
