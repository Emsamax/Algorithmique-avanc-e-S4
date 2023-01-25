package com.example.defisfractales;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    public float segement(int n, int x1, int y1, int x2, int y2){
        float dist = ((x2-x1)^2 + (y2-y1)^2);
        //if(n == 0) return dist;
        return 0;
    }

}