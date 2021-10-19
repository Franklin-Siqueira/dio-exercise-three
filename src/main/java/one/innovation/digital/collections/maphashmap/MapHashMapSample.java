package one.innovation.digital.collections.maphashmap;

import java.util.*;
/**
 *  Map<String, Double> | HashMap<>() | LinkedHashMap<>() | TreeMap<>()
 *
 *  English
 *
 *  Given 5 cars' gas average kilometers per litres information, implement a solution.
 *  
 *  model - VW gol          | kpl   - 14,4
 *  model - Fiat uno        | kpl   - 15,6
 *  model - Fiat mobi       | kpl   - 16,1
 *  model - Hyundai hb20    | kpl   - 14,5
 *  model - Renault kwid    | kpl   - 15,6
 *  
 *  Português 
 *  (original from Camila Cavalcante - github.com/cami-la/curso-dio-intro-collections/src/br/com/dio/collection/map/ExemploMap.java)
 *
 *  Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 *  modelo = gol - consumo = 14,4km/l
 *  modelo = uno - consumo = 15,6 km/l
 *  modelo = mobi - consumo = 16,1 km/l
 *  modelo = hb20 - consumo = 14,5 km/l
 *  modelo = kwid - consumo = 15,6 km/l
 */
public class MapHashMapSample {
    public static void main(String[] args) {
        /*
        Map carModels2020 = new HashMap(); //antes do java 5
        Map<String, Double> carModels = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        HashMap<String, Double> carModels = new HashMap<>();
        Map<String, Double> carModels2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
        */
        System.out.println("Start processing:..........................................");
        System.out.println("Define a dictionary with car models and their kpl averages.");
        // System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carModels = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carModels.toString());
        System.out.println("Change gol's kpl to 15.2 km/l: ");
        carModels.put("gol", 15.2);
        System.out.println(carModels);
        System.out.printf("Dictionary contains 'tucson': %s\n", carModels.containsKey("tucson"));
        System.out.printf("Show uno's kpl: % .2f\n", carModels.get("uno"));
        // System.out.println("Exiba o terceiro modelo adicionado: ");
        // Show models
        System.out.println("Show models: ");
        Set<String> models = carModels.keySet();
        System.out.println(models);
        // Show models' kpl
        System.out.println("Show models' kpl: ");
        Collection<Double> kpl = carModels.values();
        System.out.println(kpl);
        //
        // System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        System.out.println("Show most efficient model and its kpl:");
        Double mostEfficient = Collections.max(carModels.values());
        Set<Map.Entry<String, Double>> entries = carModels.entrySet();
        String mostEfficientModel = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(mostEfficient)) {
                mostEfficientModel = entry.getKey();
                System.out.printf("Most efficient model: %s |% .2f\n", mostEfficientModel, mostEfficient);
            }
        }
        //
        System.out.println("Show less efficient model and its kpl: " );
        Double lessEfficient = Collections.min(carModels.values());
        String lessEfficientModel = "";
        for (Map.Entry<String, Double> entry: carModels.entrySet()) {
            if(entry.getValue().equals(lessEfficient)) {
                lessEfficientModel = entry.getKey();
                System.out.printf("Less efficient model: %s |% .2f\n", lessEfficientModel, lessEfficient);
            }
        }
        // Calculations | Cálculos
        Iterator<Double> iterator = carModels.values().iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.printf("Show average kpl sum | Exiba a soma dos consumos: % .2f\n", sum);
        System.out.printf("Show average kpl for all models in the dictionary: % .2f\n", (sum/carModels.size()));
        // System.out.println(carModels);
        System.out.println("Remove models with kpl = 15,6 km/l: ");
        /*
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        */
        carModels.values().removeIf(aDouble -> aDouble.equals(15.6));
        System.out.println(carModels);
        //
        System.out.println("Show models in their input order: ");
        // System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carModels1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carModels1.toString()); // toString is inferred
        System.out.println("Show dictionary sorted by model: ");
        // System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carModels2 = new TreeMap<>(carModels1);
        System.out.println(carModels2.toString()); // toString is inferred
        System.out.println("Clear the dictionary: ");
        // System.out.println("Apague o dicionario de carros: ");
        carModels.clear();
        //
        System.out.println("Confirm the dictionary is empty: " + carModels.isEmpty());
        // System.out.println("Confira se o dicionário está vazio: " + carModels.isEmpty());
        System.out.println("End.........................................");
    }
}
// https://gist.githubusercontent.com/Franklin-Siqueira/c1402edd19ba6dabd14700091facbb2d/raw/2da779dec66d49c579df2850fe7aa9dee79d8c4c/User.json