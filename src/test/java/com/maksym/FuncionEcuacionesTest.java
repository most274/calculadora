package com.maksym;

import com.maksym.funciones.FuncionEcuaciones;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FuncionEcuacionesTest {


    @Test
    @DisplayName("Test ecuacion primer grado error");
    public void testEcuaciones(){
        provideInput("1\nA\n10\n33\nX\nX");
    }
    

}
