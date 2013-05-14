package cams.client.view;

/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */


import cams.client.action.UserAction;
import cams.client.action.UserActionAsync;
import cams.client.dto.UserDto;
import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.core.XDOM;
import com.extjs.gxt.ui.client.event.*;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ComponentPlugin;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class Form extends LayoutContainer {

    private VerticalPanel vp;
    private FormData formData;
    private TextField<String> login;
    private TextField<String> phone;
    private final UserActionAsync userActionAsync = GWT.create(UserAction.class);

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        formData = new FormData("-20");
        vp = new VerticalPanel();
        vp.setSpacing(10);
        createForm1();
        add(vp);
    }

    private void createForm1() {
        FormPanel simple = new FormPanel();
        simple.setFrame(true);
        simple.setWidth(350);

        ComponentPlugin plugin = new ComponentPlugin() {
            public void init(Component component) {
                component.addListener(Events.Render, new Listener<ComponentEvent>() {
                    public void handleEvent(ComponentEvent be) {
                        El elem = be.getComponent().el().findParent(".x-form-element", 3);
                        // should style in external CSS  rather than directly
                        elem.appendChild(XDOM.create("<div style='color: #615f5f;padding: 1 0 2 0px;'>" + be.getComponent().getData("text") + "</div>"));
                    }
                });
            }
        };

        login = new TextField<String>();
        login.setFieldLabel("Login");
        login.setAllowBlank(false);
        login.addPlugin(plugin);
        login.setData("login", "Enter your login");
        simple.add(login, formData);

        phone = new TextField<String>();
        phone.setFieldLabel("Phone");
        phone.setAllowBlank(false);
        phone.addPlugin(plugin);
        phone.setData("phone", "Enter you phone");
        simple.add(phone, formData);

        Button b = new Button("Submit");
        simple.addButton(b);
        simple.addButton(new Button("Cancel"));

        simple.setButtonAlign(HorizontalAlignment.CENTER);
        b.addSelectionListener(new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                UserDto plant = new UserDto();
                plant.set("login", login.getValue());
                plant.set("phone", phone.getValue());
                userActionAsync.createUser(login.getValue(),phone.getValue(),new AsyncCallback<Long>() {
                    @Override
                    public void onFailure(Throwable throwable) {

                    }

                    @Override
                    public void onSuccess(Long aLong) {
                     vp.fireEvent(Events.Refresh);
                    }
                });
            }
        }   );
        //FormButtonBinding binding = new FormButtonBinding(simple);
        //binding.addButton(b);

        vp.add(simple);

    }


}
