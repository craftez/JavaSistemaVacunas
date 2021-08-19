package tableModels;

import ds.ListaSimple;
import javax.swing.table.AbstractTableModel;
import models.Vacuna;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ez
 */
public class VacunasTableModel extends AbstractTableModel {
    private String[] columnNames = {"Nombre", "Farmaceutica", "Dosis"};
    private static ListaSimple<Vacuna> vacunas;
    
    public VacunasTableModel(ListaSimple<Vacuna> vacunas) {
       this.vacunas = vacunas;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public int getRowCount() {
        return vacunas.getSize();
    }
    
    public Object getValueAt(int row, int col) {
        Object temp = null;
        Vacuna vacuna = vacunas.getValueAt(row + 1);
        
        if (col == 0) {
            return vacuna.getNombre();
        }
        
        if (col == 1) {
            return vacuna.getFarmaceutica();
        }
        
        if (col == 2) {
            return vacuna.getDosisRequeridas();
        }
        
        return temp;
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Class getColumnClass(int col) {
        if (col == 2) {
            return Integer.class;
        }
        return String.class;
    }
}
