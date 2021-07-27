package com.logic.day04.StudyCaseInheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarClient {
    // 1. inisialisasi object car ke dalam list <Car>
    public List<Car> initListCar(Car... cars) {
        List<Car> listofCar = new ArrayList<>();
        listofCar = Arrays.asList(cars);
        return listofCar;
    }

    // 2. Cetak object car
    public void printListCar (List<Car> listofCar) {
        for (Car car : listofCar) {
            System.out.println(car.toString());
        }

       /*  for (int i = 0; i < listofCar.size(); i++) {
            Car car = listofCar.get(i);
            System.out.println(car.toString());
        } */
    }

    // 3. Search List of car with carType
    public List<Car> findCarByType (final List<Car> lisOfCar, final String carType) {
       final List<Car> listCar = new ArrayList<>();
        for (final Car car : lisOfCar) {
            if (car.getType().equals(carType)) {
                listCar.add(car);
            }
        }
        return listCar;
    }

    // 4. Search object car and return with java util optional
    public Optional<Car> findCarByNomor(List<Car> listOfCar, String noPolisi) {
        Optional<Car> carResult = Optional.empty();
        for (Car car : listOfCar) {
            if (car.getNoPolisi().equals(noPolisi)) {
                carResult = Optional.of(car);
            }
        }
        return carResult;
    } 

    // 5. get total pendapatan dari mobil yang beroperasi
    public double totalPendapatan(List<Car> listOfCar, CarType carType) {
        double total = 0d;
        for (Car car : listOfCar) {
          /*   if (car.getType().equals(carType)) {
                total += car.getTotalPendapatan();
            } */

            //Car type
            if (carType == carType.ALL_CARS) {
                total += car.getTotalPendapatan();
            } else {
                if ( car.getType().equals(carType.toString())) {
                    total += car.getTotalPendapatan();
                }
            }
        }
        return total;
    }
}