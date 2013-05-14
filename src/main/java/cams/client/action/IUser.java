package cams.client.action;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 13.05.13
 * Time: 7:59
 */
public interface IUser extends Serializable {

    int getId();

    String getLogin();

    String getPhone();

    void setId(int id);

    void setLogin(String login);

    void setPhone(String phone);
}
