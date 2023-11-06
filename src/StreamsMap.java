import Domain.Car55;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMap {

    public static void main(String[] args) {
        List<Car55> listOfCars = new ArrayList<>();
        listOfCars.add(new Car55("Tesla", "Model S", 2023));
        listOfCars.add(new Car55("Tesla", "Model S", 2023));
        listOfCars.add(new Car55("Tesla", "Model S", 2023));
        listOfCars.add(new Car55("Tesla", "Model S", 2022));
        listOfCars.add(new Car55("Tesla", "Model X", 2021));
        listOfCars.add(new Car55("Ford", "Bronco", 2023));
        listOfCars.add(new Car55("Chevrolet", "Impala", 2023));
        listOfCars.add(new Car55("Toyota", "Camry", 2022));


        listOfCars.stream().map(s -> s.getModel()).forEach(s -> System.out.println(s));

        System.out.println("\u001B[36m//////////////////////////////////////////////////////");

        listOfCars.stream().map(s -> s.getBrand() + " <> " + s.getYear()).forEach(s -> System.out.println(s));

        System.out.println("\u001B[34m//////////////////////////////////////////////////////");

        List<String> carModelYear = listOfCars.stream().map(s -> s.getModel() + " <-> " + s.getYear()).peek(s -> System.out.println(s))
                .collect(Collectors.toList());

        System.out.println("\u001B[35m//////////////////////////////////////////////////////");

        List<String> carModelYear2 = listOfCars.stream().map(s -> s.getModel() + " <-> " + s.getYear())
                .peek(System.out::println)
                .toList();


        System.out.println("\u001B[31m//////////////////////////////////////////////////////");

        Set<String> carModelYear3 = listOfCars.stream().map(s -> s.getModel() + " <-> " + s.getYear())
                .peek(System.out::println)
                .collect(Collectors.toSet());

        System.out.println("\u001B[32m//////////////////////////////////////////////////////");

        String carModelYear4 = listOfCars.stream().map(s -> s.getModel() + " / " + s.getYear())
                .distinct()
                .filter(s -> s.startsWith("M"))
                .peek(System.out::println)
                .collect(Collectors.joining(" <||-||> "));

        System.out.println(carModelYear4);
        String newS3 = carModelYear4.substring(0, carModelYear4.length()-2);
        System.out.println(newS3);

        System.out.println("\u001B[33m//////////////////////////////////////////////////////");

        Set<String>  newList3 = new HashSet<>();
        for(Car55 car : listOfCars){
            String brand = car.getBrand();
            if(brand.startsWith("T")){
                newList3.add(brand);
            }
        }

        String output3 = "";
        for(String carBrand : newList3){
//            output3 = output3 + carBrand + " <||-||>";
            output3 += carBrand + " <||-||> ";
        }
        System.out.println(output3);
        output3 = output3.substring(0, output3.length()-6);
        System.out.println(output3);


    }


}
