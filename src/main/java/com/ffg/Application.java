package com.ffg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by connor on 9/8/15.
 */
@SpringBootApplication
public class Application  {

    /**
     * Start running the app.
     * @param args
     * 		Commandline arguments to pass to our Spring app.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
