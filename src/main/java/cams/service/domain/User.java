package cams.service.domain;

import cams.client.action.IUser;

/**
 * User: Сергей
 * Date: 12.05.13
 * Time: 22:08
 */
public class User implements java.io.Serializable, IUser {
    private int id;
    private String login;
    private String phone;

    public User()
    {

    }

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
    public int compareTo(IUser iUser)
    {
        if (iUser!=null)
        {
            if (iUser.getId()==id)
            {
                return 0;
            }
            else
                if (iUser.getId()>id)
                    return 1;
        }
        return -1;
    }
}
