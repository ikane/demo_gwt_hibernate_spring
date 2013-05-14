package cams.dao;

import cams.service.domain.User;
import org.springframework.context.annotation.Bean;


import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 13.05.13
 * Time: 10:55
 */
public interface IUserDao {
    long createUser(String login, String phone) throws Exception;

    void updateUser(int id, String login, String phone) throws Exception;

    void deleteUser(int id) throws Exception;

    List<User> getAllUsers() throws Exception;

    User getUsersByLogin(String login) throws Exception;

    User getUsersById(int id) throws Exception;

    List<User> findByKey(String key) throws Exception;
}
