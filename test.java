/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea8;
import java.util.Scanner;
/**
 *
 * @author Noe Gomez 
 * carne: 7690-20-16812
 * INGENIERIA EN SISTEMAS - SECCION A
 */
public class test {
    
private static void menu(){
        System.out.println("--***** ---------------------------- *****--");
        System.out.println("INGRESE EL NUMERO DE LA OPCION QUE DESEA REALIZAR \b");
        System.out.println("1: Ingresar un producto");
        System.out.println("2: Ingresar un alumno");
        System.out.println("3: FINALIZAR EJECUCION \"SALIR\" ");
        System.out.println("--***** ---------------------------- *****--\r--");
        System.out.println("\b COMPARATIVO \b--");
                System.out.println("--***** ---------------------------- *****--\r");
    }
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String nombreP=" ", nombreA = " ", carne = " ";
        int id=0, edad=0, op = 0, edadA = 0;
        double precio = 0, precioC =0;
        
        Comparador c = new Comparador();
        
        do{
            
            menu();
            op = in.nextInt();
            
            
            //Conjunto de texto donde se imprimen los resultados tanto como de los productos y de los alumnos
            switch(op){
                case 1:
                    System.out.println("\t-------- PRODUCTO --------\t");
                    System.out.println("Ingrese el identificador o numero del producto\r\n");
                    id = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese el nombre del producto 1");
                    nombreP = in.nextLine();
                    System.out.println("Ingrese el precio del producto 1");
                    precio = in.nextDouble();
                    
                    System.out.println("Por favor ingrese un segundo precio para hacer la comparacion");
                    precioC = in.nextDouble();
                    
                    producto p = new producto(id, nombreP, precio);
                    
                    c.setPrecio(precioC);
                    
                    if(c.igualQueP(p) == true){
                        System.out.println("Ambos precios de los productos son iguales\r\n----------");
                    }
                    
                    if(c.menorQueP(p) == true){
                        System.out.println("El precio del primer producto es menor al precio del segundo producto ingresado\r\n----------");
                    }
                    
                    if(c.mayorQueP(p) == true){
                        System.out.println("El precio del primer producto es mayor al precio del segundo producto ingresado\r\n----------");
                    }
                    
                    if(c.mayorIgualQueP(p) == true){
                        System.out.println("El precio del primer producto es mayor o igual que el precio del segundo producto ingresado\r\n----------");
                    }
                    
                    if (c.menorIgualQueP(p) == true){
                        System.out.println("El precio del primer producto es menor o igual al precio del segundo producto ingresado\r\n----------");
                    }
                   
                            
                    break;
                case 2:
                    
                    in.nextLine();
                    System.out.println("\t-------- ALUMNO --------\t");
                    System.out.println("Ingrese el carne del alumno");
                    carne = in.nextLine();
                    System.out.println("Ingrese el nombre del alumno");
                    nombreA = in.nextLine();
                    System.out.println("Ingrese la edad del alumno");
                    edad = in.nextInt();
                    
                    System.out.println("Por favor ingrese una segunda edad para hacer la comparacion");
                    edadA = in.nextInt();
                    
                    Alumno a = new Alumno(carne, nombreA, edad);
                    
                    c.setEdad(edadA);
                    
                    if(c.igualQueA(a) == true){
                        System.out.println("Ambos alumnos ingresados, son de la misma edad\r\n----------");
                    }
                    
                    if(c.menorQueA(a) == true){
                        System.out.println("La edad del primer alumno es menor a la del segundo alumno ingresado\r\n----------");
                    }
                    
                    if(c.mayorQueA(a) == true){
                        System.out.println("La edad del primer alumno es mayor a la del segundo alumno ingresado\r\n----------");
                    }
                    
                    if(c.mayorIgualQueA(a) == true){
                        System.out.println("La edad del primer alumno es mayor o igual a la del segundo alumno ingresado\r\n----------");
                    }
                    
                    if (c.menorIgualQueA(a) == true){
                        System.out.println("La edad del primer alumno es menor o igual a la del segundo alumno ingresado\r\n----------");
                    }
                    
                    break;
                case 3:
                    break;
            }
            
            //Ciclo de salida para el programa
        }while(!(op == 3));
        
    }
    
}
    
    
    
    

