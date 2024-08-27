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


    public void disparar(Militar objetivo) {
        double danoBase = this.ataque;
        double danoReducido = danoBase * (1 - (objetivo.escudo != null ? objetivo.escudo.defensa/100 : 0));
        objetivo.recibirDisparo(danoReducido);
    }

    public void recibirDisparo(double dano) {
        this.vida -= dano;
        if (escudo != null) {
            escudo.resistencia--;
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