package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faca:

        // antes do java 5
//        List notas = new ArrayList();

//        ArrayList<Double> notas = new ArrayList<>();
//        List<Double> notas = new  ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /*
//        DESSA FORMA NÃO SE PODE UTILIZAR OS METODOS ADD E REMOVE
        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);
        */

        /*
//         LISTA IMUTAVEL
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
        */

        System.out.println("Crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<Double>(); // Generics(jdk 5)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
//        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posiçao 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.indexOf(8.0));
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0");
        System.out.println(notas);
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista");
        System.out.println(notas);
        System.out.println(notas.contains(5.0));

        System.out.println("\nExiba todas as notas na ordem que foram informadas: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }


    }
}
