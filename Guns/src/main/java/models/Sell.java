/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.util.Date;

/**
 *
 * @author Dante
 */
@Entity
@Table(name="sell")
public class Sell {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="user")
    private int user;
    
    @Column(name="gun")
    private int gun;
    
    @Column(name="date")
    private Date fechaCompra;
    
    public Sell(){};
    
    public Sell(int user, int gun, Date fechaCompra){
        this.user = user;
        this.gun = gun;
        this.fechaCompra = fechaCompra;
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
     * @return the user
     */
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }

    /**
     * @return the gun
     */
    public int getGun() {
        return gun;
    }

    /**
     * @param gun the gun to set
     */
    public void setGun(int gun) {
        this.gun = gun;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return fechaCompra;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    public String toString(){
        return "Venta id = " + id + "arma id = " + gun + " user = " + user + " fecha de compra = " + fechaCompra;
    }
}
