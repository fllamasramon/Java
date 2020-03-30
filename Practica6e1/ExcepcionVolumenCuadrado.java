/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6e1;

/**
 *
 * @author Usuario
 */
final class ExcepcionVolumenCuadrado extends Exception {
    private String figure;
    private String error;

    public ExcepcionVolumenCuadrado(String figure, String error) {
        this.figure = figure;
        this.setError("La figura" + figure + "no tiene volumen");
    }

    ExcepcionVolumenCuadrado(String no_tiene_volumen) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    
}
