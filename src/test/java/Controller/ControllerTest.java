package Controller;

import model.Bestellungen;
import model.Produkt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    List<Bestellungen> bestellungenList = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Produkt produkt1 = new Produkt("p1", 100);
        Produkt produkt2 = new Produkt("p2", 1000);
        Bestellungen bestellung = new Bestellungen(1, "a", new ArrayList<Produkt>(Arrays.asList(produkt1, produkt2)));
        bestellungenList.add(bestellung);
    }

    @org.junit.jupiter.api.Test
    void sortBestellungenNachGesamtpreis() {
    }

    @org.junit.jupiter.api.Test
    void filternNachProdukt() {
    }
}