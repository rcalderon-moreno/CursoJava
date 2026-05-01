package com.roger.conceptos2.objetos;

import com.roger.conceptos2.estaticos.DatosFijos;

public class UsoDeStatic {
    public static void main(String[] args) {

        System.out.println("Valor de ruta " + DatosFijos.getRuta());
        System.out.println("Valor de porcentaje " + DatosFijos.getPorcentaje());
        System.out.println("Valor de valorMatriculaFijo " + DatosFijos.valorMatriculaFijo );
        System.out.println("Valor de valorMatriculaModificable " + DatosFijos.valorMatriculaModificable);

        DatosFijos.valorMatriculaModificable=0;
        // Error al acceder
        // DatosFijos.valorMatriculaFijo=0;
        System.out.println("Valor modificado de valorMatriculaModificable " + DatosFijos.valorMatriculaModificable);

        System.out.println("Contador de objetos " + DatosFijos.getContadorObjetos());
        DatosFijos datos = new DatosFijos();
        System.out.println("Valor de ruta " + datos.getRuta());
        datos = new DatosFijos();
        datos = new DatosFijos();
        System.out.println("Contador de objetos " + DatosFijos.getContadorObjetos());






    }
}



