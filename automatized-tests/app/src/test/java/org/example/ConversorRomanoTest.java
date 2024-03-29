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

    @Test
    public void testII() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(2, conversor.converte("II"));
    }

    @Test
    public void testXXII() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(22, conversor.converte("XXII"));
    }

    @Test
    public void testIV() {
        ConversorRomano conversor = new ConversorRomano();
        assertEquals(4, conversor.converte("IV"));
    }
}

