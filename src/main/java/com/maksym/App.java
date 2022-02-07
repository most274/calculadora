package com.maksym;

import java.util.Scanner;

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
            System.out.print( "Introduzca una opción: " );
            System.out.println("0 para salir.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println( "Opción 1" );
                    break;
                default:
                    break;
            }

        } while (opcion != 0);


        
    }
}
