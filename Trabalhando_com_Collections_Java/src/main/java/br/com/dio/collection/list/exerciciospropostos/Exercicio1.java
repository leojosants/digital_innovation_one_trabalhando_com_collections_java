package br.com.dio.collection.list.exerciciospropostos;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        /*
            Faça um programa que receba a temperatura média dos 6 primeiros meses
            do ano e armazene-as em uma lista.
            Após isto, calcule a média semestral das temperaturas e mostre todas
            as temperaturas acima desta média, e em que mês elas ocorreram (mostrar
            o mês por extenso: 1 - Janeiro, 2 - Fevereiro, 3 - Março etc.)
         */

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nInforme a temperatura média dos 6 primeiros meses do ano");

        List<Double> temperaturas = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.printf("Entre com a %dª temperatura: ", (i + 1));
            Double temp = leitor.nextDouble();
            temperaturas.add(temp);
        }

        // Calcular média
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0.0;
        Double media = 0.0;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nTemperaturas: " + temperaturas);

        media = soma / temperaturas.size();

        System.out.printf("SOMA: %.1f%n", soma);
        System.out.printf("MÉDIA: %.1f%n", media);

        // Mostrar todas as temperatura acima da média
        Iterator<Double> iterator1 = temperaturas.iterator();
        Integer mesOcorrencia = 0;

        System.out.println("\nTemperaturas acima da média e meses correspondentes:");
        while (iterator1.hasNext()) {
            Double next = iterator1.next();

            if (next > media) {
                switch (mesOcorrencia) {
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f%n", next);
                        break;

                    case (1):
                        System.out.printf("2 - Fevereito: %.1f%n", next);
                        break;

                    case (2):
                        System.out.printf("3 - Março: %.1f%n", next);
                        break;

                    case (3):
                        System.out.printf("4 - Abril: %.1f%n", next);
                        break;

                    case (4):
                        System.out.printf("5 - Maio: %.1f%n", next);
                        break;

                    case (5):
                        System.out.printf("6 - Junho: %.1f%n", next);
                        break;

                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
            }

            mesOcorrencia ++;
        }

        leitor.close();

    }

}
