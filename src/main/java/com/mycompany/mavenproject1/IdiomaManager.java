package com.mycompany.mavenproject1;

import java.util.Locale;
import java.util.ResourceBundle;

public class IdiomaManager {
    private static Locale locale = new Locale("es");  // Idioma por defecto
    private static ResourceBundle bundle = ResourceBundle.getBundle("com.mycompany.mavenproject1.messages", locale);

    // Cambia el idioma y recarga el ResourceBundle
    public static void setIdioma(String idioma) {
        locale = new Locale(idioma);
        bundle = ResourceBundle.getBundle("com.mycompany.mavenproject1.messages", locale);
    }

    // Obtiene el texto traducido para la clave dada
    public static String getTexto(String clave) {
        try {
            return bundle.getString(clave);
        } catch (Exception e) {
            return "!" + clave + "!";
        }
    }

    public static String getIdiomaActual() {
        return locale.getLanguage();
    }
}

