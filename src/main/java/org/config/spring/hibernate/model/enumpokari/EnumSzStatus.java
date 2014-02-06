/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: ArCustomer
* 
* - Status dari pengcoveran Outlet ,didefinisikan dengan : 
* EMPTY(-1, "", "KOSONG"),
* NONACTIVE(0, "STO", "Outlet tutup sementara dan tidak dapat bertransaksi"),
* ACTIVE(1, "ACT", "Outlet tersebut dapat bertansaksi"),
* DESTROY(2, "CLO", "Outlet yang sudah tidak ada secara fisik dan tidak dapat bertansaksi");
 */    
public enum EnumSzStatus {
    EMPTY(-1, "", "Dikosonging saja"),
    NONACTIVE(0, "STO", "Outlet tutup sementara dan tidak dapat bertransaksi"),
    ACTIVE(1, "ACT", "Outlet tersebut dapat bertansaksi"),
    DESTROY(2, "CLO", "Outlet yang sudah tidak ada secara fisik dan tidak dapat bertansaksi");
    
    private int intCode;
    private String stringCode;
    private String description;
    
    private EnumSzStatus(int intCode, String strCode, String description){
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
