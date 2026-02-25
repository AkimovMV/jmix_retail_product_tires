package com.makimov.retail.view.warehouse;

import com.makimov.retail.entity.Warehouse;
import com.makimov.retail.services.ProductService;
import com.makimov.retail.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "warehouses", layout = MainView.class)
@ViewController(id = "Warehouse.list")
@ViewDescriptor(path = "warehouse-list-view.xml")
@LookupComponent("warehousesDataGrid")
@DialogMode(width = "64em")
public class WarehouseListView extends StandardListView<Warehouse> {

    @Autowired
    private ProductService productService;

    @Subscribe(id = "loadingWarehouseButton", subject = "clickListener")
    public void onLoadingWarehouseButtonClick(final ClickEvent<JmixButton> event) {
        System.out.println("onLoadingWarehouseButtonClick Склады1С");
        productService.saveWarehousesFrom1c7();
    }
}