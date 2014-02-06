/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Bagus Winarno
 */

@Entity
@Table(name = "t_master_outlet")
public class TMasterOutlet implements Serializable {
    //@EmbeddedId
    //protected TMasterOutletPK tMasterOutletPK;
    @Id
    @Basic(optional = true)
    @Column(name = "scy_out_code", length = 15, nullable = false)
    private String scyOutCode;

    @Column(name = "mslsout_code", length = 25)
    private String mslsoutCode;    
    @Column(name = "mslsout_desc", length = 100)
    private String mslsoutDesc;
    
//PENANDA    
    //SEMENTARA BELUM DIGUNAKAN
    @Column(name = "baru")
    private Boolean baru;
    @Column(name = "allow_transfer")
    private Boolean allowTransfer;
    @Column(name = "aktif")
    private Boolean aktif;
    
    @Column(name = "type_id", length = 25)
    private String typeId;
    @Column(name = "type_nm", length = 50)
    private String typeNm;
    @Column(name = "group_id", length = 25)
    private String groupId;
    @Column(name = "group_nm", length = 50)
    private String groupNm;
    @Column(name = "sub_grp_id", length = 25)
    private String subGrpId;
    @Column(name = "sub_grp_nm", length = 50)
    private String subGrpNm;
    @Column(name = "class_id", length = 25)
    private String classId;
    @Column(name = "class_nm", length = 50)
    private String classNm;
    @Column(name = "bsize_id", length = 25)
    private String bsizeId;
    @Column(name = "bsize_nm", length = 50)
    private String bsizeNm;
    @Column(name = "chain_id", length = 25)
    private String chainId;
    @Column(name = "chain_nm", length = 50)
    private String chainNm;
    @Column(name = "lok_id", length = 25)
    private String lokId;
    @Column(name = "lok_nm", length = 50)
    private String lokNm;
    @Column(name = "disti_id", length = 25)
    private String distiId;
    @Column(name = "distiNm", length = 50)
    private String distiNm;
    @Column(name = "area_id", length = 25)
    private String areaId;
    @Column(name = "area_nm", length = 50)
    private String areaNm;
    @Column(name = "sales_code", length = 25)
    private String salesCode;
    @Column(name = "sales_nm", length = 50)
    private String salesNm;
    @Column(name = "nas_sales_code", length = 25)
    private String nasSalesCode;
    @Column(name="nas_sales_nm", length = 50)
    private String nasSalesNm;
    @Column(name = "kaccId", length = 25)
    private String kaccId;
    @Column(name = "kaccNm", length = 50)
    private String kaccNm;
    
    /**
     * INPUT JHEADER
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterOutlet")
    @Fetch(FetchMode.JOIN)
    
    private Set<JHeader> jHeaderSet;
    public Set<JHeader> getjHeaderSet() {
        return jHeaderSet;
    }
    public void setjHeaderSet(Set<JHeader> jHeaderSet) {
        this.jHeaderSet = jHeaderSet;
    }
    
    /**
     * INPUT MASTER OUTLET
     */
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tMasterOutlet")
//    @Fetch(FetchMode.JOIN)
//    private Set<Outlet> outletSet;
//
//    public Set<Outlet> getOutletSet() {
//        return outletSet;
//    }
//
//    public void setOutletSet(Set<Outlet> outletSet) {
//        this.outletSet = outletSet;
//    }
    

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
    
    public String getMslsoutDesc() {
        return mslsoutDesc;
    }

    public void setMslsoutDesc(String mslsoutDesc) {
        this.mslsoutDesc = mslsoutDesc;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeNm() {
        return typeNm;
    }

    public void setTypeNm(String typeNm) {
        this.typeNm = typeNm;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupNm() {
        return groupNm;
    }

    public void setGroupNm(String groupNm) {
        this.groupNm = groupNm;
    }

    public String getSubGrpId() {
        return subGrpId;
    }

    public void setSubGrpId(String subGrpId) {
        this.subGrpId = subGrpId;
    }

    public String getSubGrpNm() {
        return subGrpNm;
    }

    public void setSubGrpNm(String subGrpNm) {
        this.subGrpNm = subGrpNm;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassNm() {
        return classNm;
    }

    public void setClassNm(String classNm) {
        this.classNm = classNm;
    }

    public String getBsizeId() {
        return bsizeId;
    }

    public void setBsizeId(String bsizeId) {
        this.bsizeId = bsizeId;
    }

    public String getBsizeNm() {
        return bsizeNm;
    }

    public void setBsizeNm(String bsizeNm) {
        this.bsizeNm = bsizeNm;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getChainNm() {
        return chainNm;
    }

    public void setChainNm(String chainNm) {
        this.chainNm = chainNm;
    }

    public String getLokId() {
        return lokId;
    }

    public void setLokId(String lokId) {
        this.lokId = lokId;
    }

    public String getLokNm() {
        return lokNm;
    }

    public void setLokNm(String lokNm) {
        this.lokNm = lokNm;
    }

    public String getDistiId() {
        return distiId;
    }

    public void setDistiId(String distiId) {
        this.distiId = distiId;
    }

    public String getDistiNm() {
        return distiNm;
    }

    public void setDistiNm(String distiNm) {
        this.distiNm = distiNm;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaNm() {
        return areaNm;
    }

    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getSalesNm() {
        return salesNm;
    }

    public void setSalesNm(String salesNm) {
        this.salesNm = salesNm;
    }

    public String getNasSalesCode() {
        return nasSalesCode;
    }

    public void setNasSalesCode(String nasSalesCode) {
        this.nasSalesCode = nasSalesCode;
    }

    public String getNasSalesNm() {
        return nasSalesNm;
    }

    public void setNasSalesNm(String nasSalesNm) {
        this.nasSalesNm = nasSalesNm;
    }

    public String getKaccId() {
        return kaccId;
    }

    public void setKaccId(String kaccId) {
        this.kaccId = kaccId;
    }

    public String getKaccNm() {
        return kaccNm;
    }

    public void setKaccNm(String kaccNm) {
        this.kaccNm = kaccNm;
    }

    public String getScyOutCode() {
        return scyOutCode;
    }

    public void setScyOutCode(String scyOutCode) {
        this.scyOutCode = scyOutCode;
    }

    public String getMslsoutCode() {
        return mslsoutCode;
    }

    public void setMslsoutCode(String mslsoutCode) {
        this.mslsoutCode = mslsoutCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.scyOutCode);
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
        final TMasterOutlet other = (TMasterOutlet) obj;
        if (!Objects.equals(this.scyOutCode, other.scyOutCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return mslsoutCode + "  " + mslsoutDesc;
    }

    
}
