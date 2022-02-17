package com.maksym.funciones;

import java.util.Scanner;
import java.util.ArrayList;

public class FuncionRuffini {
    static Scanner sc = new Scanner(System.in);

    static public void calcular() {
        String sol="";
        Integer num;
        int tam, res, res1;

        //Se introducen los datos
        System.out.println("Introduzca el grado de la ecuación: ");
        tam = Integer.parseInt(sc.next());
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0; i<array.size(); i++){
            array.add(i, 0);
        }

        for(int i = tam; i >= 0; i--) {
            System.out.println("Introduzca el coeficiente de grado "+i+"º : ");
            num = sc.nextInt();

            array.add(i, num);
        }

        for(int i=0; i<array.size();i++){
            if(array.get(array.size()-1)%i==0){//Comprobamos que el valor sea divisible entre el termino independiente
                res=0; //Reseteo los resultados para volver a usarlos
                res1=0;
                for(int j=0;j<array.get(array.size()-1);j++){
                    res+=Math.pow(i, j)*array.get(j); //Calculo y concateno resultados para realiar el teorema del resto
                    res1+=Math.pow(-i, j)*array.get(j); //Teorema del resto pero con el dividor negativo
                    if(res==0) //Si el teorema del resto es cero, quiere decir que una solución es el número sustituido
                        sol+=res+", ";
                    if(res1==0)
                        sol+=res1;
                }
            }
        }
        if(sol=="")
            sol="Las soluciones no son números enteros";
        else
            sol="Las soluciones son: "+sol;

    }
}
