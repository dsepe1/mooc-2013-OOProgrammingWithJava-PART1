/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
public class Multiplier {
    private int multiplier;
    
    public Multiplier(int number) {
        this.multiplier = number;
    }
    
    public int multiply(int otherNumber) {
        int product = otherNumber * this.multiplier;
        return product;
    }
}
