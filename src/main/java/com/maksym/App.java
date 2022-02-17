package com.maksym;


import java.util.Scanner;
import com.maksym.funciones.aritmeticaBasica;
import com.maksym.funciones.FuncionEcuaciones;
import com.maksym.funciones.FuncionPoligonoRegular;
import com.maksym.funciones.FuncionTeoremaPitagoras;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a,b,c, opcion = 0;

        do {
            System.out.println("0 para salir");
            System.out.println("1 Aritmética básica");
            System.out.println("2 Área polígonos regulares.");
            System.out.println("3 Teorema de Pitágoras");
            System.out.println("4 Ecuaciones 1º grado");
            System.out.println("5 Ecuaciones 2º grado");
            System.out.print("Introduzca una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    aritmeticaBasica.aritmetica();
                    break;
                case 2:
                    FuncionPoligonoRegular.calcular();
                    break;
                case 3:
                    FuncionTeoremaPitagoras.calcular();
                    break;
                case 4:
                    System.out.println("Introduzca el coeficiente grado 1: ");
                    b=sc.nextInt();
                    System.out.println("Introduzca el termino independiente: ");
                    c=sc.nextInt();
                    FuncionEcuaciones ec = new FuncionEcuaciones(b,c);
                    System.out.println(ec.CalcularEcuacion());
                    break;
                case 5:
                    System.out.println("Introduzca el coeficiente de grado 2: ");
                    a=sc.nextInt();
                    System.out.println("Introduzca el coeficiente grado 1: ");
                    b=sc.nextInt();
                    System.out.println("Introduzca el termino independiente: ");
                    c=sc.nextInt();
                    FuncionEcuaciones ecuacion = new FuncionEcuaciones(a,b,c);
                    System.out.println(ecuacion.CalcularEcuacion());
                break;
                default:
                    break;
            }

        } while (opcion != 0);

    }
}
