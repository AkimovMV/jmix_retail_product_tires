package com.makimov.retail.view.tire;

import com.makimov.retail.entity.Tire;
import com.makimov.retail.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "tires/:id", layout = MainView.class)
@ViewController(id = "Tire.detail")
@ViewDescriptor(path = "tire-detail-view.xml")
@EditedEntityContainer("tireDc")
public class TireDetailView extends StandardDetailView<Tire> {
}