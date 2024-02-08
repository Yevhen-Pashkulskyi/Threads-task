package products;

import print.PrintProducts;

public class VegetableTrhread {
    private String[] vegetables = {"Картопля", "Морква", "Капуста", "Огірок", "Помідор"};

    public void run() {
        PrintProducts printProducts = new PrintProducts();
        printProducts.print(vegetables);
    }
}

