package com.maksym;

import java.util.Scanner;
import com.maksym.funciones.aritmeticaBasica;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Integer opcion = 0;

        do {
            System.out.println("0 para salir");
            System.out.println("1 Aritmética básica");
            System.out.println("2 Área polígonos regulares.");
            System.out.println("3 Teorema de Pitágoras");
            System.out.println("4 Ecuaciones 1º grado");
            System.out.println("5 Ecuaciones 2º grado");
            System.out.print( "Introduzca una opción: " );
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    aritmeticaBasica.aritmetica();
                    break;
                default:
                    break;
            }

        } while (opcion != 0);


        
    }
}
