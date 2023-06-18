
package ejercicioscondiciomales;

import java.util.Scanner;


public class EjerciciosCondiciomales 
{


    public static void main(String[] args) 
    {
       double sueldo = 0;
       int categoria;
       
        System.out.print("Ingrese tipo de Categoría: \n 1 - (Repositores), \n 2 - (Cajeros), \n 3 - (Supervisores) \n que desea calcular el sueldo: ");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1) 
        {
            sueldo = 15890 + (15890 * 0.10);
            
        }
        else if (categoria == 2) 
        {
            sueldo = 25630.20;
            
        }
        else if(categoria == 3)
        {
          sueldo = 35560.20 - (35560 * 0.11);
         
        }
        else
        {
            System.out.println("");
            System.out.println("Por favor ingrese un número de  Categoríá valida.");
        }
        
        if (categoria == 1 || categoria == 2 || categoria == 3) 
        {
          System.out.println("");
          System.out.println("El total del sueldo para la Categoría seleccionada " + categoria + " es igual a: " + sueldo);
          System.out.println("");
          System.out.println("Fin del Programa!");
          
        }
        
        
    }
    
}
