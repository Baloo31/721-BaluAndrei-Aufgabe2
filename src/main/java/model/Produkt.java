package model;

public class Produkt {
    private String name;
    private int preis;


    public Produkt(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }
}
