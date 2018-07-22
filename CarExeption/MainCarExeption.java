package by.oksana.lesson7.CarExeption;

public class MainCarExeption {
    public static void main (String[] args) {
        Car car1 = new Car("Audi", 100, 12000);
        Car car2 = new Car("Renault", 90, 9500);

        try {
             car1.start();
        } catch (MyCarExeption e) {
            e.getMyMessage();
        }

        System.out.println("******");

        try {
            car2.start();
        } catch (MyCarExeption e) {
            e.getMyMessage();
        }

        System.out.println("******");
    }
}
