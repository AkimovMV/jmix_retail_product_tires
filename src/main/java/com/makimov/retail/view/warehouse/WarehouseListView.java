package com.makimov.retail.view.warehouse;

import com.makimov.retail.entity.Warehouse;
import com.makimov.retail.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;


@Route(value = "warehouses", layout = MainView.class)
@ViewController(id = "Warehouse.list")
@ViewDescriptor(path = "warehouse-list-view.xml")
@LookupComponent("warehousesDataGrid")
@DialogMode(width = "64em")
public class WarehouseListView extends StandardListView<Warehouse> {
    @Subscribe(id = "loadingButton", subject = "clickListener")
    public void onLoadingButtonClick(final ClickEvent<JmixButton> event) {
        System.out.println("start loading");

    }
}