/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.config.spring.hibernate.model.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.config.spring.hibernate.model.pokari.SpEmployeeTarget;

/**
 *
 * @author yhawin
 */
public class SpEmployeeTargetTableModel extends AbstractTableModel{
    List <SpEmployeeTarget> list = new ArrayList <SpEmployeeTarget>();
    //private String[] columnNames = {“Nama”, “NIM”,”Jurusan”, “Alamat”};

    public SpEmployeeTargetTableModel(List <SpEmployeeTarget> list){
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
    //SORRY DIDEFINISIKAN SECARA MANUAL
        return 4;
    }
    
    //NAMA COLUMN DIPAKE JFRAME DIDEFINISIKAN DISINI
    @Override
    public String getColumnName(int column){
        switch(column){
        case 0:
            return ("szYear");
        case 1:
            return("szMonth");
        case 2:
            return("IntWorkingDay");
        case 3:
            return("szWorkplaceId");
        default:
            return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getSpEmployeeTargetPK().getSzYear();
            case 1:
                return list.get(rowIndex).getSpEmployeeTargetPK().getSzMonth();
            case 2:
                return list.get(rowIndex).getIntWorkingDay();
            case 3:
                return list.get(rowIndex).getSzWorkPlaceId();
            default:
                return null;
        }
    }
    
     /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return false;
        } else {
            return true;
        }
    }
    
    //TAMBAHAN KITA
    public SpEmployeeTarget get(int index){
        return list.get(index);
    }

    public void insert(SpEmployeeTarget object){
        list.add(object);
        fireTableRowsInserted(getRowCount()-1,getRowCount()-1);
    }
    public void update(SpEmployeeTarget object, int index){
        list.set(index, object);
        fireTableRowsUpdated(index,index);
    }
    public void delete(int index){
        list.remove(index);
        fireTableRowsDeleted(index,index);
    }
    
}
