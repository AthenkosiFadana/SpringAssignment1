package com.springassignment.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@Controller
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/courses")
    @ResponseBody
    public String getCourses() {
        return "<h2>Foundation courses offered in the Computer Science Department:</h2>" +
                "<p>CSC 113F, CSC 123F</p>" +
                "<h2>Undergraduate courses offered in the Computer Science Department:</h2>" +
                "<p>CSC 313, CSC 312, CSC 323, CSC 324, CSC 223</p>" +
                "<h2>Honours courses offered in the Computer Science Department:</h2>" +
                "<p>CSC 501, CSC 512, CSC 513, CSC 515</p>";
    }
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
