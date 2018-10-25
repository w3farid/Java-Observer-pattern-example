/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author farid
 */
public class Person implements Observer {

    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hello "+personName+", Product is now "+arg+" on flipkart");
    }
    
    

}
