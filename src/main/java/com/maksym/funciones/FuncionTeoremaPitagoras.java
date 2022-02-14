package com.maksym.funciones;

import java.util.Scanner;

public class FuncionTeoremaPitagoras {
    static Scanner sc = new Scanner(System.in);

    static public void calcular() {
        int opc = 0;
        String sol = "";
        double cat = -1, cat2 = -1, hip = -1;

        //Se elige la opción
        System.out.println("¿Qué desea calcular, el cateto(1) o la hipotenusa(2)?");
        opc = Integer.parseInt(sc.next());

        switch (opc) {
            case 1:
                //Se recogen los datos
                System.out.println("Introduzca el otro cateto");
                cat = Double.parseDouble(sc.next());
                
                System.out.println("Introduzca la hipotenusa");
                hip = Double.parseDouble(sc.next());

                //Se comprueba que sean mayores a 0
                if(cat > 0 && hip > 0) {                
                    sol = String.valueOf(Math.sqrt(Math.pow(hip, 2) - Math.pow(cat,2)));
                } else {
                    sol = "Datos incorrectos";
                } 
            break;
            case 2:
                //Se recogen los datos
                System.out.println("Introduzca el primer cateto");
                cat = Double.parseDouble(sc.next());
                
                System.out.println("Introduzca el segundo cateto");
                cat2 = Double.parseDouble(sc.next());
                
                //Se comprueba que sean mayores a 0
                if(cat > 0 && cat2 > 0) {                
                    sol = String.valueOf(Math.sqrt(Math.pow(cat2, 2) + Math.pow(cat,2)));
                } else {
                    sol = "Datos incorrectos";
                }       
            break;
        }
        
        System.out.println("Solución: " + sol);
        System.out.println();
    }

}
