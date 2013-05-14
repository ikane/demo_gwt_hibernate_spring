package cams.client;

import cams.client.view.PhonesGrid;
import cams.client.view.Form;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application
    implements EntryPoint
{
    /**
   * This is the entry point method.
   */
  public void onModuleLoad()
  {
     Form form=new Form();
     PhonesGrid grid=new PhonesGrid();
     RootPanel.get().add( form );
     RootPanel.get().add(grid);
  }
}
