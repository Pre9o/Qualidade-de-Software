package org.example;

import java.util.HashMap;

public class ConversorRomano {
    private static HashMap<String, Integer> tabela = new HashMap<String, Integer>(){{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};
    public int converte(String romano) {
        int acumulador = 0;
        int ultimoVizinhoDaDireita = 0;

        for (int i = romano.length() - 1; i >= 0; i--) {
            int atual = tabela.get(String.valueOf(romano.charAt(i)));
            int multiplicador = 1;

            if (atual < ultimoVizinhoDaDireita) multiplicador = -1;
                acumulador += atual * multiplicador;
                ultimoVizinhoDaDireita = atual;
            }

        return acumulador;
    }

}
