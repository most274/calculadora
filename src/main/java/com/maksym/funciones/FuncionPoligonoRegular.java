package com.maksym.funciones;

import java.util.Scanner;

public class FuncionPoligonoRegular {
    static Scanner sc = new Scanner(System.in);

    static public void calcular() {
        String sol;
        double num, lon, apo;

        //Se introducen los datos
        System.out.println("Introduzca el número de lados: ");
        num = Double.parseDouble(sc.next());

        System.out.println("Introduzca la longitud de los lados: ");
        lon = Double.parseDouble(sc.next());

        System.out.println("Introduzca el apótema: ");
        apo = Double.parseDouble(sc.next());

        //Compruba que sea mayor a 0 el número
        if (num < 0 || lon < 0 || apo < 0) {
            sol = "Datos incorrectos";
        } else {
            sol = String.valueOf((num * lon * apo) / 2);
        }

        System.out.println("Solución: " + sol);
        System.out.println();
    }

}
