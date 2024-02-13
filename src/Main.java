import products.FruitThread;
import products.VegetableTrhread;

public class Main {
    public static void main(String[] args) {
        FruitThread fruitThread = new FruitThread();
        VegetableTrhread vegetableTrhread = new VegetableTrhread();

        vegetableTrhread.start();
        fruitThread.start();

        try {
            fruitThread.join();
            vegetableTrhread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Програма завершена");
    }
}
