package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.models.Car;

@Controller
@RequestMapping()
public class CarController {
    private int i = 1;
    private final CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        model.addAttribute("car1s", carDAO.carList());
            for (Car car : carDAO.carList()) {
                if (i <= count) {
                    System.out.println("ID Машины: " + car.getNumber() + "|" + " Модель: " + car.getModel() + "|" + " Год выпуска: " + car.getManufacture());
                }
                i++;
            }
        return "car";
    }
//    @GetMapping()
//    public String cars(@RequestParam("count") int count) {
//        for (Car car : carDAO.carList()) {
//            System.out.println(car.getNumber() + car.getModel() + car.getManufacture());
//        }
//    return "car";
//    }

}
