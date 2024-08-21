package com.example.demo;

public class Escudo {
    public boolean activo;
    public double defensa;
    public int resistencia;

    public Escudo(double defensa, int resistencia) {
        this.activo = true;
        this.defensa = defensa;
        this.resistencia = resistencia;
    }

    public void setDefensa(double  defensa) {
        this.defensa = defensa;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public double getDefensa() {
        return this.defensa;
    }

    public int getResistencia() {
        return this.resistencia;
    }

}
