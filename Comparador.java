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
public class Comparador {

private int edad;
    private double precio;

    public Comparador() {
        this.edad = 0;
        this.precio = 0;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*Comparador para producto, donde se establece si el primer producto es mayor,
      menor o igual al segundo que se ingresa posteriormente*/
    
    //IGUAL
    public boolean igualQueP(Object pr) {
        producto pro = (producto) pr;
        return this.precio == pro.getPrecio();
    }

     //MENOR
    public boolean menorQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() < this.precio;
    }

    //MAYOR
    public boolean mayorQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() > this.precio;
    }
    
    //MAYOR O IGUAL QUE
    public boolean mayorIgualQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() >= this.precio;
    }
    
    //MENOR O IGUAL QUE
    public boolean menorIgualQueP(Object pr) {
        producto pro = (producto) pr;
        return pro.getPrecio() <= this.precio;
    }
    
  
    /*Comparador para ALUMNO, donde se establece si el primer ALUMNO es mayor en edad,
      menor o igual de edad con relacion al segundo ALUMNO que se ingresa posteriormente*/
    
    //IGUAL QUE 
    public boolean igualQueA(Object al) {
        Alumno a = (Alumno) al;
        return this.edad == a.getEdad();
    }

    //MENOR QUE 
    public boolean menorQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() < this.edad;
    }

    //MAYOR QUE 
    public boolean mayorQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() > this.edad;
    }
    
    //MAYOR O IGUAL QUE 
    public boolean mayorIgualQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() >= this.edad;
    }  

    //MENOR O IGUAL QUE 
    public boolean menorIgualQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() <= this.edad;
    }  

}

    
