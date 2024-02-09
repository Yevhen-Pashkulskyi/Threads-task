package products;

import print.PrintProducts;

public class VegetableTrhread extends Thread{
    private String[] vegetables = {"Картопля", "Морква", "Капуста", "Огірок", "Помідор"};

    public void run() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

