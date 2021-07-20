/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosistemavacunas;

import ds.ListaSimple;
import models.Vacuna;

/**
 *
 * @author ez
 */
public class ProyectoSistemaVacunas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando vacunas
        Vacuna pfizer = new Vacuna("Pfizer");
        Vacuna astraZeneca = new Vacuna("AstraZeneca");
        
        // creando una list simple de vacunas
        ListaSimple<Vacuna> listaDeVacunas = new ListaSimple();
        listaDeVacunas.addToFront(pfizer);
        listaDeVacunas.printList();
        listaDeVacunas.addToFront(astraZeneca);
        listaDeVacunas.printList();
        
        System.out.println("Remover: " + listaDeVacunas.removeFromFront());
        listaDeVacunas.printList();
        
        System.out.println("Esta la lista vacia: " + listaDeVacunas.isEmpty());
        System.out.println("La cuenta de vacunas es: " + listaDeVacunas.getSize());
    }
    
}
