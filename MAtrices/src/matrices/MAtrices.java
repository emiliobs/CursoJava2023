
package matrices;

public class MAtrices
{

  
    public static void main(String[] args)
    {
        //Declaracion
        
        int matriz [][] = new int[3][3];
        
        
        //Asignacion (Manual)
                matriz[0][0] = 5;
                matriz[0][1] = 55505;
                matriz[0][2] = 5566;
                matriz[1][0] = 544;
                matriz[1][1] = 5555;
                matriz[1][2] = 56;
                matriz[2][0] = 455;
                matriz[2][1] = 554;
                matriz[2][2] = 53;
                
               for (int f = 0; f < matriz.length; f++) 
               {
                   for (int c = 0; c < matriz.length; c++) 
                   {
                       System.out.println("El valor de la posicion f: " + f + " c: " + c + " es de: " + matriz[f][c]);
                       //System.out.println("es de: " + matriz[f][c]);
                   }
   
               }
               
               System.out.println("Fin del Programa!");
        
        
        //Asignacion (Teclado)
    }
    
}
