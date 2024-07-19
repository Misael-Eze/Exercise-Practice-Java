package tup.lciii.modelo;

import org.junit.jupiter.api.Test;
import tup.lciii.modelo.enums.Palo;

import static org.junit.jupiter.api.Assertions.*;

class ManoTest {

    @Test
    void buscarCartaEnMano() {
        Carta carta = new Carta(1, Palo.ORO);
        Mano mano = new Mano();
        mano.agregarCarta(carta);
        assertEquals(carta, mano.buscarCartaEnMano(1,Palo.ORO));
    }
}