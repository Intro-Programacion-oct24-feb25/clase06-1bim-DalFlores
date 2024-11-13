/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro =;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el valor del porcentaje del seguro");
        porcentajeSeguro = entrada.nextDouble();        
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        
        // opción 1
        //if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            //porcentajeSeguro = porcentajeSeguro + 0;
       //} else {
            //porcentajeSeguro = 10;
            //Esta opcion si me sirvio ya que asignamos el rango especifico que nos da en la problematica
        //}

        // opción 2
        //if (porcentajeSeguro > 15) {
            //porcentajeSeguro = 10;
            //Esta opcion no me sirvio ya que no cumple con el rango asigando en la problematica
        //}

         // opción 3
        //if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            //porcentajeSeguro = 10;
            //esta si cumple con los valores asignados de la problematica ya que es lo mismo que la primera opcion solo con un or
        //}

        // opción 4
        //if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            //porcentajeSeguro = 10;
            //esta opcion no cumple con los requerimientos asignados en la problematica 
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){ //condicional anidado
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * porcentajeSeguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n" //%s es variable de tipo cadena 
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n" //%f es double 
                + "Número de productos vendidos: %d\n"//%d entero s
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}
