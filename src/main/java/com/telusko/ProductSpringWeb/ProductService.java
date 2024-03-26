package com.telusko.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDB db;
    List<Product> products = new ArrayList<>();

    public Product addProduct(Product p) {
        return db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }


    public Product getProduct(String name) {
        return db.findByName(name);
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str)) prods.add(p);
        }

        return prods;
    }
}
/*
    @Service - это аннотация, используемая в Spring Framework для пометки классов, которые выполняют бизнес-логику в
    вашем приложении. Она является частью механизма внедрения зависимостей Spring и обычно применяется к классам,
    которые служат в качестве сервисов или компонентов.

    Когда вы помечаете класс аннотацией @Service, Spring автоматически обнаруживает его и управляет его жизненным
    циклом, создавая экземпляры класса, инжектируя их в другие компоненты, если это необходимо,
    и обеспечивая управление транзакциями.
*/
