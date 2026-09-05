package com.colegiomagico.reto3;

/**
 * Usa un ciclo for para crear una cadena que repita la palabra 'Pocion ' la cantidad de veces indicada.
 */
public class PocionCiclos {

    public static String preparar(int cantidad) {
        String resultado="";

        for (int variableposcion = 0; variableposcion < cantidad; variableposcion++){
            resultado += "Posión";
        }

        return resultado; 
    }

    public static void main(String[] args) {
        System.out.println("Preparando 3 pociones: " + preparar(3));
    }
}
