package br.com.dio.collection.list;

import java.util.*;

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

        System.out.println("\nExiba a terceira nota adicionada:");
        System.out.println(notas);
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota:");
        System.out.println(notas);
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota:");
        System.out.println(notas);
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas:");
        Double media = soma / notas.size();
        System.out.println(media);

        System.out.println("\nRemova a nota 0.0");
        System.out.println(notas);
        System.out.println(notas.remove(0.0));
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0");
        System.out.println(notas);
        System.out.println(notas.remove(0));
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista:");
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista.");
        System.out.println(notas);
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia.");
        System.out.println(notas);
        System.out.println(notas.isEmpty());

        // Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("\nCrie uma lista chamada notas2 e coloque todos os elementos da List ArrayList nessa nova lista.");
        List<Double> notas2 = new LinkedList<Double>(); // Generics(jdk 5)

        System.out.println(notas2.size());
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo:");
        System.out.println(notas2.get(0));
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista removendo-o:");
        System.out.println(notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);

//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");


    }
}
