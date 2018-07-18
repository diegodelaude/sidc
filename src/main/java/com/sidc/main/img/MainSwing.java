package com.sidc.main.img;

import com.sidc.clases.Persona;
import java.util.Date;
import static com.sidc.controllers.ControllerPersona.insertarPersona;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainSwing {

    static boolean logueado;

    public static boolean isLogueado() {
        return logueado;
    }

    public static void setLogueado(boolean logueado) {
        MainSwing.logueado = logueado;
    }

    public static SessionFactory sessionFactory = null;

    public static void main(String[] args) {

        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            logueado = true;

            Date fNac = new Date(1987, 1, 2);
            Date fNac1 = new Date(1984, 16, 3);
            Persona p1 = new Persona("chimuelon", "herrera", 911509, fNac1, "154608141", "julianeherreraok@gmail.com", "root", "constitucion", 1457, 1, "b");
            Persona p = new Persona("josefa", "perez", 345674, fNac, "154668877", "juanitoterere6@gmail.com", "password", "Falsa", 123, 1, "A");

            insertarPersona(p1);

        } catch (Exception e) {
            logueado = false;
            System.err.println("Exception: laputa madre" + e);
            throw new ExceptionInInitializerError(e);

        }

    }

}
