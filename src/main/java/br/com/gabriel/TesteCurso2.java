package br.com.gabriel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {
    public static void main(String[] args) {
        Curso coll = new Curso("", "Gabriel");

        coll.adiciona(new Aula("Collections",20));
        coll.adiciona(new Aula("Arrays",14));// adionando listas das aulas que tem no curso
        coll.adiciona(new Aula("LinkedList", 15));

        List<Aula> aulasImutaveis = coll.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);// usando uma variavel para ordenar a lista
                                                                   //pois o metodo deixa imodificavel

        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);
        System.out.println(coll);

    }
}
