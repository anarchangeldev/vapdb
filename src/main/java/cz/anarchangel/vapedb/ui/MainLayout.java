package cz.anarchangel.vapedb.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.router.RouterLink;
import cz.anarchangel.vapedb.ui.vape.VapeView;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
@Route("")
public class MainLayout extends AppLayout {

    private VerticalLayout menu;

    public MainLayout() {
        initLayout();
    }

    private void initLayout() {
        DrawerToggle toggle = new DrawerToggle();
        setDrawerOpened(true);
        setPrimarySection(AppLayout.Section.DRAWER);
        addToNavbar(toggle, new H1("VapeDB"));

        menu = new VerticalLayout();
        addToDrawer(menu);

        // Add menu items after Spring context is fully initialized
        UI.getCurrent().access(this::addMenuItems);
    }


    private void addMenuItems() {
        RouteConfiguration routeConfiguration = RouteConfiguration.forApplicationScope();
        routeConfiguration.getAvailableRoutes().forEach(routeData -> {
            //String route = routeData.getRouteParameters();
            Class<? extends Component> viewClass = routeData.getNavigationTarget();

            // Only add routes that use this layout
            if (routeData.getParentLayout() != null &&
                    routeData.getParentLayout().equals(this.getClass())) {

                String label = viewClass.getSimpleName().replace("View", "");
                menu.add(new RouterLink(label, viewClass));
            }
        });
    }

}
