/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_b;
import java.util.Scanner;
/**
 *
 * @author areye
 */
public class PILA_B {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tope = 0, opt = 0;
        int [] frec=new int[27];
        char[] pila = new char[26];
        
        do {
            System.out.println("1 - llenar\n"
                    + "2 - eliminar\n"
                    + "3 - mostrar\n"
                    + "4 - repetidos\n"
                    + "5 - salir\n");
                    
            switch (opt = sc.nextInt()) {
                case 1:
                    //char letra = 'A';
                    for (int i = 0; i < 26; i++) {
                        char letra=(char)(Math.random ()*26 + 'A');
                        if (tope < 26) {
                            pila[tope] = letra;//abc[i];
                            letra++;
                            tope++;
                        } else {
                            System.out.println("pila llena....");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (tope > 0) {
                        System.out.println("dato eliminado..." + tope);
                        //restar unidad a tope, para poder reutilizar la posicion 
                        tope--;
                    } else {
                        System.out.println("no hay elementos para eliminar....");
                    }
                    break;
                case 3:
                    if (tope > 0) {
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println(" " + pila[i]);
                        }
                    } else {
                        System.out.println("pila vacia....");
                    }
                    break;
                    
                case 4:
                    if(tope>0){
                    // El tamaño del llenado y cuando finaliza la i
                   for(int i=0; i<pila.length; i++)
                   {
                     // la posicion de la letra
                   frec[pila[i]]+=1;
                   
                   }
                   //mostrar las variables
                   for(int j=0;j<26;j++)
                   {
                       // Posiciones y la frecuencia.
                   System.out.println("La letra"+j+ "aparece"+frec[j]+"veces");
                   }
                    }
                   break;
                       }
        } while (opt != 5);
    }
    }
    

