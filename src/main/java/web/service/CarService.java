package web.service;

import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

public interface CarService {

    List<Car> carList(int id);

}
