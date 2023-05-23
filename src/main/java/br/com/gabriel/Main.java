package br.com.gabriel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String aula1 = "arro";
        String aula2 = "bala";
        String aula3 = "Bao andré";

        var aulas = new ArrayList<>();
        aulas.add(aula1);//
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(1);

        System.out.println(aulas);
        for (Object aula: aulas) {
            System.out.println("É ele " +aula);
        }



        }
    }


