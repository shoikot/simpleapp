package com.vaadin.demo.dashboard.view;

import com.simpleap.inventory.InventoryView;
import com.simpleapp.print.PrintingView;
import com.simpleapp.setting.SettingsView;
import com.simpleapp.setting.UsersView;
import com.vaadin.demo.dashboard.view.dashboard.DashboardView;
import com.vaadin.demo.dashboard.view.reports.ReportsView;
//import com.vaadin.demo.dashboard.view.sales.SalesView;
import com.vaadin.demo.dashboard.view.schedule.ScheduleView;
import com.vaadin.demo.dashboard.view.transactions.TransactionsView;
import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;

public enum DashboardViewType {
    DASHBOARD("dashboard", DashboardView.class, FontAwesome.HOME, true), 
    TRANSACTIONS("transactions", TransactionsView.class, FontAwesome.TABLE, false), 
    REPORTS( "reports", ReportsView.class, FontAwesome.FILE_TEXT_O, true),
    SCHEDULE("schedule", ScheduleView.class, FontAwesome.CALENDAR_O, false),
    INVENTORY("Accounts", InventoryView.class, FontAwesome.CALENDAR_O, false),
    PRINTING("Printing", PrintingView.class, FontAwesome.PRINT, false),
    SETTINGS("Settings", SettingsView.class, FontAwesome.COG, false),
    USERS("Users", UsersView.class, FontAwesome.USERS, false);

    private final String viewName;
    private final Class<? extends View> viewClass;
    private final Resource icon;
    private final boolean stateful;

    private DashboardViewType(final String viewName,
            final Class<? extends View> viewClass, final Resource icon,
            final boolean stateful) {
        this.viewName = viewName;
        this.viewClass = viewClass;
        this.icon = icon;
        this.stateful = stateful;
    }

    public boolean isStateful() {
        return stateful;
    }

    public String getViewName() {
        return viewName;
    }

    public Class<? extends View> getViewClass() {
        return viewClass;
    }

    public Resource getIcon() {
        return icon;
    }

    public static DashboardViewType getByViewName(final String viewName) {
        DashboardViewType result = null;
        for (DashboardViewType viewType : values()) {
            if (viewType.getViewName().equals(viewName)) {
                result = viewType;
                break;
            }
        }
        return result;
    }

}
