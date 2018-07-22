package by.oksana.lesson7.CarExeption;

public class MyCarExeption extends Exception {

    private String model;

    public MyCarExeption(String model) {
        this.model = model;
    }

    public void getMyMessage() {
        System.out.println("Автомобиль " + this.model +" не заводится!");
    }
}
