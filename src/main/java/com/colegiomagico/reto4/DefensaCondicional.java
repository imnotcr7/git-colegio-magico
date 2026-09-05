package com.colegiomagico.reto4;

/**
 * Si el hechizo es 'Imperius' o 'Crucio', retorna 'Maldicion'. De lo contrario, 'Permitido'.
 */
public class DefensaCondicional {

    public static String evaluar(String hechizo) {

        if (hechizo.equals("Imperius") || hechizo.equals("Crucio")) {
            return "Ese hechizo es una maldición";
        } else {
            return "Hechizo permitido";
        }

    }

    public static void main(String[] args) {
        System.out.println("Lumos: " + evaluar("Lumos"));
        System.out.println("Crucio: " + evaluar("Crucio"));
    }
}
