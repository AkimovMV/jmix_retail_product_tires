package com.makimov.retail.view.tire;

import com.makimov.retail.services.ProductService;
import com.makimov.retail.entity.Tire;
import com.makimov.retail.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "tires", layout = MainView.class)
@ViewController(id = "Tire.list")
@ViewDescriptor(path = "tire-list-view.xml")
@LookupComponent("tiresDataGrid")
@DialogMode(width = "64em")
public class TireListView extends StandardListView<Tire> {

    @Autowired
    private ProductService productService;

    @Subscribe(id = "loadingButton", subject = "clickListener")
    public void onLoadingButtonClick(final ClickEvent<JmixButton> event) {
        System.out.println("onLoadingButtonClick Шины1С");
        productService.saveTiresFrom1c7();
    }
}