package com.roger.conceptos3.estructuras;


import com.roger.conceptos2.clases.personalv1.Persona;

import java.util.ArrayList;
import java.util.Collections;

public class TipoListV1 {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList();
        Persona persona = new Persona();
        persona=new Persona(1,"Nombres","Apellidos");
        lista.add(persona);
        persona=new Persona(2,"Nombres","Apellidos");
        lista.add(persona);
        persona=new Persona(3,"Nombres","Apellidos");
        lista.add(persona);

        System.out.println("Cantidad de objetos:\t" + lista.size());
        System.out.println("Listado:\t" + lista.toString());
        System.out.println("Objeto posición 2:\t"+ lista.get(1) );
        System.out.println("Remover objetos posición 1 :\t" +lista.remove(1));
        System.out.println("Remover objeto persona :\t" +lista.remove(persona));
        System.out.println("Remover objeto persona :\t" +lista.remove(persona));
        System.out.println("Listado:\t" + lista.toString());

        lista.clear();

        System.out.println("Listado:\t" + lista.toString());
        lista.add(new Persona(6,"Nombres","Apellidos"));
        lista.add(new Persona(5,"Nombres","Apellidos"));
        lista.add(new Persona(4,"Nombres","Apellidos"));
        System.out.println("Listado:\t" + lista.toString());

        Collections.sort(lista);

        System.out.println("Listado:\t" + lista.toString() );

    }

}
