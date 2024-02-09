package products;

import print.PrintProducts;

public class FruitThread extends Thread{
    private String[] fruits = {"Яблуко", "Банан", "Апельсин", "Груша", "Лимон"};

    public void run() {
        for (String fruit : fruits) {
            System.out.println(fruit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

