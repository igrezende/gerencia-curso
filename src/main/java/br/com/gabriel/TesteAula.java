        package br.com.gabriel;

        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Collections;
        import java.util.Comparator;

        public class TesteAula {
    public static void main(String[] args) {


                Aula a1 = new Aula("Revistando as ArrayLists",  22);
                Aula a2 = new Aula("Listas de objetos", 20);
                Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

               ArrayList<Aula> aulas = new ArrayList<>();
                aulas.add(a1);// adicioando aulas
                aulas.add(a2);
                aulas.add(a3);


        System.out.println(aulas);
        Collections.sort(aulas);// ordenando as aulas por ordem alfabética

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));// ordenando porr ordem e tempo em minutos
    }
        }



