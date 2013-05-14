package com.extjs.gxt.ui.client.core;

public class FastSet_FieldSerializer {
  private static native com.extjs.gxt.ui.client.core.FastMap getMap(com.extjs.gxt.ui.client.core.FastSet instance) /*-{
    return instance.@com.extjs.gxt.ui.client.core.FastSet::map;
  }-*/;
  
  private static native void  setMap(com.extjs.gxt.ui.client.core.FastSet instance, com.extjs.gxt.ui.client.core.FastMap value) /*-{
    instance.@com.extjs.gxt.ui.client.core.FastSet::map = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.extjs.gxt.ui.client.core.FastSet instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setMap(instance, (com.extjs.gxt.ui.client.core.FastMap) streamReader.readObject());
    
  }
  
  public static native com.extjs.gxt.ui.client.core.FastSet instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.extjs.gxt.ui.client.core.FastSet::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.core.FastSet instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeObject(getMap(instance));
    
  }
  
}
