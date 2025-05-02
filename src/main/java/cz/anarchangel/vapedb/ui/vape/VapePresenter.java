package cz.anarchangel.vapedb.ui.vape;

import com.vaadin.flow.router.Route;
import cz.anarchangel.vapedb.model.Vape;
import cz.anarchangel.vapedb.service.VapeService;
import cz.anarchangel.vapedb.ui.AbstractCrudPresenter;
import cz.anarchangel.vapedb.ui.AbstractCrudView;
import cz.anarchangel.vapedb.ui.MainLayout;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
@Component
@RequiredArgsConstructor
public class VapePresenter extends AbstractCrudPresenter<Vape> {

    private final VapeService service;
    private VapeView view;

    private static final String ID = "Vapes";

    @Override
    public String getId() {
        return ID;
    }

    public void initView() {
        view = new VapeView(this);
        view.getComponent().setVisible(true);
    }

    @Override
    public AbstractCrudView<Vape> getView() {
        return this.view;
    }

    @Override
    public void requestItemClicked(String id) {

    }

    @Override
    public List<Vape> getAll() {
        return service.getVapes();
    }

    @Override
    public void create(Vape entity) {

    }

    @Override
    public void update(Vape entity) {

    }

    @Override
    public void delete(String id) {

    }
}
