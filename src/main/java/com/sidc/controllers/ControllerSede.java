package com.sidc.controllers;

import com.sidc.clases.Sede;
import com.sidc.clases.Vacuna;
import java.util.List;

import org.hibernate.Session;
import com.sidc.main.img.MainSwing;
import java.util.ArrayList;
import javax.persistence.criteria.CriteriaQuery;

public class ControllerSede {

   
    public static List<Sede> listarSedes() {
        List<Sede> list = new ArrayList();
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        CriteriaQuery<Sede> query = session.getCriteriaBuilder().createQuery(Sede.class);
        query.select(query.from(Sede.class));
        list = session.createQuery(query).list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    public static void insertarSede(Sede s) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();

        session.save(s);

        session.getTransaction().commit();
        session.close();
    }
    
    public static Sede getSedeById(int id) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        Sede s = session.get(Sede.class, id);
        session.getTransaction().commit();
        session.close();
        return s;
    }
    
    public static boolean verificar(int id, String contraseña){
        Sede s = getSedeById(id);
        if(s.getContraseña().equals(contraseña)){
            return true;
        }
        return false;
    }
}
