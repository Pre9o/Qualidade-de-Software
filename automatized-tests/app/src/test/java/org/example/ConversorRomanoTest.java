package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorRomanoTest {
    @Test
    public void testI() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(1, conversor.converte("I"));
    }

    @Test
    public void testV() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(5, conversor.converte("V"));
    }

    @Test
    public void testX() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(10, conversor.converte("X"));
    }

    @Test
    public void testL() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(50, conversor.converte("L"));
    }

    @Test
    public void testC() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(100, conversor.converte("C"));
    }

    @Test
    public void testD() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(500, conversor.converte("D"));
    }

    @Test
    public void testM() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(1000, conversor.converte("M"));
    }
}

