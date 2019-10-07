/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        Random random = new Random();
        double chance = random.nextDouble();
        for (int i = 0; i < this.width; i++) {
            // If the probability of nextDouble() is less than the density,
            // then a star * will print
            // The reason it has to be "less" is because that's the window nextDouble()
            // has to fall below... I guess that's one way of explaining it to myself.
            if (chance <= this.density) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            chance = random.nextDouble();
        }
        System.out.println("");
    }
    
}
