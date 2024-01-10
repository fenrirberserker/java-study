package algoritmia.paths;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindCities {

    static class City{
        private String name;
        private Integer distance;

        City(){

        }

        City(String name, Integer distance){
            this.name = name;
            this.distance = distance;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getDistance() {
            return distance;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", distance=" + distance +
                    '}';
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String[] cities = {"Tucson","Albany","Smith","Westford","Berkeley"};
        Integer[] distances = {102,95,114,1421,50};

        maxCities(cities,distances);

    }

    public static void maxCities(String[] cities, Integer[] distances) throws InterruptedException {

        List<City> list = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            list.add(new City(cities[i], distances[i]));
        }
        list = list.stream().sorted(Comparator.comparing(City::getName)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        List<City> paths = new ArrayList<>();

        int index = 0;

        while(index< list.size()){
            City next = findSmallest(list.subList(index, list.size()));
            System.out.println("city "+next);
            paths.add(next);
            index = list.indexOf(next)+1;
            System.out.println("index "+index);
            //Thread.sleep(1000);

        }

        System.out.println("Paths");
        paths.stream().forEach(System.out::println);


    }

    public static City findSmallest(List<City> list){

        System.out.println("find between "+list.size());

        Optional<City> city = list.stream().min(Comparator.comparing(City::getDistance));

        //System.out.println("min "+city.get());

        return city.get();

    }
}
