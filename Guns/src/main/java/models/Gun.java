/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

/**
 *
 * @author Isaac
 */
@Entity
@Table(name="gun")
public class Gun {

    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="ammo")
    private String ammo;

    @Column(name="price")
    private int price;
    
    @Column(name="country")
    private String country;
    
    public Gun(){};
    
    public Gun(String name, String ammo, String country, int price){
        this.name = name;
        this.ammo = ammo;
        this.country = country;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastAmmo() {
        return ammo;
    }

    /**
     * @param ammo the ammo to set
     */
    public void setLastAmmo(String ammo) {
        this.ammo = ammo;
    }

    /**
     * @return the city
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    /**
     * @return the city
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return  "Country = " + name + " ammo = " + ammo + " country = " + country;
    }  
  }

