package br.edu.up.Modelos;

public class AutoMovel {
    private float distanciaPercorrida;
    private float combustivelGasto;

    public float getDistanciaPercorrida(){
        return distanciaPercorrida;
    }

    public void setDistancia(float distanciaPercorrida){
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public float getCombustivelGasto(){
        return combustivelGasto;
    }

    public void setCombustivelGasto(float combustivelGasto){
        this.combustivelGasto = combustivelGasto;
    }
}
