//package com.mycompany.simpleapp;
//
//import com.mycompany.dao.UserAccountFacade;
//import javax.servlet.annotation.WebServlet;
//
//import com.vaadin.annotations.Theme;
//import com.vaadin.annotations.VaadinServletConfiguration;
//import com.vaadin.annotations.Widgetset;
//import com.vaadin.server.BrowserWindowOpener;
//import com.vaadin.server.RequestHandler;
//import com.vaadin.server.VaadinRequest;
//import com.vaadin.server.VaadinResponse;
//import com.vaadin.server.VaadinServlet;
//import com.vaadin.server.VaadinSession;
//import com.vaadin.shared.ui.label.ContentMode;
//import com.vaadin.ui.Button;
//import com.vaadin.ui.Button.ClickEvent;
//import com.vaadin.ui.HorizontalLayout;
//import com.vaadin.ui.Label;
//import com.vaadin.ui.UI;
//import com.vaadin.ui.VerticalLayout;
//import java.io.IOException;
//import java.util.Date;
//import java.util.Locale;
//
///**
// *
// */
//@Theme("mytheme")
//@Widgetset("com.mycompany.simpleapp.MyAppWidgetset")
//public class MainUI extends UI {
//    public static final String PERSISTENCE_UNIT = "com.mycompany_simpleapp_war_1.0-SNAPSHOTPU";
//    private HorizontalLayout mainWindowLayout;
//    private UserAccountFacade userFacade;
//    public MainUI(){
//        userFacade=new UserAccountFacade();
//        userFacade.findAll();
//    }
//    @Override
//    protected void init(VaadinRequest vaadinRequest) {
////        mainWindowLayout = new HorizontalLayout();
////        mainWindowLayout.addComponent(getHeaderLabel());
////        setContent(mainWindowLayout);
////        setMainWindowLayout();
//          updateContent();
//    }
//
//    /**
//     * Updates the correct content for this UI based on the current user status.
//     * If the user is logged in with appropriate privileges, main view is shown.
//     * Otherwise login view is shown.
//     */
//    private void updateContent() {
////        User user = (User) VaadinSession.getCurrent()
////                .getAttribute(User.class.getName());
////        if (user != null && "admin".equals(user.getRole())) {
////            // Authenticated user
////            setContent(new MainView());
////            removeStyleName("loginview");
////            getNavigator().navigateTo(getNavigator().getState());
////        } else {
//            setContent(new LoginLayout());
//            addStyleName("loginview");
////        }
//}
//    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
//    @VaadinServletConfiguration(ui = MainUI.class, productionMode = false)
//    public static class MyUIServlet extends VaadinServlet {
//    }
//    public HorizontalLayout getMainWindowLayout() {
//        return mainWindowLayout;
//    }
//}
