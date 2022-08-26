package br.com.dio.collection.set.exemplos;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        // Dada uma lista co 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // antes do java 5
//        Set notas = new HashSet();

        // Generics(jdk 5) -  Diamont Operator(jdk 7)
//        Set<Double>notas = new HashSet<>();

//        HashSet<Double> notas = new HashSet<>();
//        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /*
        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
         */

        System.out.println("\nCrie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

//        System.out.println("\nExiba a posição da nota 5.0: "); // Interface não permite busca com index
//        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: "); // Interface não permite trabalhar com index
//        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: "); // Interface não possui o método set()

        System.out.print("\nConfira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5.0));

//        System.out.println("\nExiba a terceira nota adicionada"); // interface não trabalha com indice

        System.out.print("\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.print("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.print("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.printf("%.1f", soma);

        System.out.print("\nExiba a média das notas: ");
        Double media = soma / notas.size();
        System.out.printf("%.1f", media);

        System.out.print("\n\nRemova a nota 0: ");
        System.out.println(notas.remove(0.0));
        System.out.println(notas);

//        System.out.println("\n\nRemova a nota da posição 0: "); // interface não permite

        System.out.println("\nRemova as notas menos que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("\nExiba todas as notas na ordem crecente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\nApague todo o conjunto:");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nCinfira se o conjunto está fazio");
        System.out.println(notas);
        System.out.println(notas.isEmpty());

    }
}
