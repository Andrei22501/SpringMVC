package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.models.Car;
import web.service.CarService;

@Controller
@RequestMapping()
public class CarController {
    public int i = 1;
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        model.addAttribute("car1s", carService.carList(count));
        return "car";
    }
//        Я безнадёжен, после комментария ментора начал сразу решать по другому, создавать класс сервайс и там всё настраивать.
//        думал что цель задания вывод в консоль должна быть, а не в таблице самой :)
//    а ещё, так как я писал на 8 версии JDK, я максимально долго тупил, и не мог понять, почему у меня возникла проблема со стримами
//    и нихрена не получается.
}
