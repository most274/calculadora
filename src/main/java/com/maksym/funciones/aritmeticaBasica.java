package com.maksym.funciones;
import java.util.Scanner;

public class aritmeticaBasica {
    static Scanner sc = new Scanner(System.in);

    static public void aritmetica(){
        int option;

        System.out.println("1 Sumar");
        System.out.println("2 Restar");
        System.out.print("Que desea: ");

        option = sc.nextInt();

        if (option == 1){
            sumar();
        }else{
            restar();
        }
    }

    public static void sumar(){
        int a,b;

        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();

        System.out.println("Solución: " + (a+b));
        System.out.println();
    }

    public static void restar(){
        int a,b;

        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        
        System.out.println("Solución: " + (a-b));
        System.out.println();
    }
    
}
