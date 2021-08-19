package tableModels;

import ds.ListaSimple;
import javax.swing.table.AbstractTableModel;
import models.Paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ez
 */
public class PacientesTableModel extends AbstractTableModel {

    private String[] columnNames = {
        "Cédula",
        "Nombre",
        "Telefono",
        "Grupo De Riesgo",
        "Fecha Primera Dosis",
        "Fecha Segunda Dosis",
        "Tipo Vacuna",
        "Esquema Completo"
    };
    private static ListaSimple<Paciente> pacientes;

    public PacientesTableModel(ListaSimple<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return pacientes.getSize();
    }

    public Object getValueAt(int row, int col) {
        Paciente pasciente = pacientes.getValueAt(row + 1);

        if (col == 0) {
            return pasciente.getCedula();
        }

        if (col == 1) {
            return pasciente.getNombreCompleto();
        }

        if (col == 2) {
            return pasciente.getTelefono();
        }

        if (col == 3) {
            return pasciente.getGrupoDeRiesgo();
        }

        if (col == 4) {
            return pasciente.getTipoVacuna();
        }

        if (col == 5) {
            return pasciente.getFechaPrimeraDosis();
        }

        if (col == 6) {
            return pasciente.getFechaSegundaDosis();
        }

        if (col == 7) {
            return pasciente.getEsquemaCompleto();
        }

        return null;
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
