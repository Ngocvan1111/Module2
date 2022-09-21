package ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.service;

import ss12_java_collection_framwork.excercise.practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;

import java.util.Comparator;

public class PriceComparableHighToLow implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice()<o2.getPrice()) return 1;
        else if(o1.getPrice()> o2.getPrice()) return  -1;
        else return 0;
    }
}
