package com.college;

import javax.persistence.Entity;
import javax.persistence.Id;
//OneToOne Mapping.
@Entity
public class Laptop {

    @Id
    private int lid;

    private String brand;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}