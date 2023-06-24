package ajercciologicamaraton;

import java.util.Scanner;


public class AjerccioLogicaMaraton
{

      public static void main(String[] args) 
      {
        //Pedor datos de las personas dni, nombre, y edad
        //Determinar a que categoria se tiene que inscribir
        //no sabemos la cantidad de personas
          Scanner teclado = new Scanner(System.in);
          Scanner tecladoInt = new Scanner(System.in);
     //DNI
          System.out.print("Ingrese el DNI de la Persona: ");
          String dni = teclado.nextLine();
          //NOmbre
          System.out.print("Ingrese Nombre de la Persona: ");
          String nombre = teclado.nextLine();
          //Edad
          System.out.print("Ingrese Edad                : ");
          int edad = tecladoInt.nextInt();
          
          while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) 
          {              
              if (edad >= 6 &&  edad <= 10 ) 
              {
                  System.out.println("Inscripto en la categoria Menores A");
              }
              else if (edad >= 11 && edad <= 17)
              {
                  System.out.println("Inscripto en la Categoria Menores B");
              }
              else if (edad >= 18 && edad <= 30) 
              {
                  System.out.println("Inscripto en la Categoria Juveniles");
              }
              else if (edad >= 31 && edad <= 50) 
              {
                  System.out.println("Inscripto en la Categoria Adulto");
              }
              else if (edad > 50) 
              {
                  System.out.println("Inscripto en la Categoria Adunto Mayores");
              }
              else
              {
                  System.out.println("Error. La persona no cuenta con edad suficiente (Mayores de 6 anos)."); 
              }
              
              System.out.println("------------------------------------------");
              //DNI
          System.out.print("Ingrese el DNI de la Persona: ");
           dni = teclado.nextLine();
          //NOmbre
          System.out.print("Ingrese Nombre de la Persona: ");
          nombre = teclado.nextLine();
          //Edad
          System.out.print("Ingrese Edad                : ");
          edad = tecladoInt.nextInt();
          
          }
          System.out.println("------------------------------------------");
          System.out.println("Fin del Programa!");
          
          
          
          
    }
    
}
