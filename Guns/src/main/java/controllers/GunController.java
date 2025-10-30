/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import models.Gun;

/**
 *
 * @author Dante
 */
public class GunController {
  public String createGun(String name, String ammo, String country, int price) {
    SessionFactory sessionFactory = new Configuration().
    configure("hibernateTest.cfg.xml").
    addAnnotatedClass(Gun.class).
    buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      Gun gun = new Gun(name, ammo, price, country);

      session.beginTransaction();

      // El método en el video es save(), pero por la versión se ha renombrado a
      // persist
      session.persist(gun);
      session.getTransaction().commit();
      sessionFactory.close();

      return "Arma Creado";
    } catch (HibernateException e) {
    // } catch (Exception e) {
    // Puede ser eliminado, por qué?
      e.printStackTrace();
    }

    return "Error al registrar arma";
  }

  public String deleteGun(int id) {
    SessionFactory sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").addAnnotatedClass(Gun.class)
        .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      session.beginTransaction();

      // Este método en el video es get(), pero el mismo error de antes, la versión
      Gun gun = session.find(Gun.class, id);
      session.remove(gun);
      session.getTransaction().commit();
      sessionFactory.close();

      return "Arma Eliminado Correctamente";
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al eliminar arma";
  }

  public String updateGun(int id, String name) {
    SessionFactory sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").addAnnotatedClass(Gun.class)
        .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      session.beginTransaction();

      // Este método en el video es update(), pero el mismo error de antes, la versión
      Gun gun = session.find(Gun.class, id);
      gun.setName(name);
      session.merge(gun);
      session.getTransaction().commit();
      sessionFactory.close();

      return "Arma Modificado Correctamente";
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al actualizar arma";
  }

  public String getGun(int id) {
    SessionFactory sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").addAnnotatedClass(Gun.class)
        .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      session.beginTransaction();

      Gun gun = session.find(Gun.class, id);
      session.getTransaction().commit();
      sessionFactory.close();

      return gun.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "Error al obtener arma, puede no existir";
  }
}
