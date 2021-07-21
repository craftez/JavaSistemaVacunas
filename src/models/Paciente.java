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
  private String name;
  private String status;
  private String grupo_riesgo;
  private String id;
  
  public Paciente() {
  }
  
  public Paciente(String name) {
      this.name = name;
  }
  
  public String getName() {
      return name;
  }
  
  public void setName(String name) {
      this.name = name;
  }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGrupo_riesgo() {
        return grupo_riesgo;
    }

    public void setGrupo_riesgo(String grupo_riesgo) {
        this.grupo_riesgo = grupo_riesgo;
    }

    public void getId() {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente{" + "name=" + name + ", status=" + status + ", grupo_riesgo=" + grupo_riesgo + ", id=" + id + '}';
    }
  
  
  
}
