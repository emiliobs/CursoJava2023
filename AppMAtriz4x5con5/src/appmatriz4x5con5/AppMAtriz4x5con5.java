/*
    Llevar a cabo un programa que permita cargar completamente con numeros 5 una matriz de 4x5 (4 filas, 5 columnas)
 */
package appmatriz4x5con5;

import java.util.Scanner;

public class AppMAtriz4x5con5 {

    public static void main(String[] args)
    {
        System.out.println("Start Programa");

        int numeros[][] = new int[4][5];
        // teclado = new Scanner(System.in);

        System.out.println("Llenados la matriz con numeros 5.");

        for (int i = 0; i < numeros.length; i++) 
        {
            for (int j = 0; j <= numeros.length; j++)
            {
                numeros[i][j] = 5;
                numeros[i][j] = 5;
                numeros[i][j] = 5;
                numeros[i][j] = 5;
                
               System.out.println("Mostrando valos de la matriz en la posicion: " + i + " y " + j + " son: " + numeros[i][j]);
                
               
            }
            
            System.out.println("");

        }

        System.out.println("Fin del Programa!");
    }

}
