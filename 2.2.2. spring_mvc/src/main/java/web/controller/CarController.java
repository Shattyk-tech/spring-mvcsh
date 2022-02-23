package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {

    CarService service = new CarServiceImpl();
    @GetMapping
    public String getAllCar(Model model){
        model.addAttribute("modelCars",service.getAllCar());
        return "/GetCars";
    }

    @GetMapping("/")
    public String getCarById(@RequestParam("count") int count,Model model){
        model.addAttribute("modelCars",service.getCarById(count));
        return "/GetCars";



    }

}
