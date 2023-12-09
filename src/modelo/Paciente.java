/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saulv
 */
public class Paciente {
private static int ultimoNumero = 0;
private int nro;    
private String nombre;    
private String rut;    
private String descripcion;

    public Paciente() {
    }

    public Paciente(String nombre, String rut, String descripcion) {
        this.nro = ++ultimoNumero;
        this.nombre = nombre;
        this.rut = rut;
        this.descripcion = descripcion;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}
