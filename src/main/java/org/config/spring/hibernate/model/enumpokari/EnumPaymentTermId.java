/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: ArCustomer
* 
*    -TOP dari Kredit yang diberikan ke Outlet, definisikan sebagai berikut :
*    "TOP (Batas Pembayaran ) Kredit):                                                                                                       0 Hari 
*    7 Hari 
*    10 Hari 
*    14 Hari
*    21 Hari"
*
*    EMPTY(-1, "", "KOSONG"),
*    HARI_0(0, "0 Hari", "Pembayaran 0 Hari"),
*    HARI_7(7, "7 Hari", "Pembayaran 7 Hari"),
*    HARI_10(10, "10 Hari", "Pembayaran 10 Hari"),
*    HARI_14(14, "14 Hari", "Pembayaran 14 Hari"),
*    HARI_21(21, "21 Hari", "Pembayaran 21 Hari");
*/    
public enum EnumPaymentTermId {
    EMPTY(-1, "", "KOSONG"),
    HARI_0(0, "0 Hari", "Pembayaran 0 Hari"),
    HARI_7(7, "7 Hari", "Pembayaran 7 Hari"),
    HARI_10(10, "10 Hari", "Pembayaran 10 Hari"),
    HARI_14(14, "14 Hari", "Pembayaran 14 Hari"),
    HARI_21(21, "21 Hari", "Pembayaran 21 Hari");
    
    private int intCode;
    private String stringCode;
    private String description;
    
    private EnumPaymentTermId(int intCode, String strCode, String description){
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
