package com.heysteve.heygym.heycore.main;

import com.heysteve.heygym.heycore.model.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HeyGymMain {
    /*public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("/config/BeanLocations.xml");

        SessionBO sessionBO = (SessionBO)appContext.getBean("sessionBO");

        Session session = new Session();
        session.setDescriptionPrueba("mensaje de prueba");

        sessionBO.save(session);


    }*/

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HeyGymMain.class, args);
    }
}
