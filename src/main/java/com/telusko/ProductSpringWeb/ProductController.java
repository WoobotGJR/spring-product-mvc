package com.telusko.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    ProductService service;

    // hey, this is for products request
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
}
/*
    Аннотация @CrossOrigin(origins = "http://localhost:3000") в Java используется в веб-приложениях на основе
    фреймворка Spring для настройки CORS (Cross-Origin Resource Sharing), что позволяет веб-приложениям
    выполнять запросы к ресурсам на другом источнике (домене), отличном от их собственного.
*/
