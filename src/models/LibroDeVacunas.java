/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author josephs
 */
public class LibroDeVacunas {
    private String nombre;
    private Vacuna vacuna;
    private String fechaDePrimeraDosis;
    private String fechaDeSegundaDosis;
    private boolean esquemaCompleto;

    public String getNombre() {
        return nombre;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public String getFechaDePrimeraDosis() {
        return fechaDePrimeraDosis;
    }

    public String getFechaDeSegundaDosis() {
        return fechaDeSegundaDosis;
    }

    public boolean isEsquemaCompleto() {
        return esquemaCompleto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public void setFechaDePrimeraDosis(String fechaDePrimeraDosis) {
        this.fechaDePrimeraDosis = fechaDePrimeraDosis;
    }

    public void setFechaDeSegundaDosis(String fechaDeSegundaDosis) {
        this.fechaDeSegundaDosis = fechaDeSegundaDosis;
    }

    public void setEsquemaCompleto(boolean esquemaCompleto) {
        this.esquemaCompleto = esquemaCompleto;
    }

    @Override
    public String toString() {
        return "LibroDeVacunas{" + "nombre=" + nombre + ", vacuna=" + vacuna + ", fechaDePrimeraDosis=" + fechaDePrimeraDosis + ", fechaDeSegundaDosis=" + fechaDeSegundaDosis + ", esquemaCompleto=" + esquemaCompleto + '}';
    }
    
    
    
    public void Vacunar()
    {
    
    }
    public void RegistrarVacuna(String nombre, Vacuna vacuna)
    {
    
    }
}
