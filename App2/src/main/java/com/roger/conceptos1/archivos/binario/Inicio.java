
package com.roger.conceptos1.archivos.binario;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;




public class Inicio {
    public static void main(String []argumentos  ) 
    throws ParseException, IOException, FileNotFoundException, ClassNotFoundException
    {
        
      Ejemplo1 b1 = new Ejemplo1();
      b1.leerArchivo();
      Ejemplo2 b2 = new Ejemplo2();   
      b2.leerArchivo();        
      
      //Ejemplo3 b3 = new Ejemplo3();   
      //b3.leerArchivo();
      
      /*Ejemplo4 b4 = new Ejemplo4();   
      b4.leerArchivo();          */
    }
}
