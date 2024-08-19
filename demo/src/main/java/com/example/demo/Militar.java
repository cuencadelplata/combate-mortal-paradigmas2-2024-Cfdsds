package com.example.demo;

public class Militar {
    int vida;
    int ataque;

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
    
        int dañoInfligido = this.ataque;

        objetivo.vida -= dañoInfligido;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}