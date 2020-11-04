package pl.bykowski.thymeleafhelloworld;

public class Car {
    private String model;
    private String mark;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
