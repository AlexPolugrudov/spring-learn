package org.example;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class RapMusic implements Music {


    @Override
    public String getSong() {
        return "Big City Life";
    }
}
