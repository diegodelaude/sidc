
package com.sidc.controllers;

import com.sidc.clases.Medico;
import com.sidc.main.img.MainSwing;
import org.hibernate.Session;

public class ControllerMedico {

    public static void insertarMedico(Medico m) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
    
    public static Medico getMedicoByMatricula(int matricula) {
        Session session = MainSwing.sessionFactory.openSession();
        session.beginTransaction();
        Medico m = session.get(Medico.class, matricula);
        session.getTransaction().commit();
        session.close();
        return m;
    }
    public static boolean verificar(int matricula, String contrase�a){
        Medico m = getMedicoByMatricula(matricula);
        if(m.getContrase�a().equals(contrase�a)){
            return true;
        }
        return false;
    }
}
