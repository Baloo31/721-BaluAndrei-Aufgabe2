package model;

import java.util.List;

public class Bestellungen {
    private int bestellnr;
    private String adresse;
    private List<Produkt> produkte;


    public Bestellungen(int bestellnr, String adresse, List<Produkt> produkte) {
        this.bestellnr = bestellnr;
        this.adresse = adresse;
        this.produkte = produkte;
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}
