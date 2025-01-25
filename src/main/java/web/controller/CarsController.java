package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    private final CarService carService = new CarServiceImpl();

    private List<Car> carList = List.of(
            new Car(1L, "Model A", 1),
            new Car(2L, "Model B", 2),
            new Car(3L, "Model C", 3),
            new Car(4L, "Model D", 4),
            new Car(5L, "Model E", 5),
            new Car(6L, "Model F", 6)
    );

    @GetMapping("/cars")
    public String listCars(@RequestParam(value = "c", required = false, defaultValue = "0") int count, Model model) {
        List<Car> cars = carList;
        model.addAttribute("cars", carService.getListOfCar(count, cars));
        return "cars";
    }
}

