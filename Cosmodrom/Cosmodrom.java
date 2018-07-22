package by.oksana.lesson7.Cosmodrom;

public class Cosmodrom {

    public static void main (String[] args) {

        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();

        starting(shuttle);
        starting(spaceX);
    }

    private IStart transport;

    private static void starting (IStart transport) {

        if (!transport.test()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            transport.startingEngine();
            for (int i = 10; i >= 1; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
            transport.start();
        }
    }
}
