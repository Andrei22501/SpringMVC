package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOImp implements CarDAO {
    private static Car car1;
    private static int COUNT;
    List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(++COUNT, "Black Angus(Burger)", 1998));
        car.add(new Car(++COUNT, "Schevrolet Impala", 1967));
        car.add(new Car(++COUNT, "Nissan Premier", 1997));
        car.add(new Car(++COUNT, "Кузов на колёсах", 2021));
        car.add(new Car(++COUNT, "Летит крузак двухсотый", 2034));
    }

    @Override
    public List<Car> carList(int id) {
        return car.stream().limit(id).toList();
    }

}
