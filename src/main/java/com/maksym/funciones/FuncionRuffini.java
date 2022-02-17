package com.maksym.funciones;

import java.util.Scanner;
import java.util.ArrayList;

public class FuncionRuffini {
    static Scanner sc = new Scanner(System.in);

    static public void calcular() {
        String sol,num;
        int tam;
        double lon, apo;

        //Se introducen los datos
        System.out.println("Introduzca el grado de la ecuación: ");
        tam = Integer.parseInt(sc.next());

        for(int i = tam-1; i > 0; i--) {
            System.out.println("Introduzca la longitud de los lados: ");
            num = String.valueOf(sc.next());

            ArrayList<String> array = new ArrayList<String>();
            array.set(i, num);
        }
    }
}
