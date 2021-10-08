package com.example.M2_Testing_David_Sans.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SmartPhones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String manufacturer;
private String model;
private Double price;
private Integer mpixel;
private Boolean huella;
private Integer ram;


    public SmartPhones() {
    }

    public SmartPhones(Long id, String manufacturer, String model, Double price, Integer mpixel, Boolean huella, Integer ram) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.mpixel = mpixel;
        this.huella = huella;
        this.ram = ram;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMpixel() {
        return mpixel;
    }

    public void setMpixel(Integer mpixel) {
        this.mpixel = mpixel;
    }

    public Boolean getHuella() {
        return huella;
    }

    public void setHuella(Boolean huella) {
        this.huella = huella;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhones{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", mpixel=" + mpixel +
                ", huella=" + huella +
                ", ram=" + ram +
                '}';
    }
}
