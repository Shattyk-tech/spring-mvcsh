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
        carList.add(new Car(1, "Camry", "Toyota"));
        carList.add(new Car(2, "Mers", "E-class"));
        carList.add(new Car(3, "Honda", "Accord"));
        carList.add(new Car(4, "KIA", "Hyundai"));
        carList.add(new Car(5, "Sanata", "Hyundai"));
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
