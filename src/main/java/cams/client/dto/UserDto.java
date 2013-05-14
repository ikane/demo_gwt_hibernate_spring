package cams.client.dto;

import cams.client.action.IUser;
import com.extjs.gxt.ui.client.data.BaseModel;
import com.extjs.gxt.ui.client.data.BaseModelData;
import com.extjs.gxt.ui.client.data.ModelData;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 13.05.13
 * Time: 10:47
 */
public class UserDto extends BaseModelData  implements IUser,Serializable {
    private int id;
    private String login;
    private String phone;

    @Override
    public int getId(){
        return id;
    }

    @Override
    public String getLogin(){
        return login;
    }

    @Override
    public String getPhone(){
        return phone;
    }

    @Override
    public void setId(int id){
        this.id=id;
    }

    @Override
    public void setLogin(String login){
        this.login=login;
    }

    @Override
    public void setPhone(String phone){
        this.phone=phone;
    }
}
