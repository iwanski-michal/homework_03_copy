package org.pjatk.products;

import java.util.ArrayList;

import org.pjatk.products.Product;

public class ProductsSorter {

    //można wykorzystać algorytm sortowania przez wstawiania
    public static ArrayList<Product> sort(ArrayList<Product> products) {
        int i, j;
        for (i = 1; i < products.size(); i++) {
            Product tmp = products.get(i);
            j = i;
//            while ((j > 0) && (products.get(j - 1).price > tmp.price)) {
            while ((j > 0) && (products.get(j - 1).getPrice() > tmp.getPrice())) {
                products.set(j, products.get(j - 1));
                j--;
            }
            products.set(j, tmp);
        }
        return products;
    }

    public static Product mostExpensive(ArrayList<Product> products) {
        ArrayList<Product> Sorted = sort(products);
        Product theMostExpensive = Sorted.get(0);
        return theMostExpensive;
    }


    public static Product theCheapest(ArrayList<Product> products) {
        ArrayList<Product> Sorted = sort(products);
        Product theCheapest = Sorted.get(Sorted.size()-1);
        return theCheapest;
    }

    public static ArrayList<Product> theCheapest(ArrayList<Product> products, int n) {
        ArrayList<Product> Sorted = sort(products);
        ArrayList<Product> CheapestProducts = new ArrayList<>();
        for (int i = 0; i < n; i++){
            CheapestProducts.add(Sorted.get(i));
        }
        return CheapestProducts;
    }
}
