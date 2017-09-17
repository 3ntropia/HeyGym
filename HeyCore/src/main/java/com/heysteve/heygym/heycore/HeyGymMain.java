package com.heysteve.heygym.heycore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.heysteve.heygym.heycore.data.CreateDebugData;


@SpringBootApplication
public class HeyGymMain {


    public static void main(String[] args) {
        SpringApplication.run(HeyGymMain.class, args);
        CreateDebugData.initialize();
    }
    
    
    
    //Daro: Que es esto mar? lo borramos?
    /*@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }*/
}

//Daro: Que es esto mar? lo borramos?
/*
@SpringBootApplication
public class HeyGymMain extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HeyGymMain.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HeyGymMain.class, args);
    }

}*/
