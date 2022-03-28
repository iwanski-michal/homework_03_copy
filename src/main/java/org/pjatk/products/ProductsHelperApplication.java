package org.pjatk.products;

import java.util.ArrayList;

public class ProductsHelperApplication {

    public static void main(String[] args){
        System.out.println("działam");

        ArrayList<Product> Products = new ArrayList<>();
        Products.add(new Product("product1", 500));
        Products.add(new Product("product2", 50));
        Products.add(new Product("product3", 300));
        Products.add(new Product("product4", 1999));
        Products.add(new Product("product5", 1));
        //sortowanie
        ArrayList<Product> Sorted = ProductsSorter.sort(Products);
        for (Product product : Sorted) {
            System.out.println(product.getPrice());
            System.out.println(product.getName());
        }
        //najdrozszy
        Product theCheapest = ProductsSorter.theCheapest(Products);
        System.out.println("Najdroższy");
        System.out.println(theCheapest.getPrice());
        System.out.println(theCheapest.getName());
        //najtanszy
        Product theMostExpensive = ProductsSorter.mostExpensive(Products);
        System.out.println("Najtańszy");
        System.out.println(theMostExpensive.getPrice());
        System.out.println(theMostExpensive.getName());
        //najtanszych kilka produktów
        ArrayList<Product> TheCheapestProducts = ProductsSorter.theCheapest(Products, 4);
        System.out.println("Najtańsze produkty:");
        for (Product product : TheCheapestProducts) {
            System.out.println(product.getPrice());
            System.out.println(product.getName());
        }

        DiscountCalculator calculator = new DiscountCalculator();
//        calculator.products = Products;
        calculator.setProducts(Products);
        calculator.discountByPercentage(300, 5);

        for (Product product : calculator.getProducts()) {
            System.out.println(product.getPrice());
            System.out.println(product.getName());
        }






//        names.add("Jan");
//        names.add("Adam");
//        names.add("Ola");
//        names.add("Ania");
//        names.add("Maciej");
//        names.add("Krzysztof");
//
//        System.out.println("Ola znajduje się na indeksie: " + names.indexOf("Ola"));
//
//        names.remove("Jan");
//                //Adam, Ola, Ania, Maciej, Krzysztof
//
//        names.remove(2);
//                // usunie Anię, bo nastąpi przeindeksowanie - Jan już jest usunięty, więc na indeksie będzie Ania
//                //Adam, Ola, Maciej, Krzysztof
//        names.add(3, "Mateusz");
//                // wstawi Mateusza przed Krzysztofa
//                //Adam, Ola, Maciej, Mateusz, Krzysztof
//
//        System.out.println("Ilość imion: "+ names.size()+"\noto one:");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        System.out.println("Na indeksie 2 jest "+ names.get(2));
//        if(names.size()>0)
//            System.out.println("Ostatni na liście jest "+ names.get(names.size()-1));
//
    }
}
