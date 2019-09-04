/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String nameAtStart, double priceAtStart, int quantityAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.quantity = quantityAtStart;
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", quantity " + this.quantity);
    }
}
