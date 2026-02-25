package com.makimov.retail.view.tirestock;

import com.makimov.retail.entity.TireStock;
import com.makimov.retail.services.ProductService;
import com.makimov.retail.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "tire-stocks", layout = MainView.class)
@ViewController(id = "TireStock.list")
@ViewDescriptor(path = "tire-stock-list-view.xml")
@LookupComponent("tireStocksDataGrid")
@DialogMode(width = "64em")
public class TireStockListView extends StandardListView<TireStock> {

    @Autowired
    ProductService productService;

    @Subscribe(id = "loadingTireStocks", subject = "clickListener")
    public void onLoadingTireStocksClick(final ClickEvent<JmixButton> event) {
        this.productService.saveTireStocksFrom1c7();
    }
}