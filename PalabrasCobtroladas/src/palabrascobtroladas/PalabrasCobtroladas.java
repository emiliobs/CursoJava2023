/*
 * Relizar un programa que demuestre en pantalla palabras que sean ingresadas por teclado hasta
que se ingrese la palabra "Salir"
 */
package palabrascobtroladas;

import java.util.Scanner;

public class PalabrasCobtroladas {

    public static void main(String[] args) {
        System.out.println("-----  Mostrando por pantalla las palabras  -----");
        Scanner teclado = new Scanner(System.in);
        String palabra;

        System.out.print("Por favor ingrese palabra a mostrar: ");
        palabra = teclado.next();

        while (!palabra.equalsIgnoreCase("salir")) 
        {
            System.out.println("La palabra ingresada fue: " + palabra);
            System.out.println("");
            System.out.print("Por favor ingrese palabra a mostrar: ");
            palabra = teclado.next();
        }

        System.out.println("-----  Fin del programa  -----");
    }

}
