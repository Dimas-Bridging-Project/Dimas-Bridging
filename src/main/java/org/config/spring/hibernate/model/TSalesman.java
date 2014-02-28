/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bagus Winarno
 */
@Entity
@Table(name = "t_salesman")
public class TSalesman implements Serializable {
    @Id
    @Basic(optional = true)
    @Column(name = "sales_id_scy", length = 15, nullable = false)
    private String salesIdScy;
    @Column(name = "sales_id_sap", length = 25 )
    private String salesIdSap;
    @Column(name = "disti_code", length = 25)
    private String distiCode;
    @Column(name = "disti_name", length = 25)
    private String distiName;
    @Column(name = "sales_nm", length = 50)
    private String salesNm;
    @Column(name = "sales_nm_sap", length = 50)
    private String salesNmSap;
    @Column(name = "calamat1", length = 50)
    private String calamat1;
    @Column(name="calamat2", length = 50)
    private String calamat2;
    @Column(name = "ckota", length = 25)
    private String ckota;
    @Column(name = "cpos", length = 25)
    private String cpos;
    @Column(name = "ctelp", length = 25)
    private String ctelp;
    @Column(name = "kode_level", length = 25)
    private String kodeLevel;
    @Column(name = "rptto_code", length = 25)
    private String rpttoCode;
    @Column(name="nas_salesman_code", length = 25)
    private String nasSalesmanCode;
    @Column(name="nas_sales_nm", length = 50)
    private String nasSalesmanNm;

//PENANDA    
    @Column(name = "aktif")
    private Boolean aktif;
    @Column(name = "allow_transfer")
    private Boolean allowTransfer;
    @Column(name = "baru")
    private Boolean baru;
    
    public String getSalesIdScy() {
        return salesIdScy;
    }

    public void setSalesIdScy(String salesIdScy) {
        this.salesIdScy = salesIdScy;
    }

    public String getSalesIdSap() {
        return salesIdSap;
    }

    public void setSalesIdSap(String salesIdSap) {
        this.salesIdSap = salesIdSap;
    }

    public String getDistiCode() {
        return distiCode;
    }

    public void setDistiCode(String distiCode) {
        this.distiCode = distiCode;
    }

    public String getDistiName() {
        return distiName;
    }

    public void setDistiName(String distiName) {
        this.distiName = distiName;
    }

    public String getSalesNm() {
        return salesNm;
    }

    public void setSalesNm(String salesNm) {
        this.salesNm = salesNm;
    }

    public String getSalesNmSap() {
        return salesNmSap;
    }

    public void setSalesNmSap(String salesNmSap) {
        this.salesNmSap = salesNmSap;
    }

    public String getCalamat1() {
        return calamat1;
    }

    public void setCalamat1(String calamat1) {
        this.calamat1 = calamat1;
    }

    public String getCalamat2() {
        return calamat2;
    }

    public void setCalamat2(String calamat2) {
        this.calamat2 = calamat2;
    }

    public String getCkota() {
        return ckota;
    }

    public void setCkota(String ckota) {
        this.ckota = ckota;
    }

    public String getCpos() {
        return cpos;
    }

    public void setCpos(String cpos) {
        this.cpos = cpos;
    }

    public String getCtelp() {
        return ctelp;
    }

    public void setCtelp(String ctelp) {
        this.ctelp = ctelp;
    }

    public String getKodeLevel() {
        return kodeLevel;
    }

    public void setKodeLevel(String kodeLevel) {
        this.kodeLevel = kodeLevel;
    }

    public String getRpttoCode() {
        return rpttoCode;
    }

    public void setRpttoCode(String rpttoCode) {
        this.rpttoCode = rpttoCode;
    }

    public String getNasSalesmanCode() {
        return nasSalesmanCode;
    }

    public void setNasSalesmanCode(String nasSalesmanCode) {
        this.nasSalesmanCode = nasSalesmanCode;
    }

    public String getNasSalesmanNm() {
        return nasSalesmanNm;
    }

    public void setNasSalesmanNm(String nasSalesmanNm) {
        this.nasSalesmanNm = nasSalesmanNm;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public Boolean getAllowTransfer() {
        return allowTransfer;
    }

    public void setAllowTransfer(Boolean allowTransfer) {
        this.allowTransfer = allowTransfer;
    }


    public Boolean getBaru() {
        return baru;
    }

    public void setBaru(Boolean baru) {
        this.baru = baru;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.salesIdScy);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TSalesman other = (TSalesman) obj;
        if (!Objects.equals(this.salesIdScy, other.salesIdScy)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return salesIdSap + "-" + salesNmSap;
    }

    
}
