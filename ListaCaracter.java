package com.tecnm.morelia.itics.Discretas;

import java.util.ArrayList;

public class ListaCaracter {

    private ArrayList<Character> caracteres = new ArrayList<>();
    private ArrayList<Integer> conteos = new ArrayList<>();

    public void contarCaracteres(String texto) {
        texto = texto.toLowerCase();

        // Recorrer el texto y contar caracteres
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) { // Verificar si es una letra
                int index = caracteres.indexOf(c);
                if (index != -1) {
                    // Incrementar el conteo si ya existe
                    conteos.set(index, conteos.get(index) + 1);
                } else {
                    // Agregar nuevo carácter y establecer su conteo en 1
                    caracteres.add(c);
                    conteos.add(1);
                }
            } else {
                int index = caracteres.indexOf(c);
                if (index != -1) {
                    conteos.set(index, conteos.get(index) + 1);
                } else {
                    caracteres.add(c);
                    conteos.add(1);
                }
            }
        }
    }

    public void imprimirResultados() {
        System.out.println("---------------------------------");
        System.out.println("Carácter\tNúmero de ocurrencias");
        for (int i = 0; i < caracteres.size(); i++) {
            System.out.println("\t" + caracteres.get(i) + "\t\t\t\t" + conteos.get(i));
        }
        caracteres.clear();
        conteos.clear();
    }
}
