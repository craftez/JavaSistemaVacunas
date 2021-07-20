/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ez
 */
public class Vacuna {
    private String brand;
    private String commercialName;

    public Vacuna() {
    }

    public Vacuna(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "brand=" + brand + ", commercialName=" + commercialName + '}';
    }
    
    
}
