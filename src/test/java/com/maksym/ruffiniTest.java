package com.maksym;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class RuffiniTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }


    @Test 
    @DisplayName("Test Ruffini")
    public void testEcuacionRuffini() {
       
        provideInput("6\n4\n1\n0\n-9\n4\n12");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Las soluciones son: -1, 2, -3,") );
        
    }

    @Test 
    @DisplayName("Test Ruffini Sin soluciones reales")
    public void TestEcuacionRuffiniSinSol() {
       
        provideInput("6\n3\n5\n-9\n4\n13");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Las soluciones no son números enteros") );
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
}
