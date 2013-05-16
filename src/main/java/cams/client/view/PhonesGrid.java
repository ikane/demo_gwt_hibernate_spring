/*
 * Sencha GXT 2.3.0 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
package cams.client.view;

import java.util.ArrayList;
import java.util.List;


import cams.client.action.IUser;
import cams.client.action.UserAction;
import cams.client.action.UserActionAsync;
import cams.client.dto.UserDto;
import cams.client.events.AppUtils;
import cams.client.events.UpdateEvent;
import cams.client.events.UpdateEventHandler;
import cams.client.listeners.UpdateGridData;
import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.data.BaseModel;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.Store;
import com.extjs.gxt.ui.client.util.DateWrapper;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.*;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.extjs.gxt.ui.client.widget.grid.*;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class PhonesGrid extends LayoutContainer {

    private final ListStore<UserDto> store = new ListStore<UserDto>();
    private final UserActionAsync userActionAsync = GWT.create(UserAction.class);
    private EditorGrid<UserDto> grid;
    private PhonesGrid thisRef;
    public PhonesGrid() {

    }

    @Override
    protected void beforeRender() {
        userActionAsync.getAllUsers(new AsyncCallback<List<? extends IUser>>() {
            @Override
            public void onFailure(Throwable throwable) {
                MessageBox box = new MessageBox();
                box.setMessage(throwable.getMessage());
                box.show();
            }

            @Override
            public void onSuccess(List<? extends IUser> iUsers) {
                for (IUser user : iUsers) {
                    UserDto dto = new UserDto();
                    dto.set("login", user.getLogin());
                    dto.set("phone", user.getPhone());
                    dto.set("id", user.getId());
                    store.add(dto);
                }

            }
        });
    }

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);

        setLayout(new FlowLayout(10));


        List<ColumnConfig> configs = new ArrayList<ColumnConfig>();

        ColumnConfig column;

        column = new ColumnConfig();
        column.setId("id");
        column.setHeaderHtml("id");
        column.setWidth(130);
        configs.add(column);

        column = new ColumnConfig();
        column.setId("login");

        column.setHeaderHtml("Login");
        column.setAlignment(HorizontalAlignment.CENTER);
        column.setWidth(70);
        column.setEditor(new CellEditor(new TextField<String>()));

        configs.add(column);

        //DateField dateField = new DateField();
        //dateField.getPropertyEditor().setFormat(DateTimeFormat.getFormat("MM/dd/y"));

        column = new ColumnConfig();
        column.setId("phone");
        column.setHeaderHtml("Phone");
        column.setAlignment(HorizontalAlignment.CENTER);
        column.setWidth(95);
        column.setEditor(new CellEditor(new TextField<String>()));
        configs.add(column);


        //store.add(TestData.getPlants());

        ColumnModel cm = new ColumnModel(configs);

        ContentPanel cp = new ContentPanel();
        // cp.setHeadingHtml("Edit Plants");
        cp.setFrame(true);
        //  cp.setIcon(Resources.ICONS.table());
        cp.setSize(600, 300);
        cp.setLayout(new FitLayout());

        grid = new EditorGrid<UserDto>(store, cm);
        grid.setAutoExpandColumn("login");
        grid.setBorders(true);
        grid.addListener(Events.AfterEdit, new UpdateGridData());
        grid.setSelectionModel(new GridSelectionModel<UserDto>());
        StoreFilterField<UserDto> filter = new StoreFilterField<UserDto>() {

            protected boolean doSelect(Store<UserDto> store, UserDto parent,
                                       UserDto record, String property, String filter) {

                String name = parent.get("login");
                String phone = parent.get("phone");
                name = name.toLowerCase();
                if ((name.indexOf(filter.toLowerCase()) != -1) || (phone.indexOf(filter.toLowerCase()) != -1)) {
                    return true;
                }
                return false;
            }
        };
        filter.bind(store);
        ToolBar toolBar = new ToolBar();
        toolBar.add(filter);
        toolBar.add(new SeparatorToolItem());
        toolBar.add(new Button("Remove", new SelectionListener<ButtonEvent>() {

            @Override
            public void componentSelected(ButtonEvent ce) {

                for (UserDto dto : grid.getSelectionModel().getSelectedItems())
                    userActionAsync.deleteUser(new Integer(dto.get("id").toString()), new AsyncCallback<Void>() {
                        @Override
                        public void onFailure(Throwable throwable) {

                        }

                        @Override
                        public void onSuccess(Void aVoid) {

                        }
                    });
            }
        }));
        cp.setTopComponent(toolBar);
        cp.add(grid);
        cp.setButtonAlign(HorizontalAlignment.CENTER);

        add(cp);
        thisRef=this;
        AppUtils.EVENT_BUS.addHandler(UpdateEvent.TYPE,new UpdateEventHandler() {
            @Override
            public void update(UpdateEvent event) {
                MessageBox box=new MessageBox();
                box.setMessage("User added to grid");
                box.show();
            }
        });
    }

}
