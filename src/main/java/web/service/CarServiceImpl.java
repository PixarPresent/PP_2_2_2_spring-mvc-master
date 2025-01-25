package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    List<Car> cars;

    @Override
    public List<Car> getListOfCar(int count, List<Car> cars) {
        if (count > 0 && count <= cars.size()) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
