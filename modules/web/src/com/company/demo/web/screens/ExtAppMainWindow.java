package com.company.demo.web.screens;

import com.company.demo.entity.OrderStatus;
import com.haulmont.cuba.gui.components.OptionsGroup;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private OptionsGroup orderStatusesFloat;

    @Inject
    private OptionsGroup orderStatusesColumns;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        orderStatusesFloat.setOptionsEnum(OrderStatus.class);
        orderStatusesColumns.setOptionsEnum(OrderStatus.class);
    }
}