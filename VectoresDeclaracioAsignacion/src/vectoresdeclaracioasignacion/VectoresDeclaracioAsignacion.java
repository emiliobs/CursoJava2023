
package vectoresdeclaracioasignacion;

import java.util.Scanner;

public class VectoresDeclaracioAsignacion 
{

    public static void main(String[] args) 
    {
    
        System.out.println("vectores"); 
        
        //Declaracion
        int vector[] = new int[5];
        
               
        //Asignacion (Manual)
//        vector[0] = 2;
//        vector[1] = 77;
//        vector[2] = 177;
//        vector[3] = 998;
//        vector[4] = 555;

//ASignacion por teclado:
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) 
        {
            System.out.print("Ingrese el valor para el indice del Vector: ");
           vector[i] = teclado.nextInt();
        }
        
        System.out.println("");
        System.out.println("Mostrando Valores del vector");
        System.out.println("");
        
        //Recorrido:
        for (int i = 0; i < vector.length; i++) 
        {
            System.out.println("Posicion del vector "+ i + " con Valor: " + vector[i]);   
            System.out.println("---------------------------------------------");
        }
        
         System.out.println("");
        System.out.println("Fin del lectura del Vector");
        
    }
    
}
