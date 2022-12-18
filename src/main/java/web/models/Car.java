package web.models;

public class Car {
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

    public int getManufacture() {
        return manufacture;
    }

    public void setManufacture(int manufacture) {
        this.manufacture = manufacture;
    }
}
