package web.models;

public class Car {
    private int id;
    private int number;
    private String model;
    private int manufacture;

    public Car() {
    }

    public Car(int number, String model, int manufacture) {
        this.number = number;
        this.model = model;
        this.manufacture = manufacture;
    }

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", manufacture=" + manufacture +
                '}';
    }

    public int getManufacture() {
        return manufacture;
    }

    public void setManufacture(int manufacture) {
        this.manufacture = manufacture;
    }
}
