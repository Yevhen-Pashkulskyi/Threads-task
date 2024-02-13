package products;

public class VegetableTrhread extends Thread {
    private String[] vegetables = {"Картопля", "Морква", "Капуста", "Огірок", "Помідор"};

    public void run() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}

