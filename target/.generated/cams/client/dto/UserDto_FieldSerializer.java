package cams.client.dto;

public class UserDto_FieldSerializer {
  private static native int getId(cams.client.dto.UserDto instance) /*-{
    return instance.@cams.client.dto.UserDto::id;
  }-*/;
  
  private static native void  setId(cams.client.dto.UserDto instance, int value) /*-{
    instance.@cams.client.dto.UserDto::id = value;
  }-*/;
  
  private static native java.lang.String getLogin(cams.client.dto.UserDto instance) /*-{
    return instance.@cams.client.dto.UserDto::login;
  }-*/;
  
  private static native void  setLogin(cams.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@cams.client.dto.UserDto::login = value;
  }-*/;
  
  private static native java.lang.String getPhone(cams.client.dto.UserDto instance) /*-{
    return instance.@cams.client.dto.UserDto::phone;
  }-*/;
  
  private static native void  setPhone(cams.client.dto.UserDto instance, java.lang.String value) /*-{
    instance.@cams.client.dto.UserDto::phone = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, cams.client.dto.UserDto instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setId(instance, streamReader.readInt());
    setLogin(instance, streamReader.readString());
    setPhone(instance, streamReader.readString());
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native cams.client.dto.UserDto instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @cams.client.dto.UserDto::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, cams.client.dto.UserDto instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getLogin(instance));
    streamWriter.writeString(getPhone(instance));
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
