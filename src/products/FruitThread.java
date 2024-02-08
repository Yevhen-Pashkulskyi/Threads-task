package products;

import print.PrintProducts;

public class FruitThread {
    private String[] fruits = {"Яблуко", "Банан", "Апельсин", "Груша", "Лимон"};

    public void run() {
        PrintProducts products = new PrintProducts();
        products.print(fruits);
    }
}

