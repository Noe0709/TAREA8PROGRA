/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea8;
/**
 *
 * @author Noe Gomez 
 * carne: 7690-20-16812
 * INGENIERIA EN SISTEMAS - SECCION A
 */

//Clase con 3 atributos
public class Alumno {
     private String carne;
    private String nombre;
    private int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    } 
    
    
}
