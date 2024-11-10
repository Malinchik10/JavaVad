package HW_17;

import java.util.*;

public class MainCollectionStream {
    public static void main(String[] args) {
        List<City> cities = CreateDataSet();
        City cityWithMaxPopulationOnContinent =
                cities.stream()
                        .filter(p -> p.get_continent() == Continent.Europe)
                        .max(Comparator.comparingInt(City::get_population))
                        .get();
        System.out.println("City with max population on Europe: " + cityWithMaxPopulationOnContinent);
        City cityWithMinPopulationOnContinent =
                cities.stream()
                        .filter(p -> p.get_continent() == Continent.Europe)
                        .min(Comparator.comparingInt(City::get_population))
                        .get();
        System.out.println("City with min population on Europe: " + cityWithMinPopulationOnContinent);
        City cityWithMaxPopulation =
                cities.stream()
                        .max(Comparator.comparingInt(City::get_population))
                        .get();
        System.out.println("City with max: " + cityWithMaxPopulation);
        City cityWithMinPopulation =
                cities.stream()
                        .min(Comparator.comparingInt(City::get_population))
                        .get();
        System.out.println("City with min: " + cityWithMinPopulation);
        City firstCityWithPopulationMoreOneBln =
                cities.stream()
                        .filter(p -> p.get_population() > 1000000)
                        .findFirst()
                        .get();
        System.out.println("First city with population more 1 bln: " + firstCityWithPopulationMoreOneBln);
        List<City> citiesWithPopulationMoreOneBln =
                cities.stream()
                        .filter(p -> p.get_population() > 1000000)
                        .toList();
        List<City> citiesOrderByPopulationAsc =
                cities.stream()
                        .sorted(Comparator.comparingInt(City::get_population))
                        .toList();
        List<City> citiesOrderByPopulationDesc =
                cities.stream()
                        .sorted(Comparator.comparingInt(City::get_population).reversed())
                        .toList();
        List<String> citiesNames =
                cities.stream()
                        .map(City::get_name)
                        .toList();
        double avgPopulation =
                cities.stream()
                        .mapToInt(City::get_population)
                        .average()
                        .orElse(Double.NaN);
        System.out.println("Average population: " + avgPopulation);
        boolean isOsloPresent = cities.stream().anyMatch(p -> Objects.equals(p.get_name(), "Oslo"));
        System.out.println("Oslo present: " + isOsloPresent);
        City Oslo = findByName(cities, "Oslo");
    }

    private static List<City> CreateDataSet() {
        return List.of(
                new City(0, "Minsk", 4000000, Continent.Europe),
                new City(1, "Moscow", 14000000, Continent.Europe),
                new City(2, "Astana", 8000000, Continent.Asia),
                new City(3, "Berlin", 8000000, Continent.Europe),
                new City(4, "Paris", 1000000, Continent.Europe),
                new City(5, "Washington", 7000000, Continent.Europe),
                new City(6, "Logoisk", 40000, Continent.Europe),
                new City(7, "Smolensk", 400000, Continent.Europe),
                new City(8, "Tashkent", 2340000, Continent.Europe),
                new City(9, "Orsha", 115000, Continent.Europe)
        );
    }

    private static City findByName(List<City> cities, String name) {
        Optional<City> city = cities.stream().filter(p -> Objects.equals(p.get_name(), "Oslo")).findFirst();
        if(city.isPresent()) {
            return city.get();
        }
        else {
            throw new NoSuchElementException("No such city");
        }
    }
}
