
package ejerciciojavamatriz;

import java.util.Scanner;

public class EjercicioJAvaMAtriz 
{
   
    public static void main(String[] args) 
    {
        double matriz[][] = new double[4][4];
        
        int contador = 0;
        double suma = 0;
        
        //Cargar la matriz:
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j <=2; j++) 
            {
                System.out.print("Por favor Ingrese Notas en  fila  " + i + " y columna " + j + " -> :");
                matriz[i][j] = teclado.nextInt();
                
                contador += 1;
                suma += matriz[i][j];
                 
             }      
                
                matriz[i][3] = suma / contador; 
                
//                 System.out.println(contador);
//                 System.out.println(suma);
//           
//            System.out.println(matriz[i][3]);
//  
        }
        
                  
        int fila =0;
        int columna = 0;
        int contado2 = 0;
        System.out.println("Detalles de las Notas y Promedio por Alumno");
        
        for ( fila = 0; fila < matriz.length; fila++) 
        {
                      
            contado2 += 1;
            System.out.println("Alumno: " + contado2 + " Nota 1: " + matriz[fila][0] + " Nota 2: " +  matriz[fila][1] + " Nota 3: " + matriz[fila][2] + " con Prmedio: " + matriz[fila][3]);
        }
        
        System.out.println("Fin del Programa!");
    }
    
}
