package com.roger.conceptos2.clases.final_operador;

public  final class AFija {

    private final int X;
    private  final int Y;

    public AFija(){
        X=0;
        Y=0;
    }

    public int getX() {

        return X;
    }

    public int getY() {

        return Y;
    }

    //Compilador detecta el error
    //public void setX(int X) { this.X=X; }

}