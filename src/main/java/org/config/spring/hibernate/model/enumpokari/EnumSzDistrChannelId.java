/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
*   POKARI: ArCustomer
* 
*   Channel distribusi yang ada diAIO dengan dibagi menjadi:
*   EMPTY(-1, "", "KOSONG"),
*   TM(0, "TM", "Traditional Market (Kaki lima, Grosir)"),
*   MM(1, "MM", "Modern Market (Hypermarket, Supermarket, Minimarket)");
* 
*/
public enum EnumSzDistrChannelId {
    EMPTY(-1, "", "KOSONG"),
    TRADITIONAL_MARKET(0, "TM", "TM : Traditional Market (Kaki lima, Grosir)"),
    MODERN_MARKET(1, "MM", "MM : Modern Market (Hypermarket, Supermarket, Minimarket)");
    
    private int intCode;
    private String stringCode;
    private String description;
    
    private EnumSzDistrChannelId(int intCode, String strCode, String description){
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
