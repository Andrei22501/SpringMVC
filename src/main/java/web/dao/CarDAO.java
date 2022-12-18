package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private List<Car> carList;

    {
    carList = new ArrayList<>();

    carList.add(new Car(1182374L,"Black Angus(Burger)", 1998));
    carList.add(new Car(5169785L, "Schevrolet Impala", 1967));
    carList.add(new Car(20180318L, "Nissan Premier", 1997));
    carList.add(new Car(5152798L, "Кузов на колёсах", 2021));
    carList.add(new Car(20220715L,"Летит крузак двухсотый", 2034));

    }
    public  List<Car> index(){
        return carList;
    }

    public Car show(int id){
        return carList.stream().filter(person-> person.getNumber() == id).findAny().orElse(null);
    }
}
