package com.roger.conceptos3.genericos;


import com.roger.conceptos2.clases.personalv1.Estudiante;
import com.roger.conceptos2.clases.personalv1.Persona;
import com.roger.conceptos3.tipos.ColeccionPersonas;

public class DatosGenericosV4 {

    public static void main(String[] args) {

        ColeccionPersonas<Estudiante> c1=new ColeccionPersonas<Estudiante>();
        Estudiante e1=new Estudiante(100.0, "SISTEMAS",1.0,"JUAN","ROMERO");
        Estudiante e2=new Estudiante(101.0, "ELECTRONICA",2.0,"CESAR","MARTINEZ");
        Estudiante e3=new Estudiante(102.0, "SISTEMAS",3.0,"FELIPE","MARTINEZ");

        c1.insertarDato(e1);
        c1.insertarDato(e2);
        c1.insertarDato(e3);

        System.out.println("Agrupamiento o colección de tipo Persona");

        Persona[] datos = c1.getListado();

        for(Persona  e: datos)
        {
            System.out.println( e.toString());
        }

    }
}


