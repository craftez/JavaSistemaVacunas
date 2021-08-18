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
    private String telefono;
    private String grupoDeRiesgo;
    private String fechaPrimeraDosis;
    private String fechaSegundaDosis;
    private String tipoVacuna;
    private Boolean esquemaCompleto;

    public Paciente() {
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGrupoDeRiesgo() {
        return grupoDeRiesgo;
    }

    public void setGrupoDeRiesgo(String grupoDeRiesgo) {
        this.grupoDeRiesgo = grupoDeRiesgo;
    }

    public String getFechaPrimeraDosis() {
        return fechaPrimeraDosis;
    }

    public void setFechaPrimeraDosis(String fechaPrimeraDosis) {
        this.fechaPrimeraDosis = fechaPrimeraDosis;
    }

    public String getFechaSegundaDosis() {
        return fechaSegundaDosis;
    }

    public void setFechaSegundaDosis(String fechaSegundaDosis) {
        this.fechaSegundaDosis = fechaSegundaDosis;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public Boolean getEsquemaCompleto() {
        return esquemaCompleto;
    }

    public void setEsquemaCompleto(Boolean esquemaCompleto) {
        this.esquemaCompleto = esquemaCompleto;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", grupoDeRiesgo=" + grupoDeRiesgo + ", fechaPrimeraDosis=" + fechaPrimeraDosis + ", fechaSegundaDosis=" + fechaSegundaDosis + ", tipoVacuna=" + tipoVacuna + ", esquemaCompleto=" + esquemaCompleto + '}';
    }

}
