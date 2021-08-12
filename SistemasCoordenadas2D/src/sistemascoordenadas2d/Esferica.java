/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemascoordenadas2d;

/**
 *
 * @author nico1
 */
public class Esferica {
    private double x;
    private double ang1;
    private double ang2;

    public Esferica(double x, double ang1, double ang2) {
        this.x = x;
        this.ang1 = ang1;
        this.ang2 = ang2;
    }

    public Esferica() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getAng1() {
        return ang1;
    }

    public void setAng1(double ang1) {
        this.ang1 = ang1;
    }

    public double getAng2() {
        return ang2;
    }

    public void setAng2(double ang2) {
        this.ang2 = ang2;
    }
    
    
    
    
}

