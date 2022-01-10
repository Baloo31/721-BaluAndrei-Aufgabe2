package Repository;

import model.Produkt;

public class ProdukteRepository extends InMemoryRepo<Produkt> {

    /**
     * constructor for a student repository
     */
    public ProdukteRepository(){
        super();
    }


    /**
     * updates a student
     * @param obj : student to update
     * @return updated student (Student)
     */
    @Override
    public Produkt update(Produkt obj) {
        Produkt prodToUpdate = this.repoList.stream()
                .filter(prod -> prod.getName().equals(obj.getName()))
                .findFirst()
                .orElseThrow();

        prodToUpdate.setPreis(obj.getPreis());
        return prodToUpdate;
    }
}
