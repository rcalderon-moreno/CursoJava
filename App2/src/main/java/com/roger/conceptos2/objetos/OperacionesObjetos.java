package com.roger.conceptos2.objetos;

import com.roger.conceptos2.clases.puntos.PuntoV1;

public class OperacionesObjetos {
    private final int valor;
    private final String nombre;
    private final PuntoV1 punto;

    public OperacionesObjetos() {
        this.valor = 0;
        this.nombre = "MiNombre";
        this.punto = new PuntoV1();

//        this.valor = 0;
//        this.nombre = "MiNombre";
//        this.punto = new Punto();
    }

    public void cambiarDatos(PuntoV1 p){
        System.out.println("Valores al llegar punto al Método ");
        System.out.println("Referencia del objeto punto " + p.toString() );
        System.out.println("Valores de punto: " + p.getValorEnX() + " , " + p.getValorEnY() );
        p.setValorEnX(1);
        p.setValorEnY(1);
    }
    public void cambiarDatos(int x){

        System.out.println("Valores al llegar x al Método ");
        System.out.println("Valores de x: " + x );
        PuntoV1 p = new PuntoV1(x,x);
    }

    public double calcularPromedio(double [] datos){
        return 0;
    }
    public double calcularPromedio(PuntoV1 x, PuntoV1 y){
        return 0;
    }

    public String[] imprimirDatos(){
        String[] a =new String[10];
        return a;
    }
    public String[] imprimirDatos(double id){
        String[] a =new String[10];
        return a;
    }

}

