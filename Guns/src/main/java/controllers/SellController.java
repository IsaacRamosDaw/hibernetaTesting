/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import models.Sell;
import java.util.Date;

/**
 *
 * @author Dante
 */
public class SellController {
  public String createSell(int user, int gun, Date fechaCompra) {
    SessionFactory sessionFactory = new Configuration().
    configure("hibernateTest.cfg.xml").
    addAnnotatedClass(Sell.class).
    buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      Sell sell = new Sell(user, gun, fechaCompra);

      session.beginTransaction();

      // El método en el video es save(), pero por la versión se ha renombrado a persist
      session.persist(sell);
      session.getTransaction().commit();
      sessionFactory.close();

      return "Compra Creado";
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al registrar compra";
  }
}
