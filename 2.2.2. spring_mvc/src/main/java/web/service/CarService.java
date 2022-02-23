package web.service;

import web.controller.Car;

import java.util.List;

public interface CarService {
    List<Car>getCarById(int choose);
    List<Car>getAllCar();

}
