/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ez definir grupos
 */
public class GrupoDeRiesgo {
    private String nombre;
    private String descripcion;
    private int edadMinima;
    private int edadMaxima;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "GrupoDeRiesgo{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + ", estado=" + estado + '}';
    }
    
    
}
