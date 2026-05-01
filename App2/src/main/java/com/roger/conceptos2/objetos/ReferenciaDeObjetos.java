package com.roger.conceptos2.objetos;

import com.roger.conceptos2.clases.puntos.PuntoV1;

public class ReferenciaDeObjetos {
    public static void main(String[] args) {

        PuntoV1 punto1;
        punto1=new PuntoV1();

        PuntoV1 punto2;
        punto2=new PuntoV1(5,12);

        PuntoV1 punto3;
        punto3=punto1;

        System.out.println("Referencia del objeto p1 " + punto1.toString() );
        System.out.println("Referencia del objeto p2 " + punto2.toString() );
        System.out.println("Referencia del objeto p3 " + punto3.toString() );
        System.out.println("Valores de p1: " + punto1.getValorEnX() + " - " + punto1.getValorEnY() );
        System.out.println("Valores de p2: " + punto2.getValorEnX() + " - " + punto2.getValorEnY() );
        System.out.println("Valores de p3: " + punto3.getValorEnX() + " - " + punto3.getValorEnY() );


        OperacionesObjetos operacionesObjetos =new OperacionesObjetos();
        int valor=0;
        PuntoV1 punto4=new PuntoV1();

        System.out.println("Valores de x: " + valor );
        operacionesObjetos.cambiarDatos(valor);
        System.out.println("Valores después de  llegar a al método ");
        System.out.println("Valores de x: " + valor );

        System.out.println("****Valores iniciales de  punto4***");
        System.out.println("Referencia del objeto punto4 " + punto4.toString() );
        System.out.println("Valores de punto4: " + punto4.getValorEnX() + " , " + punto4.getValorEnY() );

        operacionesObjetos.cambiarDatos(punto4);

        System.out.println("Valores después de modificar en el método p4 ");
        System.out.println("Referencia del objeto punto4 " + punto4.toString() );
        System.out.println("Valores de punto4: " + punto4.getValorEnX() + " , " + punto4.getValorEnX() );


    }
}
