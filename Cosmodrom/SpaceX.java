package by.oksana.lesson7.Cosmodrom;

public class SpaceX implements IStart {
    @Override
    public boolean test() {
        int random = (int)(Math.random()*10);
        boolean result;
        if (random > 3) {
            System.out.println("random = "+random+"\n Проверка SpaceX прошла успешно");
            result = true;
        } else {
            System.out.println("random = "+random+"\n Проверка SpaceX прошла не успешно");
            result = false;
        }
        return result;
    }

    @Override
    public void startingEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");

    }
}
