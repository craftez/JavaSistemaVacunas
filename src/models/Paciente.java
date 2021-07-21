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
public class Paciente {
  private String cedula;
  private String nombreCompleto;
  private GrupoDeRiesgo grupoDeRiesgo;
  private LibroDeVacunas vacunas;
  private String telefono;

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public GrupoDeRiesgo getGrupoDeRiesgo() {
        return grupoDeRiesgo;
    }

    public LibroDeVacunas getVacunas() {
        return vacunas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setGrupoDeRiesgo(GrupoDeRiesgo grupoDeRiesgo) {
        this.grupoDeRiesgo = grupoDeRiesgo;
    }

    public void setVacunas(LibroDeVacunas vacunas) {
        this.vacunas = vacunas;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", grupoDeRiesgo=" + grupoDeRiesgo + ", vacunas=" + vacunas + ", telefono=" + telefono + '}';
    }
  
  
}
