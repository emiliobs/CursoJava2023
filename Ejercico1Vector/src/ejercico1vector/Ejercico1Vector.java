
package ejercico1vector;

import java.util.Scanner;


public class Ejercico1Vector 
{

   
    public static void main(String[] args) 
    {
      int vector [] = new int[15];
      int contador = 0;
      
       Scanner teclado = new Scanner(System.in);  
        
       //Cargar y comparar nuestro vector
        for (int i = 0; i < vector.length; i++) 
        {
           System.out.print("Por favor Ingrese Números para el vector: ");           
           vector [i] = teclado.nextInt();
           
            if (vector[i] == 3) 
            {
               contador += 1; 
            }
        }
        
        System.out.println("La cantidad de números 3 que hay en el vector es: " + contador);
        
        System.out.println("Fin del Programa!");
    }
    
    
}
