package com.sidc.controllers;

import com.sidc.clases.HistoriaClinica;
import com.sidc.main.img.MainSwing;
import org.hibernate.Session;

public class ControllerHistoriaClinica {

    public static void addHistoriaClinica(HistoriaClinica hc) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();

        session.save(hc);

        session.getTransaction().commit();
        session.close();
    }

    public static HistoriaClinica HistorialPorId(int id) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        HistoriaClinica hc = new HistoriaClinica();
        if (hc.getId() == id) {
            return hc;
        }
        session.close();
        return null;
    }
}
