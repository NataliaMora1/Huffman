package com.tecnm.morelia.itics.Discretas;

public class Main {
    public static void main(String[] args) {

        Texto texto1 = new Texto("El hipopotamo hipo esta con hipo, Quien le quita el hipo al hipopotamo hipo");
        texto1.imprimirTexto();

        ListaCaracter listaCaracter = new ListaCaracter();
        listaCaracter.contarCaracteres(texto1.getTexto());
        listaCaracter.imprimirResultados();

        Texto texto2 = new Texto("Tres tristEs tiGres, tragAbaN trigo en un trigal, en Tres tRistes trastos, trAGABan trIGOo tres tRISteS tigrEs.");
        texto2.imprimirTexto();

        listaCaracter.contarCaracteres(texto2.getTexto());
        listaCaracter.imprimirResultados();
    }
}