package com.roger.conceptos2.objetos.herencia;


import com.roger.conceptos2.clases.figuras.v2.*;

public class HerenciaAbstraccion {


    public static void main(String[] args) {
        ClienteFiguras clienteFiguras = new ClienteFiguras();

        Triangulo triangulo1=new Triangulo(2,2);
        Circulo circulo1=new Circulo(8);
        Rectangulo rectangulo1=new Rectangulo(2,2);
        FiguraGeometrica figura=new Circulo(9.6);

        clienteFiguras.adicionarFigura(triangulo1);
        clienteFiguras.adicionarFigura(circulo1);
        clienteFiguras.adicionarFigura(rectangulo1);
        clienteFiguras.adicionarFigura(figura);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Cantidad de figuras adicionadas: " + clienteFiguras.cantidadFiguras());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Listado de figuras:");
        System.out.println("\t-->" + clienteFiguras.imprimirFiguras());
        System.out.println("---------------------------------------------------------------------");


    }
}
