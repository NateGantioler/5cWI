package at.gan.Interface.Store;

import java.util.ArrayList;
import java.util.List;

public class GUI {
    private List<Product> Products = new ArrayList<Product>();

    public void AddProduct(Product prod){
        Products.add(prod);
    }

    public void getProducts() {
        for (Product p : Products) {
            System.out.println(p.getName() + " " + p.getPrice());
        }
    }
}
