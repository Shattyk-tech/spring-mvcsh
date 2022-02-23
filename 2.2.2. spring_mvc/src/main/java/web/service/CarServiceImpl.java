package web.service;

import org.springframework.stereotype.Component;
import web.controller.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {


     List<Car> carList;


    {
        carList=new ArrayList<>();
        carList.add(new Car(1, "Toyota", 23456));
        carList.add(new Car(2, "Mers", 123456));
        carList.add(new Car(3, "Honda", 87543));
        carList.add(new Car(4, "Audi", 123456));
        carList.add(new Car(5, "", 12345));
    }

    @Override
    public List<Car> getCarById(int choose) {
      List<Car> methodListCar = new ArrayList<>();
        for (int i = 0; i < choose; i++) {
            if (choose <= 5){
                methodListCar.add(carList.get(i));
            }else {

                return carList;
            }

        }
        return methodListCar;
    }

    @Override
    public List<Car> getAllCar() {
        return carList;
    }
}
