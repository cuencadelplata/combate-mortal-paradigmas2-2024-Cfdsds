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
        assert(s2.getVida() == 0);
    }

    @Test
    public void soldadoVivo() {
        Soldado s1 = new Soldado(2, 2);
        assert(s1.estaVivo() == true);
    }

    @Test
    public void soldadoRecibeEscudo() {
        Soldado s1 = new Soldado(2, 2);
        Escudo e1 = new Escudo(50,1);
        s1.setEscudo(e1);
        assert (e1.getDefensa() == 50);
        assert (e1.getResistencia() == 1);
    }

    @Test
    public void soldadoRecibeEscudoYUnDisparo() {
        Soldado s1 = new Soldado(2, 2);
        Soldado s2 = new Soldado(2, 2);
        Escudo e1 = new Escudo(50,1);
        s1.setEscudo(e1);
        s2.disparar(s1);
        assert(s1.getVida() == 1);
    }

    @Test
    public void soldadoDisparaAChuckNorris() {
        Soldado s1 = new Soldado(2, 2);
        ChuckNorris c1 = new ChuckNorris(999,999);
        s1.disparar(c1);
        assert(c1.getVida() == 999);
    }
}
