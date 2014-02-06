/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.test;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bagus Winarno
 */
public class Test2 {
    public static void main(String [] args){
        Date timeStart = new Date();
        try {
            Thread.sleep(2200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date timeFinish = new Date();
        System.out.println((timeFinish.getTime()-timeStart.getTime()) / 1000);
    }
    
}
