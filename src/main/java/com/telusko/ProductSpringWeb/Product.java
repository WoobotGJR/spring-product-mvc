package com.telusko.ProductSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // auto-generated getters and setters
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String place;
    private int warranty;

    public Product() {
    }

    public Product(String name, String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }
}
/*
    Аннотация @Data является частью проекта Lombok, который является библиотекой для уменьшения количества бойлерплейта
    кода в Java-проектах. Аннотация @Data генерирует методы toString, equals, hashCode, getter и setter для всех
    полей класса.

    Аннотация @GeneratedValue(strategy = GenerationType.IDENTITY) используется в контексте JPA (Java Persistence API),
    часто совместно с аннотацией @Id, чтобы указать способ генерации значений для первичных ключей в базе данных.
    @GeneratedValue(strategy = GenerationType.IDENTITY) указывает JPA на то, что значения первичных ключей для этой
    сущности будут генерироваться базой данных с использованием автоматического инкремента, если база данных
    поддерживает эту функциональность.
*/