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
@Table(name="user")
public class User {

    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="lastName")
    private String lastName;
    
    @Column(name="city")
    private String city;
    
    public User(){};
    
    public User(String name, String lastName, String city){
        this.name = name;
        this.lastName = lastName;
        this.city = city;
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
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString(){
        return  "Usuario = " + name + " lastName = " + lastName;
    }

}
