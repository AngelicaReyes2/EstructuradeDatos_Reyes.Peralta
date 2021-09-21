/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.lineal;

import java.util.Scanner;

/**
 *
 * @author areye
 */
public class ESTRUCTURALINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
      
        //variables generales
        int opt = 0, to = 0;
        char[] pilaabc ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y', 'Z'};
        //menú
        do {
            System.out.println("1 - llenar \n"
                    + "2 - mostrar \n"
                    + "3 - eliminar\n"
                    + "4 - exit\n");
            //evaluamos opt para elegir un caso dentro del switch
            switch (opt = sc.nextInt()) {
                case 1:
                    //length es para que repita el numero de caracteres en cadena, llenar el abecedario en orden.
                    if (to <=26) {
                        System.out.println("Existen espacios disponibles en la pila");
                        pilaabc[to] = (char) ('A' + to);
                        to++;
                    } else {
                        System.out.println("pila llena, no hay espacios disponibles");
                        
                    }
                    
                    break;
                case 2:
                     //verificamos que por lo menos exista 1 dato en la pila que se pueda mostrar
                    if (to > 0) {
                        //bucle que muestra el contenido de la pila, al ser de tipo LIFO mostramos primero, el ultimo que ingreso
                        //esto se realiza iniando el ciclo desde el valor que tiene to (tope), restando 1 unidad en cada iteracion
                        for (int i = to-1; i >= 0; i--) {
                            System.out.println(" " + pilaabc[i]);
                        }
                    } else {
                        System.out.println("pila vacia, no hay elementos para mostrar");
                    }
                    break;
                case 3:
                    //verificar si por lo menos existe un dato en la pila que se pueda eliminar
                    if (to > 0) {
                        //mostrarmos valor y posicion que se eliminará, utilizando la variable tope
                        System.out.println("dato eliminado..." + pilaabc[to - 1] + " de la posicion: " + to);
                        //restamos 1 unidad a to para dejar libre la posicion y poder ingresar un nuevo dato
                        to--;
                    } else {
                        System.out.println("pila vacia, no hay elementos para eliminar");
                    }
                    break;
            }
        } while (opt != 4);
       }
      }
       
    
    

