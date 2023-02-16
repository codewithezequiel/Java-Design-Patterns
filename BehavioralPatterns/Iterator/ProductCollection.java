package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

import BehavioralPatterns.Iterator.Interface.Iterator;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
      products.add(product);
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private ProductCollection productHistory;
        private int index;

        public ListIterator(ProductCollection productHistory) {
            this.productHistory = productHistory;
        }

        @Override
        public Product current() {
            return productHistory.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return (index < productHistory.products.size());
        }

        @Override
        public void next() {
            index++;   
        }

    }
}
