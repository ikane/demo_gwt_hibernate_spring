package cams.client.action;

import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.impl.Serializer;

public class UserAction_TypeSerializer implements Serializer {
  private static final JavaScriptObject methodMap = createMethodMap();
  private static final JavaScriptObject signatureMap = createSignatureMap();
  
  private static native com.extjs.gxt.ui.client.core.FastMap create_com_extjs_gxt_ui_client_core_FastMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.extjs.gxt.ui.client.core.FastMap::new()();
  }-*/;
  
  private static native com.extjs.gxt.ui.client.data.RpcMap create_com_extjs_gxt_ui_client_data_RpcMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.extjs.gxt.ui.client.data.RpcMap::new()();
  }-*/;
  
  private static native java.util.ArrayList create_com_google_gwt_user_client_rpc_core_java_util_ArrayList_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.ArrayList::new()();
  }-*/;
  
  private static native java.util.HashMap create_com_google_gwt_user_client_rpc_core_java_util_HashMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.HashMap::new()();
  }-*/;
  
  private static native java.util.HashSet create_com_google_gwt_user_client_rpc_core_java_util_HashSet_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.HashSet::new()();
  }-*/;
  
  private static native java.util.IdentityHashMap create_com_google_gwt_user_client_rpc_core_java_util_IdentityHashMap_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.IdentityHashMap::new()();
  }-*/;
  
  private static native java.util.LinkedList create_com_google_gwt_user_client_rpc_core_java_util_LinkedList_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.LinkedList::new()();
  }-*/;
  
  private static native java.util.Vector create_com_google_gwt_user_client_rpc_core_java_util_Vector_CustomFieldSerializer(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @java.util.Vector::new()();
  }-*/;
  
  @SuppressWarnings("restriction")
  private static native JavaScriptObject createMethodMap() /*-{
    return {
    "[Lcams.client.action.IUser;/3797576461":[
      @cams.client.action.IUser_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @cams.client.action.IUser_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcams/client/action/IUser;),
      @cams.client.action.IUser_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcams/client/action/IUser;)
    ],
    "cams.client.dto.UserDto/605270110":[
      @cams.client.dto.UserDto_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @cams.client.dto.UserDto_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcams/client/dto/UserDto;),
      @cams.client.dto.UserDto_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcams/client/dto/UserDto;)
    ],
    "[Lcams.client.dto.UserDto;/3973455386":[
      @cams.client.dto.UserDto_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @cams.client.dto.UserDto_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcams/client/dto/UserDto;),
      @cams.client.dto.UserDto_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcams/client/dto/UserDto;)
    ],
    "com.extjs.gxt.ui.client.core.FastMap/3488076414":[
      @cams.client.action.UserAction_TypeSerializer::create_com_extjs_gxt_ui_client_core_FastMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.extjs.gxt.ui.client.core.FastMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/FastMap;),
      @com.extjs.gxt.ui.client.core.FastMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/core/FastMap;)
    ],
    "com.extjs.gxt.ui.client.core.FastSet/1007065943":[
      @com.extjs.gxt.ui.client.core.FastSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.extjs.gxt.ui.client.core.FastSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/FastSet;),
      @com.extjs.gxt.ui.client.core.FastSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/core/FastSet;)
    ],
    "com.extjs.gxt.ui.client.data.RpcMap/3441186752":[
      @cams.client.action.UserAction_TypeSerializer::create_com_extjs_gxt_ui_client_data_RpcMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/RpcMap;),
      @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/RpcMap;)
    ],
    "com.google.gwt.i18n.client.impl.DateRecord/112389920":[
      @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
      @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
    ],
    "[Lcom.google.gwt.i18n.client.impl.DateRecord;/2823890031":[
      @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/i18n/client/impl/DateRecord;),
      @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/google/gwt/i18n/client/impl/DateRecord;)
    ],
    "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533":[
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
    ],
    "java.lang.Boolean/476441737":[
      @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
      @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
    ],
    "[Ljava.lang.Boolean;/2507200464":[
      @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Boolean;),
      @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Boolean;)
    ],
    "java.lang.Byte/1571082439":[
      @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Byte;),
      @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Byte;)
    ],
    "[Ljava.lang.Byte;/3053163818":[
      @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Byte;),
      @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Byte;)
    ],
    "java.lang.Double/858496421":[
      @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
      @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
    ],
    "[Ljava.lang.Double;/2857560407":[
      @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Double;),
      @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Double;)
    ],
    "java.lang.Float/1718559123":[
      @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
      @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Float;)
    ],
    "[Ljava.lang.Float;/3956181278":[
      @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Float;),
      @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Float;)
    ],
    "java.lang.Integer/3438268394":[
      @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
      @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
    ],
    "[Ljava.lang.Integer;/1574882222":[
      @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Integer;),
      @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Integer;)
    ],
    "java.lang.Long/4227064769":[
      @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
      @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
    ],
    "[Ljava.lang.Long;/97727328":[
      @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Long;),
      @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Long;)
    ],
    "java.lang.Short/551743396":[
      @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Short;),
      @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Short;)
    ],
    "[Ljava.lang.Short;/3779901635":[
      @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Short;),
      @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Short;)
    ],
    "java.lang.String/2004016611":[
      @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
      @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
    ],
    "[Ljava.lang.String;/2600011424":[
      @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
      @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
    ],
    "java.sql.Date/3996530531":[
      @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
      @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
    ],
    "[Ljava.sql.Date;/773242198":[
      @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Date;),
      @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Date;)
    ],
    "java.sql.Time/831929183":[
      @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
      @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
    ],
    "[Ljava.sql.Time;/3521163259":[
      @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Time;),
      @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Time;)
    ],
    "java.sql.Timestamp/1769758459":[
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
    ],
    "[Ljava.sql.Timestamp;/1267684111":[
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Timestamp;),
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Timestamp;)
    ],
    "java.util.ArrayList/3821976829":[
      @cams.client.action.UserAction_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_ArrayList_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
      @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
    ],
    "java.util.Arrays$ArrayList/1243019747":[
      @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
    ],
    "java.util.Date/1659716317":[
      @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
      @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
    ],
    "[Ljava.util.Date;/3828292433":[
      @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/Date;),
      @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/util/Date;)
    ],
    "java.util.HashMap/962170901":[
      @cams.client.action.UserAction_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_HashMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
      @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
    ],
    "java.util.HashSet/1594477813":[
      @cams.client.action.UserAction_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_HashSet_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
      @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
    ],
    "java.util.IdentityHashMap/3881143367":[
      @cams.client.action.UserAction_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_IdentityHashMap_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
      @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
    ],
    "java.util.LinkedHashMap/1551059846":[
      @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
      @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
    ],
    "java.util.LinkedHashSet/3628722029":[
      @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
      @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
    ],
    "java.util.LinkedList/1060625595":[
      @cams.client.action.UserAction_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_LinkedList_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
      @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
    ],
    "java.util.Stack/1031431137":[
      @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
      @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
    ],
    "java.util.TreeMap/1575826026":[
      @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
      @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
    ],
    "java.util.TreeSet/1002270346":[
      @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
      @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
    ],
    "java.util.Vector/3125574444":[
      @cams.client.action.UserAction_TypeSerializer::create_com_google_gwt_user_client_rpc_core_java_util_Vector_CustomFieldSerializer(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
      @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
    ]
    };
  }-*/;
  
  private static native JavaScriptObject createSignatureMap() /*-{
    return {
    "[Lcams.client.action.IUser;":"3797576461",
    "cams.client.dto.UserDto":"605270110",
    "[Lcams.client.dto.UserDto;":"3973455386",
    "com.extjs.gxt.ui.client.core.FastMap":"3488076414",
    "com.extjs.gxt.ui.client.core.FastSet":"1007065943",
    "com.extjs.gxt.ui.client.data.RpcMap":"3441186752",
    "com.google.gwt.i18n.client.impl.DateRecord":"112389920",
    "[Lcom.google.gwt.i18n.client.impl.DateRecord;":"2823890031",
    "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException":"3936916533",
    "java.lang.Boolean":"476441737",
    "[Ljava.lang.Boolean;":"2507200464",
    "java.lang.Byte":"1571082439",
    "[Ljava.lang.Byte;":"3053163818",
    "java.lang.Double":"858496421",
    "[Ljava.lang.Double;":"2857560407",
    "java.lang.Float":"1718559123",
    "[Ljava.lang.Float;":"3956181278",
    "java.lang.Integer":"3438268394",
    "[Ljava.lang.Integer;":"1574882222",
    "java.lang.Long":"4227064769",
    "[Ljava.lang.Long;":"97727328",
    "java.lang.Short":"551743396",
    "[Ljava.lang.Short;":"3779901635",
    "java.lang.String":"2004016611",
    "[Ljava.lang.String;":"2600011424",
    "java.sql.Date":"3996530531",
    "[Ljava.sql.Date;":"773242198",
    "java.sql.Time":"831929183",
    "[Ljava.sql.Time;":"3521163259",
    "java.sql.Timestamp":"1769758459",
    "[Ljava.sql.Timestamp;":"1267684111",
    "java.util.ArrayList":"3821976829",
    "java.util.Arrays$ArrayList":"1243019747",
    "java.util.Date":"1659716317",
    "[Ljava.util.Date;":"3828292433",
    "java.util.HashMap":"962170901",
    "java.util.HashSet":"1594477813",
    "java.util.IdentityHashMap":"3881143367",
    "java.util.LinkedHashMap":"1551059846",
    "java.util.LinkedHashSet":"3628722029",
    "java.util.LinkedList":"1060625595",
    "java.util.Stack":"1031431137",
    "java.util.TreeMap":"1575826026",
    "java.util.TreeSet":"1002270346",
    "java.util.Vector":"3125574444"
    };
  }-*/;
  
  private static void raiseSerializationException(String msg) throws SerializationException {
    throw new SerializationException(msg);
  }
  
  public native void deserialize(SerializationStreamReader streamReader, Object instance, String typeSignature) throws SerializationException /*-{
    var methodTable = @cams.client.action.UserAction_TypeSerializer::methodMap[typeSignature];
    if (!methodTable) {
      @cams.client.action.UserAction_TypeSerializer::raiseSerializationException(Ljava/lang/String;)(typeSignature);
    }
    methodTable[1](streamReader, instance);
  }-*/;
  
  public native String getSerializationSignature(String typeName) /*-{
    return @cams.client.action.UserAction_TypeSerializer::signatureMap[typeName];
  }-*/;
  
  public native Object instantiate(SerializationStreamReader streamReader, String typeSignature) throws SerializationException /*-{
    var methodTable = @cams.client.action.UserAction_TypeSerializer::methodMap[typeSignature];
    if (!methodTable) {
      @cams.client.action.UserAction_TypeSerializer::raiseSerializationException(Ljava/lang/String;)(typeSignature);
    }
    return methodTable[0](streamReader);
  }-*/;
  
  public native void serialize(SerializationStreamWriter streamWriter, Object instance, String typeSignature) throws SerializationException /*-{
    var methodTable = @cams.client.action.UserAction_TypeSerializer::methodMap[typeSignature];
    if (!methodTable) {
      @cams.client.action.UserAction_TypeSerializer::raiseSerializationException(Ljava/lang/String;)(typeSignature);
    }
    methodTable[2](streamWriter, instance);
  }-*/;
  
}
