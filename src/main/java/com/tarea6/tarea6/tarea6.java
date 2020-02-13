package com.tarea6.tarea6;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tarea6 {

    POINT quadrant;
    @RequestMapping("/")
    public String index(@RequestParam int x, int y) {
        setValues(x,y);
        return findQuadrant();
    }

    static final class POINT {
        private final int x;
        public int y;

        POINT(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void setValues(int x_val, int y_val) {
        quadrant = new POINT(x_val, y_val);
    }

    public String findQuadrant() {
        if (quadrant.x > 0 && quadrant.y > 0) {
            return "Quadrant 1";
        }
        else if (quadrant.x < 0 && quadrant.y > 0) {
            return "Quadrant 2";
        }
        else if (quadrant.x < 0 && quadrant.y < 0) {
            return "Quadrant 3";
        }
        else if (quadrant.x > 0 && quadrant.y < 0) {
            return "Quadrant 4";
        }
        return "Point on axis";
    }
}
