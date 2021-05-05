package com.factorialNumber.programsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProgramsDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProgramsDemoApplication.class, args);
    }

    @GetMapping("/factorial/{num}")
    public long fact(@PathVariable int num) {
        long facto = 1;
        for (int i = 1; i <= num; i++) {

            facto = facto * i;

        }
        return facto;
    }

    @GetMapping("/check/{num}")
    public String primeNum(@PathVariable int num) {
        int flag=0,j=0;
        if (num == 0 || num == 1) {
            flag=1;
            //return "is not a prime number";

        } else {
            for (int i = 2; i < num; i++) {
                j=num % i;
                if (j == 0) {
                    //return "  is not a prime number";
                    flag=1;
                    break;
                }
            }
            //if (flag==0){
              //  return "is a prime number";
            //}
        }
       if (flag==1){
            return "is not a prime number";
        }else {
            return "is a prime number";
        }
    }
}
