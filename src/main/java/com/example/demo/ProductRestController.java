package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
public class ProductRestController {

    private List<Product> products = new ArrayList<Product>();

    @GetMapping("/")
    public String getMethod() {
        return "welcome to springboot";
    }
    
    

    @PostMapping("/products")
    public String saveProduct(@RequestBody Product p){
        products.add(p);

        return "Product saved successfully";

    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products;
    }
    
    
    @GetMapping("/getProduct/{id}")
    public String getProduct(@PathVariable Integer id){
        for(Product p :products){
            if(p.getId()==id){
                return p.getName();
            }
        }
        return "Not found";

    }
    
}
