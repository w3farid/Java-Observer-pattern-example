/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

/**
 *
 * @author farid
 */
public class App {
    
    public static void main(String[] args){
        Person person = new Person("TGA");
        Person person2 = new Person("Dream 71");
        
        Product product = new Product("IDB", "Training", "Not Available");
        product.registerObserver(person);
        product.registerObserver(person2);
        
        //now product is available
        product.setAvailability("Available");
    }
    
}
