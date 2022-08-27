package br.com.dio.collection.map.exemplos;

/*
    Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
        - modelo = gol - consumo = 14,4 km/l
        - modelo = uno - consumo = 15,6 km/l
        - modelo = mobi - consumo = 16,1 km/l
        - modelo = hb20 - consumo = 14,5 km/l
        - modelo = kwid - consumo = 15,6 km/l
 */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        // antes do java 5
//        Map carrosPopulares2020 = new HashMap();

        // Generics(jdk 5) Diamont
//        Map<String, Double> carrosPopulares = new HashMap<>();

//        HashMap<String, Double> carrosPopulares = new HashMap<>();

//        Map<String, Double> CarrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos.");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15.2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.print("\nConfira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.print("\nExiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("uno") + " km/l");

//        System.out.println("\nExiba o terceiro modelo adicionado: "); // interface não permite

        System.out.print("\nExiba os modelo de carros: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.print("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.print(modeloMaisEficiente + " - " + consumoMaisMaisEficiente + " km/l");
            }
        }

        System.out.println("\n\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente + " km/l");
            }
        }

        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: ");;
        Double media = soma / carrosPopulares.size();
        System.out.println(media);

        System.out.println("\nRemova os modelos igual a 15.6 km/l: ");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("\nInforme todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopularesOI = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesOI);

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopularesOM = new TreeMap<>(carrosPopularesOI);
        System.out.println(carrosPopularesOM);

        System.out.println("\nApague o dicionario de carros: ");
        carrosPopularesOI.clear();
        System.out.println(carrosPopularesOI);

        System.out.println("\nConfira se o dicionário está vazio");
        System.out.println(carrosPopularesOI.isEmpty());

    }
}
