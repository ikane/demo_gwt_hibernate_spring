package cams.client.listeners;

import cams.client.action.UserAction;
import cams.client.action.UserActionAsync;
import com.extjs.gxt.ui.client.event.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 14.05.13
 * Time: 17:24
 */
public class UpdateGridData implements Listener<DomEvent> {
    private final UserActionAsync userActionAsync = GWT.create(UserAction.class);

    public void handleEvent(DomEvent be) {
        if (be instanceof GridEvent) {
            GridEvent gridEvent = (GridEvent) be;
            if (gridEvent.getRecord().get("id") == null)
                return;
            Integer id = new Integer(gridEvent.getRecord().get("id").toString());
            String login = gridEvent.getRecord().get("login").toString();
            String phone = gridEvent.getRecord().get("phone").toString();

            userActionAsync.updateUser(id, login, phone, new AsyncCallback<Void>() {
                @Override
                public void onFailure(Throwable throwable) {

                }

                @Override
                public void onSuccess(Void aVoid) {

                }
            });
        }
        //  }
    }
}
