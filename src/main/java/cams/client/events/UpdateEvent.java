package cams.client.events;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 15.05.13
 * Time: 23:02
 */

import com.google.gwt.event.shared.GwtEvent;

public class UpdateEvent extends GwtEvent<UpdateEventHandler> {

    public static Type<UpdateEventHandler> TYPE = new Type<UpdateEventHandler>();

    @Override
    public Type<UpdateEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(UpdateEventHandler handler) {
        handler.update(this);
    }
}