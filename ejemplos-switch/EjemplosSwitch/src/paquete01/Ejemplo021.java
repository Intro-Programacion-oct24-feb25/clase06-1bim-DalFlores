/*
*   Generar un programa que permita ingresar el número de día de la semana;
*   (1 - 7)
*   Si el usuario ingresa el 1, debe presentar el mensaje: Día 1  es Lunes
*   Si el usuario ingresa el 2, debe presentar el mensaje: Día 2  es Martes
*   Si el usuario ingresa el 3, debe presentar el mensaje: Día 3  es Miércoles
*   Si el usuario ingresa el 4, debe presentar el mensaje: Día 4  es Jueves
*   Si el usuario ingresa el 5, debe presentar el mensaje: Día 5  es Viernes
*   Si el usuario ingresa el 6, debe presentar el mensaje: Día 6  es Sábado
*   Si el usuario ingresa el 7, debe presentar el mensaje: Día 7  es Domingo
*   Si el usuario ingresa un número diferente de 1,2,3,4,5,6,7; debe presentar
*   un mensaje: Opción incorrecta

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int diaNacimiento ;
        int mesNacimiento ;
        int yearNacimiento ;
        
        System.out.println("Ingrese su dia de Nacimiento");
        diaNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su mes de nacimiento");
        mesNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su año de Nacimiento");
        yearNacimiento = entrada.nextInt();
        
        String mesCadena = "" ;

        switch (mesNacimiento) {
            case 1:
                mesCadena = "enero";
               break ;
               
               case 2:
                mesCadena = "febrero";
               break ;
               
                case 3:
                mesCadena = "marzo";
               break ;
               
                case 4:
                mesCadena = "abril";
               break ;
               
                case 5:
                mesCadena = "mayo";
               break ;
               
                case 6:
                mesCadena = "junio";
               break ;
               
                case 7:
                mesCadena = "julio";
               break ;
               
                case 8:
                mesCadena = "agosto";
               break ;
               
                case 9:
                mesCadena = "septiembre";
               break ;
               
                case 10:
                mesCadena = "octubre";
               break ;
               
                case 11:
                mesCadena = "noviembre";
               break ;
               
                case 12:
                mesCadena = "diciembre";
               break ;
               
               
            default:
                System.out.println("Opción incorrecta");
                break;
        }

        //Usted ha naciodo el 7 de FEBRERO dee 1980
     mesCadena = mesCadena.toUpperCase ();
     
         System.out.printf("Usted ha nacido el %s de %s de %s",
                 diaNacimiento,mesCadena,yearNacimiento);
         
         
    }   
}
