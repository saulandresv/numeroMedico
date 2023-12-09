/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Paciente;

/**
 *
 * @author saulv
 */
public class PacienteDAO {
    private ArrayList<Paciente> verde = new ArrayList<Paciente>();
    private ArrayList<Paciente> amarillo = new ArrayList<Paciente>();
    private ArrayList<Paciente> rojo = new ArrayList<Paciente>();

    public PacienteDAO() {
    }

    public ArrayList<Paciente> getVerde() {
        return verde;
    }

    public void setVerde(ArrayList<Paciente> verde) {
        this.verde = verde;
    }

    public ArrayList<Paciente> getAmarillo() {
        return amarillo;
    }

    public void setAmarillo(ArrayList<Paciente> amarillo) {
        this.amarillo = amarillo;
    }

    public ArrayList<Paciente> getRojo() {
        return rojo;
    }

    public void setRojo(ArrayList<Paciente> rojo) {
        this.rojo = rojo;
    }
    
   public String agregarPaciente(Paciente paciente, String importancia){
      switch(importancia) {
          case "verde":
            verde.add(paciente);
            break;
          case "amarillo":
            amarillo.add(paciente);
            break;
          case "rojo":
            rojo.add(paciente);
            break;
          default:
            return "importancia desconocida";
      }
      return "ingresado con exito";
   }
    
}
