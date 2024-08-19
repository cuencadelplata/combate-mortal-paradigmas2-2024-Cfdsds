package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MilitarTests {
    @Test
    public void crearMilitar() {
        Militar m = new Militar();
        assert(m.getAtaque() == 0);
        assert(m.getVida() == 0);
    }

    @Test
    public void militarAtacaMilitar() {
        Militar m1 = new Militar(10, 2);
        Militar m2 = new Militar(10, 2);
        m1.disparar(m2);
        assert(m2.getVida() == 8);
    }


    @Test
    public void crearTanque() {
        Tanque t1 = new Tanque(0, 0);
        assert(t1.getAtaque() == 0);
        assert(t1.getVida() == 0);
    }

    @Test
    public void crearBuque() {
        Buque b1 = new Buque(0, 0);
        assert(b1.getAtaque() == 0);
        assert(b1.getVida() == 0);
    }

}
