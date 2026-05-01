package com.roger.conceptos2.objetos;



import com.roger.conceptos2.clases.sobrecarga.Procesar;
import com.roger.conceptos2.clases.sobrecarga.Procesar1;
import com.roger.conceptos2.clases.sobrecarga.Procesar2;

import java.text.ParseException;

public class SobrecargaMiembros {

    public static void main(String[] argumentos) throws ParseException {

        Procesar procesar =new Procesar(1,1);
        Procesar procesar1 =new Procesar1(1,1);
        Procesar procesar2 =new Procesar2(1,1);

        System.out.println("Procesar calcularX() y calcularY(): " + procesar.calcularX() + " " + procesar.calcularY() );
        System.out.println("Procesar1 calcularX() y calcularY(): " + procesar1.calcularX()  );
        System.out.println("Procesar2 calcularX() y calcularY(): " + procesar2.calcularX() + " " + procesar2.calcularY() );
    }

}
