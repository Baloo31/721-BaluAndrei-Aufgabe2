package Controller;

import Repository.BestellungenRepository;
import Repository.ProdukteRepository;
import model.Bestellungen;
import model.Produkt;

import java.util.List;
import java.util.stream.Collectors;


public class Controller {
    private ProdukteRepository produkteRepository;
    private BestellungenRepository bestellungenRepository;

    public Controller(ProdukteRepository produkteRepository, BestellungenRepository bestellungenRepository) {
        this.produkteRepository = produkteRepository;
        this.bestellungenRepository = bestellungenRepository;
    }


    public void updateProdukt(String name, int preis){
        produkteRepository.update(new Produkt(name, preis));
    }

    public void updateBestellung(int bestellnr, String adresse, List<Produkt> produkte){
        bestellungenRepository.update(new Bestellungen(bestellnr, adresse, produkte));
    }

    public void addProdukt(String name, int preis){
        produkteRepository.create(new Produkt(name, preis));
    }

    public void addBestellung(int bestellnr, String adresse, List<Produkt> produkte){
        bestellungenRepository.create(new Bestellungen(bestellnr, adresse, produkte));
    }

    public void deleteProdukt(String name){
        produkteRepository.delete(produkteRepository.getAll().stream()
                .filter(produkt -> produkt.getName().equals(name))
                .collect(Collectors.toList()).get(0));
    }

    public void deleteBestellung(int bestellnr, String adresse, List<Produkt> produkte){
        bestellungenRepository.delete(new Bestellungen(bestellnr, adresse, produkte));
    }

    /**
     * Sotriert die Bestellungen nach Gesamtpreis
     * @return eine liste mit den Bestellungen sortiert
     */
    public List<Bestellungen> sortBestellungenNachGesamtpreis(){
        return bestellungenRepository.getAll().stream().sorted().collect(Collectors.toList());
    }

    /**
     * Filtert die Bestellungen welche die Liste von Produkte enthalten
     * @param produkte die Liste mit Produkte
     * @return Liste mit Bestellungen
     */
    public List<Bestellungen> filternNachProdukt(List<Produkt> produkte){
        return bestellungenRepository.getAll()
                .stream()
                .filter( bestellung -> bestellung.getProdukte() == produkte)
                .collect(Collectors.toList());
    }
}
