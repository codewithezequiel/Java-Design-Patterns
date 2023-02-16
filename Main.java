import BehavioralPatterns.Iterator.Product;
import BehavioralPatterns.Iterator.ProductCollection;
import BehavioralPatterns.Iterator.Interface.Iterator;

class Main {
    public static void main(String[] args) {
        var history = new ProductCollection();
        history.add(new Product(1, "a"));
        history.add(new Product(2, "b"));
        history.add(new Product(3, "c"));

       Iterator iterator = history.createIterator();
       while (iterator.hasNext()) {
           var product = iterator.current();
           System.out.println(product);
           iterator.next();
       }
    }

}
