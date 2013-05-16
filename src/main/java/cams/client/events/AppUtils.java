package cams.client.events;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 16.05.13
 * Time: 9:22
 */
public class AppUtils {
    public static EventBus EVENT_BUS = GWT.create(SimpleEventBus.class);
}
