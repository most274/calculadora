package com.maksym.funciones;

public class FooMaksymOstapenkoKulieba {
    static public void factorialbucle(int num) {  
        int sol = 1;
        
        for(int i = 1; i <= num; i++) {
            sol = sol * i;
        }
        
        System.out.println("Solución: " + sol);
        System.out.println();   
    }
}
