package tableModels;

import ds.Pila;
import javax.swing.table.AbstractTableModel;
import models.GrupoDeRiesgo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ez
 */
public class GruposDeRiesgoTableModel extends AbstractTableModel {

    private String[] columnNames = {
        "Nombre",
        "Descripcion",
        "Edad (Min)",
        "Edad (Max)",
        "Estado"
    };
    private static Pila<GrupoDeRiesgo> grupos;

    public GruposDeRiesgoTableModel(Pila<GrupoDeRiesgo> grupos) {
        this.grupos = grupos;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return grupos.size();
    }

    public Object getValueAt(int row, int col) {
        GrupoDeRiesgo grupoEncontrado = grupos.getValueAt(row + 1);

        if (grupoEncontrado != null) {
            if (col == 0) {
                return grupoEncontrado.getNombre();
            }

            if (col == 1) {
                return grupoEncontrado.getDescripcion();
            }

            if (col == 2) {
                return grupoEncontrado.getEdadMinima();
            }

            if (col == 3) {
                return grupoEncontrado.getEdadMaxima();
            }

            if (col == 4) {
                return grupoEncontrado.getEstado();
            }
        }

        return grupoEncontrado;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Class getColumnClass(int col) {
        if (col == 2 || col == 3) {
            return Integer.class;
        }
        return String.class;
    }
}
