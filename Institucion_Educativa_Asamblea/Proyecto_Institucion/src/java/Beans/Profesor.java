/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Profesor implements Serializable {
    String cedula, nombres, apellidos, especialidad, jornada;

    public Profesor() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getapellidos() {
        return apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getespecialidad() {
        return especialidad;
    }

    public void setespecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   
     //metodo
    public boolean inputEmpty(){
         if (!(cedula.isEmpty() || nombres.isEmpty() || apellidos.isEmpty()|| especialidad.isEmpty())){
         return true;
         }else{
             return false;
         }
   
    }
}
