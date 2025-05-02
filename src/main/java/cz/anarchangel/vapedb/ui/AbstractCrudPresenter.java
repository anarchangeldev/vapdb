package cz.anarchangel.vapedb.ui;

import jakarta.annotation.PostConstruct;

import java.util.List;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
public abstract class AbstractCrudPresenter<T> implements CrudPresenter<T> {

    @PostConstruct
    public void init() {
        initView();
    }

    abstract public String getId();

    abstract protected void initView();

    abstract public CrudView getView();

    public abstract void requestItemClicked(String id);

}
