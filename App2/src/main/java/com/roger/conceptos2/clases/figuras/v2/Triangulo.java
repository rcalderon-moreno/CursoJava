package com.roger.conceptos2.clases.figuras.v2;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo","Rojo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return ((this.base * this.altura)/2);
    }
}
