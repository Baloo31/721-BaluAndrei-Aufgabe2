package Repository;

import model.Bestellungen;
import model.Produkt;

public class BestellungenRepository extends InMemoryRepo<Bestellungen> {

    /**
     * constructor for a student repository
     */
    public BestellungenRepository(){
        super();
    }


    /**
     * updates a student
     * @param obj : student to update
     * @return updated student (Student)
     */
    @Override
    public Bestellungen update(Bestellungen obj) {
        Bestellungen bestellungToUpdate = this.repoList.stream()
                .filter(prod -> prod.getBestellnr() == obj.getBestellnr())
                .findFirst()
                .orElseThrow();

        bestellungToUpdate.setAdresse(obj.getAdresse());
        bestellungToUpdate.setProdukte(obj.getProdukte());
        return bestellungToUpdate;
    }
}
