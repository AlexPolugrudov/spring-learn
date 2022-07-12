package org.example;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music {


    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroy");
    }

    @Override
    public String getSong() {
        return "Moon Sonata";
    }
}
