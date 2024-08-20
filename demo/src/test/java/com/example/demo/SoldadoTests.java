package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SoldadoTests {
    @Test
    public void crearSoldado() {
        Soldado s1 = new Soldado(0, 0);
        assert(s1.getAtaque() == 0);
        assert(s1.getVida() == 0);
    }

    @Test
    public void soldadoAtacaSoldado() {
       Soldado s1 = new Soldado(10, 2);
       Soldado s2 = new Soldado(10, 2);
       s1.disparar(s2);
       assert(s2.getVida() == 8);
    }

    @Test
    public void soldadoMuereDeUnDisparo4() {
        Soldado s1 = new Soldado(2, 2);
        Soldado s2 = new Soldado(2, 2);
        s1.disparar(s2);
        s2.disparar(s1);
        assert(s1.getVida() == 0);
    }

    @Test
    public void soldadoVivo() {
        Soldado s1 = new Soldado(2, 2);
        assert(s1.estaVivo() == true);
    }
}
