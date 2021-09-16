package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lisa Ramel
 * Date: 2021-09-16
 * Time: 13:17
 * Project: Kubernetes
 * Copywrite: MIT
 */
@RestController
public class HelloWorldController {

   @GetMapping("/hello")
   public String helloWorld(){
      return "Hello world!";
   }

}
