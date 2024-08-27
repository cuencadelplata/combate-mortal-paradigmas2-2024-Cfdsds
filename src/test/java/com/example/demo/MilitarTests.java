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
    public void soldadoDisparaAChuckNorris() {
        Soldado s1 = new Soldado(2, 2);
        ChuckNorris c1 = new ChuckNorris(999,999);
        s1.disparar(c1);
        //con esta linea funciona
        //c1.recibirDisparo(s1);
        //no se por que anda con 997
        assert(c1.getVida() == 999);
    }
}
