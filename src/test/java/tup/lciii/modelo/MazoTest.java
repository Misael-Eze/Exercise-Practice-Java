package tup.lciii.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MazoTest {

    @Test
    void getMazoLength() {
        Mazo mazo = new Mazo();
        mazo.generarMazo();
        assertEquals(48, mazo.getMazoLength());

    }

    @Test
    void mezclarMazo() {
        Mazo mazo1 = new Mazo();
        Mazo mazo2 = new Mazo();
        mazo1.generarMazo();
        mazo2.generarMazo();
        mazo1.mezclarMazo();
        assertNotEquals(mazo1, mazo2);
    }


}