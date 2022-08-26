package br.com.dio.collection.list.exerciciospropostos;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
            Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa,
            sobre um crime. As perguntas são:
                - 1: "Telefonou para a vítima?"
                - 2: "Esteve no local do crime?"
                - 3: "Mora perto da vítima?"
                - 4: "Devia para a vítima?"
                - 5: "Já trabalhou com a vítima?"
            Se a pessoa responder positivamente a 2 questões ele deve ser calssificada
            como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
            contrário, ela será classificada como "Inoscente".
         */

        Scanner leitor = new Scanner(System.in);
        List<Character> respostas = new ArrayList<>();
        System.out.println("\nResponda as perguntas abaixo somente com [S/N]:");

        System.out.print("- 1: Telefonou para a vítima? ");
        Character resposta1 = leitor.next().toUpperCase().charAt(0);

        System.out.print("- 2: Esteve no local do crime? ");
        Character resposta2 = leitor.next().toUpperCase().charAt(0);

        System.out.print("- 3: Mora perto da vítima? ");
        Character resposta3 = leitor.next().toUpperCase().charAt(0);

        System.out.print("- 4: Devia para a vítima? ");
        Character resposta4 = leitor.next().toUpperCase().charAt(0);

        System.out.print("- 5: Já trabalhou com a vítima? ");
        Character resposta5 = leitor.next().toUpperCase().charAt(0);

        respostas.add(resposta1);
        respostas.add(resposta2);
        respostas.add(resposta3);
        respostas.add(resposta4);
        respostas.add(resposta5);

        System.out.print("\nRespostas: " + respostas.toString() + " --> ");

        Iterator<Character> characterIterator = respostas.iterator();
        Integer cont = 0;

        while (characterIterator.hasNext()) {
            Character next = characterIterator.next();

            if (next == 'S') {
                cont++;
            }
        }

        switch (cont) {
            case (2):
                System.out.println("Suspeita");
                break;

            case (3):
            case (4):
                System.out.println("Clúmplice");
                break;

            case (5):
                System.out.println("Assassina");
                break;

            default:
                System.out.println("Inoscente");
                break;
        }


        leitor.close();

    }
} // fim main