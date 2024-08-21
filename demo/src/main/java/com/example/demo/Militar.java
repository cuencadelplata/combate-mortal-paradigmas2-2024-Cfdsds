package com.example.demo;

public class Militar {
    double vida;
    int ataque;
    Escudo escudo;

    public Militar() {
    }

    public Militar(double  vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }

    public double  getVida() {
        return vida;
    }

    public void setVida(double  vida) {
        this.vida = vida;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void disparar( Militar objetivo) {
        double dañoBase = this.ataque;
        if (objetivo.escudo != null && objetivo.escudo.activo) {
            
            double dañoReducido = dañoBase * ( objetivo.escudo.defensa/100);
            objetivo.vida -= dañoReducido;
            objetivo.escudo.resistencia--;
            if (objetivo.escudo.resistencia <= 0) {
                objetivo.escudo.activo = false;
            }
        } else {
            // Aplicar el daño completo
            objetivo.vida -= dañoBase;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public boolean tieneEscudo() {
        return this.escudo != null;
    }
}