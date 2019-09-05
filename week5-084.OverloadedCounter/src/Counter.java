/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        if (this.value == 0) {
            this.check = true;
        }
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, true);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        if (!this.check) {
            return this.value;
        } else if (this.check) { 
            if (this.value < 0) {
                this.value = 0;
            }
        }
        return this.value;
    }
    
    public void increase() {
        this.value++;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }
    
    public void decrease() {
            this.value--;
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.value < 0) {
                this.value = 0;
            } else {
                this.value -= decreaseAmount;
            }
        }
    }
}
