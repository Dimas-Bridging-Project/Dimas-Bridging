/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model.enumpokari;

/**
* POKARI: Sp_Employuee
* Id Team di klasifikasikan menjadi 2 :
* '- EXC = Tim Exclusive (Menjual Prodak AIO saja)
* '- MIX = Tim Mixed (Selain Prodak AIO dan prodak lain)
*
* EMPTY(-1, "", "KOSONG"),
*    TIM_EXCLUSIVE(0, "- EXC", "Tim Exclusive (Menjual Prodak AIO saja)"),
*    TIM_MIXED(2, "- MIX", "Tim Mixed (Selain Prodak AIO dan prodak lain)");
*
*/    
public enum EnumSalesTeamId {
    EMPTY(-1, "", "KOSONG"),
    TIM_EXCLUSIVE(0, "- EXC", "EXC : Tim Exclusive (Menjual Prodak AIO saja)"),
    TIM_MIXED(2, "- MIX", "MIX : Tim Mixed (Selain Prodak AIO dan prodak lain)");
    
    private int intCode;
    private String stringCode;
    private String description;
    private EnumSalesTeamId(int intCode, String strCode, String description){
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
