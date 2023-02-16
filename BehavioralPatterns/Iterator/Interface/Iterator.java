package BehavioralPatterns.Iterator.Interface;

import BehavioralPatterns.Iterator.Product;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();

}