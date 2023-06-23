package appsueldoempleado;

import java.util.Scanner;

public class AppSueldoEmpleado {

 
    public static void main(String[] args)
    {
        System.out.println("------ Sueldo Empleados -----");
        System.out.println("");
        
        int categoria; 
        double sueldo = 0.0;
        Scanner teclado = new Scanner(System.in);
       
        System.out.print("Por favor ingrese la Categoria: 1 - (Repositor), 2 - (Cajero), 3 - (Supervisor) ->: ");
              
        categoria = teclado.nextInt();        
        switch (categoria) 
        {
            case 1:
                
                sueldo = 15890 + (15890 * 0.10);
                System.out.println("El suelto del Repositor es: " + sueldo);
                break;
            case 2:
                sueldo = 25630.89;
                System.out.println("El sueldo del Cajero es: " + sueldo);
                break;
            case 3:
                sueldo = 35560.20 - (35560.20 / 0.11);
                System.out.println("El sueldo del Spuervisor es: " + sueldo);
                break;
            default:
                System.out.println("ERROR: Por favor ingrese una Categoría válida.");
        }
        
        System.out.println("");
        System.out.println("----- Fin del Programa -----");
        
        
    }
    
}
