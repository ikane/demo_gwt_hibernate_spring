package cams.client.action;

import cams.client.dto.UserDto;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 12.05.13
 * Time: 22:09
 */
@RemoteServiceRelativePath("client/action/userAction")
public interface UserAction extends RemoteService {

    public long createUser(String login, String phone);

    public void updateUser(int id, String login, String phone);

    public void deleteUser(int id);

    public List<? extends IUser> getAllUsers();

    public IUser getUsersByLogin(String login);

    public IUser getUsersById(int id);


    /**

     * This method returns list of ${@link cams.service.domain.User} by appropriate search key.

     * The method should search by login, phone and partial matches.

     * @param key search key

     * @return list of ${@link cams.service.domain.User}

     */

    public List<? extends IUser> findByKey(String key);
}
