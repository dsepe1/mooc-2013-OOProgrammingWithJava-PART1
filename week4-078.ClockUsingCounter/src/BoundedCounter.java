/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        if (upperLimit > 0 && upperLimit < 60) {
            this.upperLimit = upperLimit;
        }
    }
    
    public void next() {
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int startingValue) {
        if (startingValue >=0 && startingValue <= upperLimit) {
            this.value = startingValue;
        }
    }
}
