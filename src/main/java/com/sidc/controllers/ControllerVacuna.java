package com.sidc.controllers;

import com.sidc.clases.Persona;
import com.sidc.clases.Vacuna;
import static com.sidc.controllers.ControllerPersona.getPersonaByDni;
import com.sidc.main.img.MainSwing;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class ControllerVacuna {

    public static void addVacuna(Vacuna v) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        session.save(v);
        session.getTransaction().commit();
        session.close();
    }

    public static void eliminarVacuna(Vacuna v) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        Vacuna aux = session.get(Vacuna.class, v.getIdVacuna());
        if (aux != null) {
            session.delete(aux);
        }
        session.getTransaction().commit();
        session.close();
    }

    public static List<Vacuna> listarVacunas() {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Vacuna");
        List<Vacuna> list = query.list();
        return list;
    }

    public static Vacuna getVacunaByNombre(String nombre) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        Vacuna v = session.get(Vacuna.class, nombre);
        session.getTransaction().commit();
        session.close();
        return v;
    }

    public static List<Vacuna> listarVacunasByPersona(Persona p) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        Persona pe = getPersonaByDni(p.getDni());
        session.getTransaction().commit();
        session.close();
        return pe.getVacunas();
    }
}