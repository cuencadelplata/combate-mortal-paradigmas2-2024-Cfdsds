package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TanqueTests {
    @Test
    public void crearTanque() {
        Tanque t1 = new Tanque(0, 0);
        assert(t1.getAtaque() == 0);
        assert(t1.getVida() == 0);
    }

    @Test
    public void tanqueAtacaTanque() {
        Tanque t1 = new Tanque(10, 2);
        Tanque t2 = new Tanque(10, 2);
        t1.disparar(t2);
        assert(t2.getVida() == 8);
    }
}
