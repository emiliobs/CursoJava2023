package pkg3arraystemepraturaciudades;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String vectorCiudades[] = new String[5];
        double vectorTemperaturaMinima[] = new double[5];
        double vectorTemperaturaMaxima[] = new double[5];
        Scanner tecladoNombre = new Scanner(System.in);
        Scanner tecladoTemepeatura = new Scanner(System.in);
        
       double minimaTemperatura = 99999999.00;
       double maximaTemperatura = -99999999.00;
       int posisionMinima = -1;
       int posisionMaxima = -1;
        
        System.out.println("-----  CIudades, Maximas y Minimas Temperaturas  -----");
        
        System.out.println("");
        for (int i = 0; i < vectorCiudades.length; i++) 
        {

            System.out.print("Por favor ingrese nombre de la ciudad: ");
            vectorCiudades[i] = tecladoNombre.next();
            
            System.out.print("Por favor ingrese Tempeatura Minima: ");
            vectorTemperaturaMinima[i] = tecladoTemepeatura.nextDouble();
            
            System.out.print("Por favor ingrese Temperatura Maxima: ");
            vectorTemperaturaMaxima[i] = tecladoTemepeatura.nextDouble();
            
            System.out.println("--------------------------------------");
            
           
              
            //Minima temperatura y posicion
            if (vectorTemperaturaMinima[i] < minimaTemperatura) 
            {
                minimaTemperatura = vectorTemperaturaMinima[i];
                posisionMinima = i;
            }
            
            //Maxima temperatura y Posicion            
            if (vectorTemperaturaMaxima[i] > maximaTemperatura) 
            {
                maximaTemperatura = vectorTemperaturaMaxima[i];
                posisionMaxima = i;
            }

        }
        
       //Determinar la minima  y Maxima temperatura:
//       double minimaTemperatura = 99999999.00;
//       double maximaTemperatura = -99999999.00;
//       int posisionMinima = -1;
//       int posisionMaxima = -1;
       
//        for (int i = 0; i < vectorCiudades.length; i++) 
//        {
//            
//            //Minima temperatura y posicion
//            if (vectorTemperaturaMinima[i] < minimaTemperatura) 
//            {
//                minimaTemperatura = vectorTemperaturaMinima[i];
//                posisionMinima = i;
//            }
//            
//            //Maxima temperatura y Posicion            
//            if (vectorTemperaturaMaxima[i] > maximaTemperatura) 
//            {
//                maximaTemperatura = vectorTemperaturaMaxima[i];
//                posisionMaxima = i;
//            }
//                               
      //}
        
         
        System.out.println("La ciudad con Temperatura de : " + minimaTemperatura + " Grados Minima  es : " + vectorCiudades[posisionMinima]);
        System.out.println("La ciudad con Temperatura de : " + maximaTemperatura + " Grados Maxima  es : " + vectorCiudades[posisionMaxima]);
        System.out.println("");
        System.out.println("Fin del Programa!");

    }

}
