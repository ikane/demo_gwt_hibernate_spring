package cams.service;

import cams.client.action.IUser;
import cams.client.action.UserAction;
import cams.client.dto.UserDto;
import cams.dao.IUserDao;
import cams.service.domain.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 12.05.13
 * Time: 22:08
 */
@Service("userAction")
public class UserActionImpl extends RemoteServiceServlet implements UserAction {
    private final Log4JLogger logger = new Log4JLogger(UserActionImpl.class.getName());

    @Autowired
    private IUserDao dao;

    @Transactional
    public long createUser(String login, String phone) {
        try {
            logger.info("createUser start");
            getDao().createUser(login, phone);
            return 0;

        } catch (Exception ex) {
            logger.error("createUser", ex);
            return 0;
        }
    }
    @Transactional
    public void updateUser(int id, String login, String phone) {
        try {
            logger.info("updateUser start");
            getDao().updateUser(id, login, phone);
        } catch (Exception ex) {
            logger.error("updateUser", ex);
        }
    }
    @Transactional
    public void deleteUser(int id) {
        try {
            logger.info("deleteUser start");
            getDao().deleteUser(id);
        } catch (Exception ex) {
            logger.error("deleteUser", ex);

        }
    }
    @Transactional
    public List<? extends IUser> getAllUsers() {
        try {
            logger.info("allUser start");
            List<User> list = getDao().getAllUsers();
            List<UserDto> lst = new ArrayList<UserDto>(list.size());
            for (User us : list) {
                lst.add(Utils.convert(us));
            }
            return lst;
        } catch (Exception ex) {
            logger.error("allUser", ex);
            return new ArrayList<UserDto>();
        }
    }

    @Transactional
    public IUser getUsersByLogin(String login) {
        try {
            logger.info("getByLogin start");
            return Utils.convert(getDao().getUsersByLogin(login));
        } catch (Exception ex) {
            logger.error("getByLogin start", ex);
            return null;
        }
    }

    @Transactional
    public IUser getUsersById(int id) {
        try {
            return Utils.convert(getDao().getUsersById(id));
        } catch (Exception ex) {
            logger.error("Exception on get by Id", ex);
            return null;
        }
    }


    /**
     * This method returns list of ${@link cams.service.domain.User} by appropriate search key.
     * <p/>
     * The method should search by login, phone and partial matches.
     *
     * @param key search key
     * @return list of ${@link cams.service.domain.User}
     */
    @Transactional
    public List<? extends IUser> findByKey(String key) {
        try {
            List<User> list = getDao().findByKey(key);
            List<UserDto> lst = new ArrayList<UserDto>(list.size());
            for (User us : list) {
                lst.add(Utils.convert(us));
            }
            return lst;
        } catch (Exception ex) {
            logger.error("Error", ex);
            return new ArrayList<IUser>();
        }
    }

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }
}
