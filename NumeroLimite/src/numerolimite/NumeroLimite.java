
package numerolimite;

import java.util.Scanner;

public class NumeroLimite 
{

    public static void main(String[] args)
    {
        System.out.println("----- Numero sin Limite ------");
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el limite hasta el que quiere mostrar: ");
        int limite = teclado.nextInt();
        int contador = 1;
        
        while(contador <= limite)
        {
            System.out.println("Los numeros limitados son: " + contador);
            contador +=1;
        }
        
//        for (int i = 1; i <= limite; i++)
//        {
//            System.out.println("Los numeros limitados son: " + i);
//        }
        
        
        System.out.println("----- Fin del Programa -----");
        
    }
    
}
