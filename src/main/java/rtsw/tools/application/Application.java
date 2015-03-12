/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.tools.application;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author b1050502
 */
@SpringBootApplication
public class Application {
    
    private static final Logger log =LoggerFactory.getLogger(Application.class);
    
    @Autowired
    private CamelContext context;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}
