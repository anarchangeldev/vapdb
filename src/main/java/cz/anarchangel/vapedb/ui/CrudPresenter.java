package cz.anarchangel.vapedb.ui;

import java.util.List;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
public interface CrudPresenter<T> {


    String getId();

    CrudView getView();

    List<T> getAll();

    void create(T entity);

    void update(T entity);

    void delete(String id);

}
