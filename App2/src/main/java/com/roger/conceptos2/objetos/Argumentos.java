package com.roger.conceptos2.objetos;


import com.roger.conceptos2.clases.argumentos_parametros_variables.ArgumentosVariables;
import com.roger.conceptos2.clases.figuras.v2.Circulo;
import com.roger.conceptos2.clases.figuras.v2.Triangulo;
import com.roger.conceptos2.clases.puntos.PuntoV1;

public class Argumentos {
    public static void main(String[] args) {

        ArgumentosVariables argumentosVariables=new ArgumentosVariables("*","-","+");

        argumentosVariables.metodo1(1,2,3);

        argumentosVariables.metodo2("Puntos", new PuntoV1(5,10),new PuntoV1(5,15),new PuntoV1(5,20));

        argumentosVariables.metodo3(new Triangulo(2,2),new Circulo(9.6));
    }
}
