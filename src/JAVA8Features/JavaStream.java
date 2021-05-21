package JAVA8Features;

import java.awt.List;
import java.util.ArrayList;


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStream {  
    public static void main(String[] args) {  
       java.util. List<Product> productsList = new ArrayList<Product>();   
        productsList.add(new Product(1,"HPLaptop",25000f));  
        productsList.add(new Product(2,"DellLaptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        
        java.util.List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            if(product.price<30000){  
                productPriceList.add(product.price);  
            }  
        }  
        System.out.println(productPriceList);   
}
}