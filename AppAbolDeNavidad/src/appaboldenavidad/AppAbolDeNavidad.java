package appaboldenavidad;

public class AppAbolDeNavidad {

     public static void main(String[] args)
    {
        //Declara altura del arbol
        int altura = 100;
        
        //Bucle para recorrer toas las filas(altura)
        for (int fila = 0; fila < altura; fila++) 
        {
            //bucle para los espacios
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) 
            {
                /*
                prueba de laboratorio
                    4 - 0 - 1 = 3
                    4 - 1 - 1 = 2
                    4 - 2 - 1 = 1
                    4 - 3 - 1 = 0
                */
                System.out.print(" ");
            }
            
            //bucle para los asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1 ; asterisco++) 
            {
                /*
                    prueba de escritorio
                    0 * 2 + 1 = 1
                    1 * 2 + 1 = 3
                    2 * 2 + 1 = 5
                    3 * 2 + 1 = 7
                */
                
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        //tronco
        //espacio en blanco
        int largoTronco = 3;
        
        for (int base = 0; base < largoTronco; base++) 
        {
            //espacio tronco
            for (int espacio = 0; espacio < (altura - 2); espacio++) 
            {
                System.out.print(" ");
            }
            
            //Barritas del tronco
            for (int tronco = 0; tronco < 3; tronco++) 
            {
                System.out.print("|");    
            }
            
            System.out.println("");
        }
        
        
    }
    
}
