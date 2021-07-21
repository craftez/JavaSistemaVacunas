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
    private Vacuna tipoDeVacuna;
  private String fechaDeCita;
  private Paciente paciente;

    public Vacuna getTipoDeVacuna() {
        return tipoDeVacuna;
    }

    public String getFechaDeCita() {
        return fechaDeCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setTipoDeVacuna(Vacuna tipoDeVacuna) {
        this.tipoDeVacuna = tipoDeVacuna;
    }

    public void setFechaDeCita(String fechaDeCita) {
        this.fechaDeCita = fechaDeCita;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Paciente{" + "tipoDeVacuna=" + tipoDeVacuna + ", fechaDeCita=" + fechaDeCita + ", paciente=" + paciente + '}';
    }
}
