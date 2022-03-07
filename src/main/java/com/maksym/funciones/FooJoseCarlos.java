package com.maksym.funciones;

public class FooJoseCarlos {
    
    static public void factorialbucle(int numero) {  
        long sol=1;
        
        for(int i = numero; i >1; i--) {
            sol = sol * i;
        }
        
        System.out.println("Solución: " + sol);
    }
}
