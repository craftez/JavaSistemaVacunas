/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ez
 */
public class Cita {

    private String tipoDeVacuna;
    private String fechaDeCita;
    private String cedulaPaciente;
    private String nombrePaciente;

    public Cita() {
    }

    public String getFechaDeCita() {
        return fechaDeCita;
    }

    public void setFechaDeCita(String fechaDeCita) {
        this.fechaDeCita = fechaDeCita;
    }

    public String getTipoDeVacuna() {
        return tipoDeVacuna;
    }

    public void setTipoDeVacuna(String tipoDeVacuna) {
        this.tipoDeVacuna = tipoDeVacuna;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public String toString() {
        return "Cita{" + "tipoDeVacuna=" + tipoDeVacuna + ", fechaDeCita=" + fechaDeCita + ", cedulaPaciente=" + cedulaPaciente + ", nombrePaciente=" + nombrePaciente + '}';
    }

    
}
