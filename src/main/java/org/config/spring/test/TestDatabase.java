/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.test;

import javax.swing.JFrame;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author yhawin
 */
public class TestDatabase {
    public static void main(String [] args){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("/org/config/ApplicationContext.xml");
        SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
        
        JFrame f = new JFrame();
        f.setTitle("Hello Bos");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        f.setVisible(true);
    }
    
}
