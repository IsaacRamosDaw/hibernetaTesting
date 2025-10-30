/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import models.Sell;
import java.time.LocalDateTime;

/**
 *
 * @author Dante
 */
public class SellController {
  public String createSell(int user, int gun, LocalDateTime fechaCompra) {
    SessionFactory sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").addAnnotatedClass(Sell.class)
        .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      Sell sell = new Sell(user, gun, fechaCompra);

      session.beginTransaction();

      // El método en el video es save(), pero por la versión se ha renombrado a
      // persist
      session.persist(sell);
      session.getTransaction().commit();
      sessionFactory.close();

      return "Compra Creado";
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al registrar compra";
  }

  public String deleteSell(int id) {
    SessionFactory sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").addAnnotatedClass(Sell.class)
        .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      session.beginTransaction();

      // Este método en el video es get(), pero el mismo error de antes, la versión
      Sell sell = session.find(Sell.class, id);
      session.remove(sell);
      session.getTransaction().commit();
      sessionFactory.close();

      return "Usuario Eliminado Correctamente";
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al eliminar usuario";
  }

  public String getSell(int id) {
    SessionFactory sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").addAnnotatedClass(Sell.class)
        .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      session.beginTransaction();

      Sell sell = session.find(Sell.class, id);
      session.getTransaction().commit();
      sessionFactory.close();

      return sell.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al obtener usuario, puede no existir";
  }
}
