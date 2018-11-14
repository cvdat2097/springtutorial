package vng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.out.println("Server is running...");
        SpringApplication.run(App.class, args);
    }
}
