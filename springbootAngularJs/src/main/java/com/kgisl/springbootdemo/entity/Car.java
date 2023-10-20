package com.kgisl.springbootdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Car {
    // id
    // name
    // model
    // fuelType
    // carType
    // price
    // seater
    // color
    // transmission
    // year

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String model;

    @Column
    private String fuelType;

    @Column
    private String carType;

    @Column
    private String price;

    @Column
    private int seater;

    @Column
    private String color;

    @Column
    private String transmission;

    @Column
    private String year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSeater() {
        return seater;
    }

    public void setSeater(int seater) {
        this.seater = seater;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Car() {
    }

    public Car(Long id, String name, String model, String fuelType, String carType, String price, int seater,
            String color, String transmission,String year) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.fuelType = fuelType;
        this.carType = carType;
        this.price = price;
        this.seater = seater;
        this.color = color;
        this.transmission = transmission;
        this.year=year;
    }

    public Car(String name, String model, String fuelType, String carType, String price, int seater, String color,
            String transmission,String year) {
        this.name = name;
        this.model = model;
        this.fuelType = fuelType;
        this.carType = carType;
        this.price = price;
        this.seater = seater;
        this.color = color;
        this.transmission = transmission;
        this.year=year;
    }

}
