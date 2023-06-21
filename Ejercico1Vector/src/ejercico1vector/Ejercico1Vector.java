
package ejercico1vector;

import java.util.Scanner;


public class Ejercico1Vector 
{

   
    public static void main(String[] args) 
    {
      int vector [] = new int[15];
      int contador = 0;
      
       Scanner teclado = new Scanner(System.in);  
        
        for (int i = 0; i < vector.length; i++) 
        {
           System.out.print("Por favor Ingrese Número: ");           
           vector [i] = teclado.nextInt();
           
            if (vector[i] == 3) 
            {
               contador += 1; 
            }
        }
        
        System.out.println("El numero 3 se repite: " + contador);
        
        System.out.println("Fin del Programa!");
    }
    
    
}
