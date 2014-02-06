/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author yhawin
 */
public class TestOperasiString {
    public static void main(String [] args){
        Date tanggal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
        System.out.println(sdf.format(tanggal));
        String nilaiString01 = "---------------------------------------------------------------------------------------------------------------";
        String nilaiString02 = "328       00 51091  MR KIDS TOOTH PASTE BEN-10 50G     0                            0.000.002-        -6.546";
        String nilaiString1 = "-----------------------------------------------------------------------------------------------";
        String nilaiString2 = "PCODE    NAMA BARANG                    .HRG.BELI .JML.BARANG   DISC. ..RP.DISC. JUMLAH.RUPIAH";
        String nilaiString3 = "12058    SLEEK PEWANGI BLUE REF 900 ML/    69.710     3          0,00          0       209.130";
        
        System.out.println(nilaiString01.length());
        System.out.println(nilaiString02.length());
        System.out.println(nilaiString1.length());
        System.out.println(nilaiString2.length());
        System.out.println(nilaiString3.length());
        System.out.println("-------------------------------");
        String test1 = "91090    BB POWDER KW BUTTERCUO 36/150G   197.346     0.002.000 ";
        String test2 = "91090    BB POWDER KW BUTTERCUO 36/150G   197.346     0.002.000  0,00 ";
        String test3 = "328       00 51091  MR KIDS TOOTH PASTE BEN-10 50G     0                         ";
        System.out.println(test1.length());
        System.out.println(test2.length());
        System.out.println(test3.length());
        
        System.out.println("-------------------------------");
        String nilString = "69.710";
        System.out.println(nilString.replaceAll("\\.", "B"));
 
    }
    
}
