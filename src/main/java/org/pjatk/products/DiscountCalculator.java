package org.pjatk.products;

import java.util.ArrayList;
import org.pjatk.products.ProductsSorter;

public class DiscountCalculator {

    private ArrayList<Product> products;

    //getters
    public ArrayList<Product> getProducts(){
        return products;
    }
    //setters
    public void setProducts(ArrayList<Product> p){
        products = p;
    }

    /*
        minimumPrice - cena minimalna, od której zaczyna się naliczanie rabatu
        percentage - liczba od 0 do 1, określająca jaki procent rabatu jest przyznany, np 0.1 to 10%
     */
    public void discountByPercentage(double minimumPrice, double percentage) {
        double basketPrice = 0;
        for (Product product : products) {
            basketPrice += product.getPrice();
        }

        if (basketPrice > minimumPrice) {
            for (Product product : products) {
                product.setPrice(product.getPrice()*(100-percentage)*0.01);
//                product.price = product.price * (100 - percentage) * 0.01;
            }
        }
    }

    public void addFreeCompanyGlass(double minimumPrice) {
        double basketPrice = 0;
        for (Product product : products) {
            basketPrice += product.getPrice();
        }
        if (basketPrice > minimumPrice){
            products.add(new Product("FreeCompanyGlass", 0));
        }
    }

    public void threeForPriceOfTwo() {
        int discountProductsCount = products.size()/3;
        products = ProductsSorter.sort(products);
        for (int i = 0; i < discountProductsCount; i++){
//            products.get(i).price = 0;
            products.get(i).setPrice(0.0);
        }

    }

}
