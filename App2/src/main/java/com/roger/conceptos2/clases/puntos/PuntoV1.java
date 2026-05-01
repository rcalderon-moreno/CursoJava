
package com.roger.conceptos2.clases.puntos;

public class PuntoV1 {

    private int valorEnX;
    private int valorEnY;

    private int suma(){ return this.valorEnX + this.valorEnY; }

    public PuntoV1() {
        this.valorEnX =0;
        this.valorEnY =0;
    }
    public PuntoV1(int x , int y) {
        this.valorEnX =x;
        this.valorEnY =y;
    }

    public int getValorEnX() {
        return valorEnX;
    }
    public void setValorEnX(int valorEnX) {
        this.valorEnX = valorEnX;
    }
    public int getValorEnY() {
        return valorEnY;
    }
    public void setValorEnY(int valorEnY) {
        this.valorEnY = valorEnY;
    }

}

