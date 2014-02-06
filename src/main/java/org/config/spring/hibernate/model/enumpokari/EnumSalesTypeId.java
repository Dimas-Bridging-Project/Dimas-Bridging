/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: Sp_Employuee
*    Type Sales di klasifikasikan menjadi 3 type :
*     '- CAN = Canvas 
*     '- SPD = Spreader 
*     '- TKO = Taking Order 
*
*    EMPTY(-1, "", "KOSONG"),
*    CANVASS(0, "- CAN", "Canvass"),
*    SPREADER(1, "- SPD", "Spreader"),
*    TAKING_ORDER(2, "- TKO", "Taking Order");
* 
*/    
public enum EnumSalesTypeId {
    EMPTY(-1, "", "KOSONG"),
    CANVASS(0, "- CAN", "CAN : Canvass"),
    SPREADER(1, "- SPD", "SPD : Spreader"),
    TAKING_ORDER(2, "- TKO", "TKO : Taking Order");
    
    private int intCode;
    private String stringCode;
    private String description;
    private EnumSalesTypeId(int intCode, String strCode, String description){
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
