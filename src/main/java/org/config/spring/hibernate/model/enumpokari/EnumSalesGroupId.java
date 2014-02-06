/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: Sp_Employuee
* 
*    Group Sales :
*     '- Canvass  = Canvassing 
*     '- Spreader = Spreader 
*     '- TO GR     = Taking Order Grosir 
*     '- TO MM   = Taking Order Modern Market 
*     '- TO Oth    = Taking Order Other 
*
*    EMPTY(-1, "", "KOSONG"),
*    CANVASS(0, "- CANVASS", "Canvass"),
*    SPREADER(1, "- SPREADER", "Spreader"),
*    TAKING_ORDER_GROSIR(2, "- TO GR", "Taking Order Grosir"),
*    TAKING_ORDER_MODERN_MARKET(3, "- TO MM", "Taking Order Modern Market"),
*    TAKING_ORDER_OTHER(5, "- TO OTH", "Taking order Other");
*/    
public enum EnumSalesGroupId {
    EMPTY(-1, "", "KOSONG"),
    CANVASS(0, "- CANVASS", "Canvass"),
    SPREADER(1, "- SPREADER", "Spreader"),
    TAKING_ORDER_GROSIR(2, "- TO GR", "TO GR : Taking Order Grosir"),
    TAKING_ORDER_MODERN_MARKET(3, "- TO MM", " TO MM : Taking Order Modern Market"),
    TAKING_ORDER_OTHER(5, "- TO OTH", "TO OTH : Taking order Other");
    
    private int intCode;
    private String stringCode;
    private String description;
    private EnumSalesGroupId(int intCode, String strCode, String description){
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
