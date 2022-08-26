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
                System.out.println(modeloMaisEficiente + " - " + consumoMaisMaisEficiente);
            }
        }

        

    }
}
