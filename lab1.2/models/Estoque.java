package models;

import java.util.*;

public class Estoque {
    
    private Map<Integer, Product> products;

    public Estoque() {
        this.products = new HashMap<>();
    }

    public boolean saveProduct(int id, String name, String desc, double price) {
        if (!this.products.containsKey(id)) {
            return false;
        }
        
        this.products.put(id, new Product(id, name, desc, price));
        return true;
    }

    public Product getProduct(int id) {
        return this.products.get(id);
    }
}
