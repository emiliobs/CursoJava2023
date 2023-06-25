
package vectorcargarecorridovector;

import java.util.Scanner;


public class VectorCargaRecorridoVector 
{
 
    public static void main(String[] args) 
    {
        String vector[] = new String[8];
        Scanner teclado = new Scanner(System.in);   
        
        
        for (int i = 0; i < vector.length; i++) 
        {
             System.out.print("Ingrese nombre al Vector: ");
            vector[i] = teclado.nextLine();
           
        }
        
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < vector.length; i++) 
        {
            System.out.println("Los nombre guardados en la posicion " + i + " del vector son: " + vector[i]);
        }
        
        System.out.println("");
        System.out.println("Fin del Programa!");
        
        
        
    }
    
}
