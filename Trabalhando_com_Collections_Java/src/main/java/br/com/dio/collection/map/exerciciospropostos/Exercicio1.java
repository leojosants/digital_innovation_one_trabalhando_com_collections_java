package br.com.dio.collection.map.exerciciospropostos;

/*
    Dada a população estimada de alguns estados do NE brasileiro, faça;
        Estado = PE - População = 9.616.621
        Estado = AL - População = 3.351.543
        Estado = CE - População = 9.187.102
        Estado = RN - População = 3.534.265
        - Crie um dicionario e relacione os estdos e suas populações;
        - Substitua a população do estado do RN por 3.534.165;
        - Confira se oestado da PB está dentro do dicionário, caso não adicione: PB 4.039.277;
        - Exiba a população de PE;
        - Exiba todos os estados e suas populações na ordem que foi informado;
        - Exiba os estados e suas populações em ordem alfabética;
        - Exiba os estados com a menor população e sua quantidade;
        - Exiba os estados com a maior população e sua quantidade;
        - Exiba a soma da população desses estados;
        - Exiba a média da população deste dicionário de estados;
        - Remova os estados com a população menor que 4.000.000;
        - Apague o difionário;
        - Confira se o dicionário está vazio;
 */

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("\nConfira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(populacaoEstadosNE);

        System.out.println("\nExiba a população do estado PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadosNE2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
        System.out.println(populacaoEstadosNE3);

        Collection<Integer> populacao = populacaoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));

        System.out.printf("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populacaoEstadosNE.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("\nConfira se a lista está vazia: " + populacaoEstadosNE.isEmpty());

    }
}
