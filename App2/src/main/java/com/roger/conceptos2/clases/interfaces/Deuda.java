package com.roger.conceptos2.clases.interfaces;



import java.util.Date;

public interface Deuda {

    public void registrar( Double valor, Date fecha, String descripcion, String tipo   );
    public void remover(int idDeuda, String tipo   );
    public String informacionDeuda();
}


