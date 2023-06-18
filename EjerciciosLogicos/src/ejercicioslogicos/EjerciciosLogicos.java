
package ejercicioslogicos;


public class EjerciciosLogicos 
{
   
    public static void main(String[] args) 
    {
        int numero1 = 35;
        int numero2 = 20;
        int flag = 0;
        System.out.println("------ Sin Intercambio de valores. -----\n");
        System.out.println("Valor numero1: " + numero1);
        System.out.println("Valor Numero2: " + numero2 );
        
        flag = numero1;
        numero1 = numero2;
        numero2 = flag;
 
        System.out.println("\n----- Con Intercambio de valores. -----\n");
        System.out.println("Valor Actual Numero 1: " + numero1);
        System.out.println("Valor Actual Numero 2: " + numero2);
        
        System.out.println("\nFin del Programa!");
    }
    
}
