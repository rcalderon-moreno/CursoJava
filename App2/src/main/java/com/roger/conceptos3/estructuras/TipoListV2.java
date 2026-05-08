package com.roger.conceptos3.estructuras;


import com.roger.conceptos2.clases.personalv1.Persona;

import java.util.Collections;
import java.util.LinkedList;

public class TipoListV2 {

    public static void main(String[] args) {



        LinkedList<Integer> listadoEnteros= new LinkedList<>();
        LinkedList<Persona> listadoPersonas= new LinkedList<>();

        listadoEnteros.add(1);
        listadoEnteros.add(111);
        listadoEnteros.add(1);

        listadoPersonas.add(
                new Persona(4,"Nombres","Apellidos")
        );
        listadoPersonas.add(
                new Persona(0,"Nombres","Apellidos")
        );

        for (Integer valor : listadoEnteros) {
            System.out.println("valor=" + valor);
        }

        for (Persona persona : listadoPersonas) {
            System.out.println("Identificación=" + persona.getIdentificacion());
        }

        System.out.println("Listado:\t" + listadoEnteros.toString());
        listadoEnteros.add(1);
        listadoEnteros.add(10);

        System.out.println("Listado:\t" + listadoEnteros.toString());
        System.out.println("Primer valor=" + listadoEnteros.getFirst() );
        System.out.println("último valor=" + listadoEnteros.getLast());


        Collections.sort(listadoEnteros);
        System.out.println("Listado:\t" + listadoEnteros.toString());

        Collections.sort(listadoEnteros, Collections.reverseOrder());
        System.out.println("Listado:\t" + listadoEnteros.toString());

        Collections.sort(listadoPersonas);
        System.out.println("Listado personas:\t" + listadoPersonas.toString());
        listadoEnteros.clear();










    }

}
