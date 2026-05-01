package com.roger.conceptos1.excepciones;

public class PropagarExcepciones {

    public static void metodo3() throws Exception {
        throw new Exception("Error en metodo3");
    }

    public static void metodo2() throws Exception {
        metodo3(); // se propaga
    }

    public static void metodo1() throws Exception {
        metodo2(); // se propaga
    }

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Capturado en main: " + e.getMessage());
        }
    }
}


