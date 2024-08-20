package com.example.demo;

public class Militar {
    int vida;
    int ataque;
    Escudo escudo;

    public Militar() {
    }

    public Militar(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void disparar( Militar objetivo) {
        float dañoBase = this.ataque;
        if (objetivo.escudo != null && objetivo.escudo.activo) {
            
            float dañoReducido = dañoBase * (1 - objetivo.escudo.defensa);
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