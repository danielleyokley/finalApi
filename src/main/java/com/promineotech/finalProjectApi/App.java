package com.promineotech.finalProjectApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.promineotech.finalProjectApi")
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
//    	String password = "abc123";
//    	String hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
    	SpringApplication.run(App.class, args);
    }
}
