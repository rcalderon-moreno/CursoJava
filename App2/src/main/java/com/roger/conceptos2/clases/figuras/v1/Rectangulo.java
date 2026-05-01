package com.roger.conceptos2.clases.figuras.v1;

import com.roger.conceptos2.clases.puntos.PuntoV1;

public class Rectangulo {

    private int ancho, alto;
    private PuntoV1 inicio;

    public Rectangulo() {
        this(0,0);
    }

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.inicio=new PuntoV1();
    }
    public Rectangulo(PuntoV1 inicio, int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.inicio=inicio;
    }
}


