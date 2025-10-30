/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import models.User;

/**
 *
 * @author Dante
 */
public class UserController {

    public String createUser(String name, String lastName, String city) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernateTest.cfg.xml").
                addAnnotatedClass(User.class).
                buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            User user = new User(name, lastName, city);

            session.beginTransaction();

            //El método en el video es save(), pero por la versión se ha renombrado a persist
            session.persist(user);
            session.getTransaction().commit();
            sessionFactory.close();

            return "Usuario Creado";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Error al registrar usuario";
    }

    public String deleteUser(int id) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernateTest.cfg.xml").
                addAnnotatedClass(User.class).
                buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            //Este método en el video es get(), pero el mismo error de antes, la versión
            User user = session.find(User.class, id);
            session.remove(user);
            session.getTransaction().commit();
            sessionFactory.close();

            return "Usuario Eliminado Correctamente";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Error al eliminar usuario";
    }

    public String updateUser(int id, String name) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernateTest.cfg.xml").
                addAnnotatedClass(User.class).
                buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            //Este método en el video es update(), pero el mismo error de antes, la versión
            User user = session.find(User.class, id);
            user.setName(name);
            session.merge(user);
            session.getTransaction().commit();
            sessionFactory.close();

            return "Usuario Modificado Correctamente";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Error al actualizar usuario";
    }
    
    public String getUser(int id) {
        SessionFactory sessionFactory = new Configuration().
                configure("hibernateTest.cfg.xml").
                addAnnotatedClass(User.class).
                buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            User user = session.find(User.class, id);
            session.getTransaction().commit();
            sessionFactory.close();

            return user.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Error al obtener usuario, puede no existir";
    }
}
