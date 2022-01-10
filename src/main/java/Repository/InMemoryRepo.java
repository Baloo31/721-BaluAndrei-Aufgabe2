package Repository;

import Repository.CRUDRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory repository implementing CRUD operatons repository interface
 */
public abstract class InMemoryRepo<T> implements CRUDRepository<T> {

    protected List<T> repoList;


    /**
     * in memory repository constructor
     */
    public InMemoryRepo() {
        this.repoList = new ArrayList<>();
    }


    /**
     * adds an object to an in-memory repository
     * @param obj : an object to add (T)
     * @return the added object
     */
    @Override
    public T create(T obj) {
        this.repoList.add(obj);
        return obj;
    }


    /**
     * @return all objects inside an in-memory repository
     */
    @Override
    public List<T> getAll() {
        return this.repoList;
    }


    /**
     * deletes an object from an in-memory repository
     * @param obj : object to delete
     */
    @Override
    public void delete(T obj) {
        this.repoList.remove(obj);
    }

}
