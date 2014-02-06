/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: ArCustomer
*    -Status Pembayaran Outlet didefinisikan  menjadi : 
*    0 = Pembayaran secara langsung (Cash)
*    1 = Pembayaran tidak langsung (Kredit)"
*
*   EMPTY(-1, "", "KOSONG"),
*   CASH(0, "CASH", "Pembayaran secara langsung (Cash)"),
*   CREDIT(1, "CREDIT", "Pembayaran tidak langsung (Kredit)");
*/    
public enum EnumBAllowToCredit {
    EMPTY(-1, "", "KOSONG"),
    CASH(0, "CASH", "(Cash) Pembayaran Secara Langsung"),
    CREDIT(1, "CREDIT", "(Credit) Pembayaran Tidak Langsung");
    
    private int intCode;
    private String stringCode;
    private String description;
    
    private EnumBAllowToCredit(int intCode, String strCode, String description){
        this.intCode = intCode;
        this.stringCode = strCode;
        this.description = description;    
    }
    public String getStrCode(){
        return stringCode;
    }
    public int getIntCode(){
        return intCode;
    }
    public String getDescription(){
        return description;
    }
    
}
