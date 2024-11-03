package com.tecnm.morelia.itics.Discretas;

public class Texto {
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void imprimirTexto() {
        System.out.println("El texto es: \n" + texto);
    }
}

