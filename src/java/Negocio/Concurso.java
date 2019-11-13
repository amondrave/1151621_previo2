/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DTO.Estudiante;
import java.util.TreeSet;

/**
 *
 * @author estudiante
 */
public class Concurso {
    TreeSet<Estudiante> estudiantes = new TreeSet();

    public Concurso() {
    }

    public boolean insertarEstudiante(String nombre,String correo,String contraseña){
      Estudiante est = new Estudiante();
      est.setContraseña(contraseña);
      est.setCorreo(correo);
      est.setNombre(nombre);
      if(validarCorreo(est.getCorreo()) && validarContraseña(est.getContraseña())){
         return estudiantes.add(est);
      }
      return false;
    }
    
    private boolean validarCorreo(String correo){
        String cadena = "gmail.com";
        int tamaño = cadena.length();
      return correo.contains(cadena);
    }
    
    
    public boolean existeEstudiante(String correo,String contraseña){
     boolean existe = false;
     Estudiante est = null;
     for(Estudiante e : estudiantes){
        if(e.getCorreo().equalsIgnoreCase(correo) && e.getContraseña().equalsIgnoreCase(contraseña)){
           est = e;
           existe = true;
           break;
        }
     }
     return existe;
    }
    
    public boolean descuento(int []arr){
     int suma =0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
        }
        return suma==100;
    }
    
    
    private boolean validarContraseña(String contraseña ){
        int tamaño = contraseña.length();
        return tamaño==7; 
    }
    
    public TreeSet<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(TreeSet<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
