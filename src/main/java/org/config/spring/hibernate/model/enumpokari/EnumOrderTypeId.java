/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: Can_DDeliveryOrder
*Id Type Order di klasifikasikan menjadi :
* - SAL  =  Sales (Transaksi Penjualan)
* - SRE  =  Retur (Transaksi Return)
*           -> SRE - Dalam Pengimputan harus di awali dgn tanda Minus (-)
* 
*    EMPTY(-1, "", "KOSONG"),
*    SALES(0, "- SAL", "- SAL  =  Sales (Transaksi Penjualan)"),
*    RETURN(1, "- SRE", "- SRE  =  Retur (Transaksi Return)");
*/    
public enum EnumOrderTypeId {
    EMPTY(-1, "", "KOSONG"),
    SALES(0, "- SAL", "SAL : Sales (Transaksi Penjualan)"),
    RETURN(1, "- SRE", "SRE  : Retur (Transaksi Return)");
    
    private int intCode;
    private String stringCode;
    private String description;
    
    private EnumOrderTypeId(int intCode, String strCode, String description){
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
