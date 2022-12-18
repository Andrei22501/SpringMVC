package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private List<Car> car;
    private static int COUNT;
    {
    car = new ArrayList<>();

    car.add(new Car(++COUNT,"Black Angus(Burger)", 1998));
    car.add(new Car(++COUNT, "Schevrolet Impala", 1967));
    car.add(new Car(++COUNT, "Nissan Premier", 1997));
    car.add(new Car(++COUNT, "Кузов на колёсах", 2021));
    car.add(new Car(++COUNT,"Летит крузак двухсотый", 2034));
    }
    public  List<Car> carList(){
        return car;
    }

    public Car show(int id){
        return car.stream().filter(person-> person.getNumber() == id).findAny().orElse(null);
    }
}
