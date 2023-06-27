package ejercicioempresvuelomatrices;

import java.util.Scanner;

public class EjercicioEmpresVueloMatrices 
{

    public static void main(String[] args) 
    {
        System.out.println("Inicio del Programa");

        int vuelos[][] = new int[6][3];
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);

        //Carlo ma matriz
        for (int f = 0; f < 6; f++)
        {
            for (int c = 0; c < 3; c++)
            {
                System.out.print("Ingrese la cantidad de asiento al destino: " + f + " horario: " + c + " ->:");
                vuelos[f][c] = teclado.nextInt();

            }
            
            System.out.println("----------------------------------------------------");

        }

        //Vemta de Asinto:
        String bandera = "";
        int destino, horario, asiento;

        while (!bandera.equalsIgnoreCase("finish")) 
        {
            System.out.print("Ingrese el N° de destino: ");
            destino = tecladoDos.nextInt();
            System.out.print("Ingrese Horario del vuelo (0 - Manana, 1 -Medio Dia, 2 - Tarde): ");
            horario = tecladoDos.nextInt();
            System.out.print("Ingrese la cantidad de Asintos: ");
            asiento = tecladoDos.nextInt();

            if (destino >= 0 && destino <= 5) 
            {
                if (horario >= 0 && horario <= 2) 
                {
                    if (vuelos[destino][horario] >= asiento) 
                    {
                        System.out.println("");
                        System.out.println("##############################################");
                        System.out.println("##### !SURESERVA FUE REALIZADA CON EXITO! ####");
                        System.out.println("##############################################");

                        vuelos[destino][horario] -= asiento;
                    } 
                    else 
                    {
                        System.out.println("");
                        System.out.println("##############################################");
                        System.out.println("##### !NO hay asiento disponibles! ####");
                        System.out.println("##############################################");
                        System.out.println("");
                        System.out.println("");
                    }

                } 
                else 
                {
                    System.out.println("");
                    System.out.println("Error!. Por favor ingrese un Horario valido (0 - Manana, 1 -Medio Dia, 2 - Tarde)");

                }

            } 
            else 
            {
                System.out.println("");
                System.out.println("ERROR!.Por favor ingrese un destino valido (0, 1, 2, 3, 4, 5)");
         
            }

            System.out.println("");
            System.out.print("Desea continuar reservando?. In finish patra terminar o cualquier valor para continuar: ");
            bandera = tecladoDos.next();

        }

        System.out.println("Fin del Programa!");
    }

}
