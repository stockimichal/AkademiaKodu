import java.util.ArrayList;
import java.util.List;

public class Category {



    private String name;

    public Category(String name) {
        this.name = name;
    }
    public String toString(){

        return getCategory();
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Category category   = new Category("PRalka");
        Category category1 = new Category("Laptopy");

        products.add(new Product("Bosch", "MOdel najnowysz", category));
        products.add(new Product("Zimmens", "Zielony", category));

        products.add(new Product("Macbook","High tech", category1));
        products.add(new Product("Lenovo","Mega Fajny", category1));

        for (Product product: products){
            System.out.println(product);
        }
    }
}
