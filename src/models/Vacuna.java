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
public class Vacuna {
    private String farmaceutica;
    private String nombre;
    private int dosisRequeridas;
    private int minDiasEntreDosis;
    private int maxDiasEntreDosis;
    private String estado;

    public String getFarmaceutica() {
        return farmaceutica;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDosisRequeridas() {
        return dosisRequeridas;
    }

    public int getMinDiasEntreDosis() {
        return minDiasEntreDosis;
    }

    public int getMaxDiasEntreDosis() {
        return maxDiasEntreDosis;
    }

    public String getEstado() {
        return estado;
    }

    public void setFarmaceutica(String farmaceutica) {
        this.farmaceutica = farmaceutica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDosisRequeridas(int dosisRequeridas) {
        this.dosisRequeridas = dosisRequeridas;
    }

    public void setMinDiasEntreDosis(int minDiasEntreDosis) {
        this.minDiasEntreDosis = minDiasEntreDosis;
    }

    public void setMaxDiasEntreDosis(int maxDiasEntreDosis) {
        this.maxDiasEntreDosis = maxDiasEntreDosis;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "farmaceutica=" + farmaceutica + ", nombre=" + nombre + ", dosisRequeridas=" + dosisRequeridas + ", minDiasEntreDosis=" + minDiasEntreDosis + ", maxDiasEntreDosis=" + maxDiasEntreDosis + ", estado=" + estado + '}';
    }

     
}
