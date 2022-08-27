package br.com.dio.collection.set.exerciciospropostos;

/*
    Crie um conjunto contendo as cores do arco-íris e:
        a - Exiba todas as cores uma abaixo da outra.
        b - Exiba a quantidade de cores que o arco-íris tem.
        c - Exiba as corem em órdem alfabética.
        d - Exiba as cores na ordem inversa da que foi informada.
        e - Exiba todas as cores que começam com a letra "V".
        f - Remova todas as cores que não começam com a letra "V".
        g - Limpe o conjunto.
        h - Confira se o conjunto está fazio.
 */

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        // Crie um conjunto contendo as cores do arco-íris
        System.out.println("\nCrie um conjunto contendo as cores do arco-íris: ");
        Set<String> cores = new HashSet<>(Arrays.asList("Vermelha", "Laranja", "Amarela", "Verde", "Azul", "AzulEscuro", "Violeta"));

        // a - Exiba todas as cores uma abaixo da outra.
        System.out.println("\nExiba todas as cores uma abaixo da outra: ");
        for (String cor: cores) {
            System.out.println(cor);
        }

        // b - Exiba a quantidade de cores que o arco-íris tem.
        System.out.print("\nExiba a quantidade de cores que o arco-íris tem: ");
        System.out.println(cores.size());

        // c - Exiba as corem em órdem alfabética.
        System.out.println("\nExiba as corem em órdem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        for (String corOrdemAlfabetica: cores2) {
            System.out.println(corOrdemAlfabetica);
        }

        // d - Exiba as cores na ordem inversa da que foi informada.
        System.out.println("\nExiba as cores na ordem inversa da que foi informada: ");
        List<String> coresInversa = new ArrayList<>(cores);
        Collections.reverse(coresInversa);
        System.out.println(coresInversa);

        // e - Exiba todas as cores que começam com a letra "V".
        System.out.println("\nExiba todas as cores que começam com a letra 'V' :");
        Iterator<String> iteratorCoresComLetraV = cores.iterator();
        while (iteratorCoresComLetraV.hasNext()) {
            String next = iteratorCoresComLetraV.next();
            if (next.charAt(0) == 'V') {
                System.out.println(next);
            }
        }

        // f - Remova todas as cores que não começam com a letra "V".
        System.out.println("\nRemova todas as cores que não começam com a letra 'V': ");
        Iterator<String> iteratorCoresNaoV = cores.iterator();
        while (iteratorCoresNaoV.hasNext()) {
            String next = iteratorCoresNaoV.next();
            if (next.charAt(0) != 'V') {
                System.out.println(next);
                iteratorCoresNaoV.remove();
            }
        }
        System.out.println(cores);

        // g - Limpe o conjunto.
        System.out.print("\nLimpe o conjunto: ");
        cores.clear();
        System.out.println(cores);

        // h - Confira se o conjunto está fazio
        System.out.print("\nConfira se o conjunto está fazio: ");
        System.out.println(cores.isEmpty());

        /*
            .
         */



    }
}
