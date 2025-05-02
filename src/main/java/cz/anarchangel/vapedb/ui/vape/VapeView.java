package cz.anarchangel.vapedb.ui.vape;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import cz.anarchangel.vapedb.model.Vape;
import cz.anarchangel.vapedb.ui.AbstractCrudView;
import cz.anarchangel.vapedb.ui.MainLayout;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
@Route(value = "vapes", layout = MainLayout.class)
public class VapeView extends AbstractCrudView<Vape> {

    private final VapePresenter presenter;

    public VapeView(VapePresenter presenter) {
        super();
        this.presenter = presenter;
        init();
    }

    public void init() {
        grid = new Grid<>(Vape.class);

        grid.setItems(presenter.getAll());
        add(grid);
    }

}
