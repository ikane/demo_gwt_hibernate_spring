package cams.client.action;

import cams.client.dto.UserDto;
import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 13.05.13
 * Time: 8:03
 */
public interface UserActionAsync {
    void createUser(String login, String phone, AsyncCallback<java.lang.Long> arg3);

    void deleteUser(int id, AsyncCallback<java.lang.Void> arg2);

    void findByKey(String key, AsyncCallback<List<? extends IUser>> arg2);

    void getAllUsers(AsyncCallback<List<? extends IUser>> arg1);

    void getUsersById(int id, AsyncCallback<IUser> arg2);

    void getUsersByLogin(String login, AsyncCallback<IUser> arg2);

    void updateUser(int id, String login, String phone, AsyncCallback<Void> arg4);
}
