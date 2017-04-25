package com.heysteve.heygym.heycore.main;

import com.heysteve.heygym.heycore.business.SessionBO;
import com.heysteve.heygym.heycore.model.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by martinh on 26/3/2017.
 */
//Primer commit Daro
public class HeyGymMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("/config/BeanLocations.xml");

        SessionBO sessionBO = (SessionBO)appContext.getBean("sessionBO");

        Session session = new Session();
        session.setDescriptionPrueba("mensaje de prueba");

        sessionBO.save(session);


    }

}
