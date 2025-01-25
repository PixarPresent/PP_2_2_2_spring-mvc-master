package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    List<Car> cars;

    @Override
    public List<Car> getListOfCar(int count, List<Car> cars) {
        return cars.subList(0, count);
    }
}
