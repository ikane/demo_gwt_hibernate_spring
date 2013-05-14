package cams.client.action;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class UserAction_Proxy extends RemoteServiceProxy implements cams.client.action.UserActionAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "cams.client.action.UserAction";
  private static final String SERIALIZATION_POLICY ="389872B97329C478F0837974F1DC4419";
  private static final cams.client.action.UserAction_TypeSerializer SERIALIZER = new cams.client.action.UserAction_TypeSerializer();
  
  public UserAction_Proxy() {
    super(GWT.getModuleBaseURL(),
      "client/action/userAction", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void createUser(java.lang.String login, java.lang.String phone, com.google.gwt.user.client.rpc.AsyncCallback arg3) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.createUser", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("createUser");
    streamWriter.writeInt(2);
    streamWriter.writeString("java.lang.String");
    streamWriter.writeString("java.lang.String");
    streamWriter.writeString(login);
    streamWriter.writeString(phone);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.createUser", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.LONG, "UserAction_Proxy.createUser", getRequestId(), payload, arg3);
  }
  
  public void deleteUser(int id, com.google.gwt.user.client.rpc.AsyncCallback arg2) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.deleteUser", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("deleteUser");
    streamWriter.writeInt(1);
    streamWriter.writeString("I");
    streamWriter.writeInt(id);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.deleteUser", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.VOID, "UserAction_Proxy.deleteUser", getRequestId(), payload, arg2);
  }
  
  public void findByKey(java.lang.String key, com.google.gwt.user.client.rpc.AsyncCallback arg2) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.findByKey", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("findByKey");
    streamWriter.writeInt(1);
    streamWriter.writeString("java.lang.String");
    streamWriter.writeString(key);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.findByKey", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.OBJECT, "UserAction_Proxy.findByKey", getRequestId(), payload, arg2);
  }
  
  public void getAllUsers(com.google.gwt.user.client.rpc.AsyncCallback arg1) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.getAllUsers", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("getAllUsers");
    streamWriter.writeInt(0);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.getAllUsers", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.OBJECT, "UserAction_Proxy.getAllUsers", getRequestId(), payload, arg1);
  }
  
  public void getUsersById(int id, com.google.gwt.user.client.rpc.AsyncCallback arg2) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.getUsersById", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("getUsersById");
    streamWriter.writeInt(1);
    streamWriter.writeString("I");
    streamWriter.writeInt(id);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.getUsersById", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.OBJECT, "UserAction_Proxy.getUsersById", getRequestId(), payload, arg2);
  }
  
  public void getUsersByLogin(java.lang.String login, com.google.gwt.user.client.rpc.AsyncCallback arg2) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.getUsersByLogin", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("getUsersByLogin");
    streamWriter.writeInt(1);
    streamWriter.writeString("java.lang.String");
    streamWriter.writeString(login);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.getUsersByLogin", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.OBJECT, "UserAction_Proxy.getUsersByLogin", getRequestId(), payload, arg2);
  }
  
  public void updateUser(int id, java.lang.String login, java.lang.String phone, com.google.gwt.user.client.rpc.AsyncCallback arg4) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.updateUser", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    streamWriter.writeString("updateUser");
    streamWriter.writeInt(3);
    streamWriter.writeString("I");
    streamWriter.writeString("java.lang.String");
    streamWriter.writeString("java.lang.String");
    streamWriter.writeInt(id);
    streamWriter.writeString(login);
    streamWriter.writeString(phone);
    String payload = streamWriter.toString();
    toss = isStatsAvailable() && stats(timeStat("UserAction_Proxy.updateUser", getRequestId(), "requestSerialized"));
    doInvoke(ResponseReader.VOID, "UserAction_Proxy.updateUser", getRequestId(), payload, arg4);
  }
}
