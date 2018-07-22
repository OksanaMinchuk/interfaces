package by.oksana.lesson7.CarExeption;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }
    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws MyCarExeption {

        int x = (int)(Math.random()*20);
        if (x%2 == 0) {
            throw new MyCarExeption(model);
        }
        System.out.println(x+"  Автомобиль "+model+" завелся");
    }
}
