package condicionalswich;

public class CondicionalSwich 
{

    public static void main(String[] args) 
    {
        int dia = 3;
        String nombreDia;

        switch (dia)
        {
            case 1:
                nombreDia = "Lunes";
                System.out.println(nombreDia);
                break;
            case 2:
                nombreDia = "Martes";
                System.out.println(nombreDia);
                break;
            case 3:
                nombreDia = "Miercoles";
                System.out.println(nombreDia);
                break;
            case 4:
                nombreDia = "Jueves";
                System.out.println(nombreDia);
                break;
            case 5:
                nombreDia = "Viernes";
                System.out.println(nombreDia);
                break;
            case 6:
                nombreDia = "Sabado";
                System.out.println(nombreDia);
                break;
            case 7:
                nombreDia = "Domingo";
                System.out.println(nombreDia);
                break;

            default:
                System.out.println("Número de Díá invalido");
                break;
        }
        
        
        
    }
    

}
