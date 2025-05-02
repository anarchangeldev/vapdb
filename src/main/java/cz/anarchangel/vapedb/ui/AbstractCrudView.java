package cz.anarchangel.vapedb.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import cz.anarchangel.vapedb.model.Vape;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
public abstract class AbstractCrudView<T> extends VerticalLayout implements CrudView {

    protected Grid<T> grid;

    public AbstractCrudView() {
        setSizeFull();
    }

    abstract public void init();

    public Component getComponent() {
        return this;
    }
}
