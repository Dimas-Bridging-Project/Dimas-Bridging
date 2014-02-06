package org.config.spring.hibernate.model.pokari;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SpEmployeeTargetPK implements Serializable {
        @Column(name = "sz_month", length = 20)
        private String szMonth;
        @Column(name = "sz_year", length = 20)
	private String szYear;

    //WorkPlace workPlace;
    public String getSzYear() {
        return szYear;
    }

    public void setSzYear(String szYear) {
        this.szYear = szYear;
    }

    public String getSzMonth() {
        return szMonth;
    }

    public void setSzMonth(String szMonth) {
        this.szMonth = szMonth;
    }

    @Override
    public String toString() {
        return szYear + "-" + szMonth ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.szMonth);
        hash = 67 * hash + Objects.hashCode(this.szYear);
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
        final SpEmployeeTargetPK other = (SpEmployeeTargetPK) obj;
        if (!Objects.equals(this.szMonth, other.szMonth)) {
            return false;
        }
        if (!Objects.equals(this.szYear, other.szYear)) {
            return false;
        }
        return true;
    }

       

}