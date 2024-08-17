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
}
