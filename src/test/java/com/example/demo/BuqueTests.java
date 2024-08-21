package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuqueTests {
    @Test
    public void crearBuque() {
        Buque b1 = new Buque(0, 0);
        assert(b1.getAtaque() == 0);
        assert(b1.getVida() == 0);
    }

    @Test
    public void buqueVivo() {
        Buque b1 = new Buque(1, 1);
        assert(b1.estaVivo() == true);
    }

    @Test
    public void buqueAtacaBuque() {
        Buque b1 = new Buque(0, 0);
        Buque b2 = new Buque(0, 0); 
        b1.disparar(b2);
        assert(b2.getVida() == 0);
    }

    @Test
    public void buqueMuereDeTresDisparos() {
        Buque b1 = new Buque(9, 3);
        Buque b2 = new Buque(9, 3);
        b1.disparar(b2);
        b1.disparar(b2);
        b1.disparar(b2);
        assert(b2.getVida() == 0);
        assert(b2.estaVivo() == false);
    }

    @Test
    public void buqueRecibeEscudoYUnDisparo() {
        Buque b1 = new Buque(6, 3);
        Buque b2 = new Buque(6, 3);
        Escudo e1 = new Escudo(50,1);
        b1.setEscudo(e1);
        b2.disparar(b1);
        assert(b1.getVida() == 4.5);
    }
}
