package com.roger.conceptos2.clases.argumentos_parametros_variables;


import com.roger.conceptos2.clases.figuras.v2.FiguraGeometrica;
import com.roger.conceptos2.clases.puntos.PuntoV1;

public class ArgumentosVariables {

    public ArgumentosVariables(String ... argumentos) {
        System.out.println("Número de argumentos en el constructor: " + argumentos.length );
        System.out.println("Tipo: "  + argumentos.getClass().getSimpleName()  );
        for(int x=0;x<argumentos.length;x++)
            System.out.println("Argumentos[ "+x +"]"+ " = "+ argumentos[x] );
    }
    public void metodo1(int ... argumentos){
        System.out.println("Número de argumentos: " + argumentos.length);
        System.out.println("Tipo: "  + argumentos.getClass().getSimpleName()  );
        for(int x=0;x<argumentos.length;x++)
            System.out.println("Argumentos[ "+x +"]"+ " = "+ argumentos[x] );
    }
    public void metodo2(String titulo, PuntoV1... argumentos){
        System.out.println("Título: " + titulo);
        System.out.println("Número de argumentos: " + argumentos.length);
        System.out.println("Tipo: "  + argumentos.getClass().getSimpleName()   );
        for(int x=0;x<argumentos.length;x++)
            System.out.println("Argumentos[ "+x +"]"+ " = "+ argumentos[x] );
    }
    public void metodo3(FiguraGeometrica... argumentos){
        System.out.println("Número de argumentos: " + argumentos.length );
        System.out.println("Tipo: "  + argumentos.getClass().getSimpleName()  );
        for(int x=0;x<argumentos.length;x++)
            System.out.println("Argumentos[ "+x +"]"+ " = "+  argumentos[x]  );
    }

}

